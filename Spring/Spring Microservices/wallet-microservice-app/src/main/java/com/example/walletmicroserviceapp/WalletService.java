package com.example.walletmicroserviceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@Service
public class WalletService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private AccountFeign accountFeign;
	
	//@CircuitBreaker(name = "walletService" , fallbackMethod = "buildFallbackWallet" )
	@Retry(name = "retryService", fallbackMethod = "buildRetryFallbackService")
	public Wallet addAmountToWallet(double amount) {
		System.out.println("--- trying to add amount to wallet ----");
		Transaction transaction = null;
		//randomlyRunLong();
		transaction = restTemplate.getForObject("http://ACCOUNT-SERVICE/account/"+amount, Transaction.class);
		//transaction = accountFeign.getAmount(amount);
		Wallet myWallet = new Wallet(1111, transaction.getAmount() + 5000);
		return myWallet;
	}
	
	public Wallet buildFallbackWallet(double amount, Throwable t) {
		System.err.println("---- Inside the fall back -----"+t.toString());
		Wallet myWallet = new Wallet(1111, 5000);
		return myWallet;
	}
	public Wallet buildRetryFallbackService(Throwable t) {
		System.err.println(":::::::::Retrying Fallback called:::::::"+t.toString());
		return new Wallet(0, 0);
	}
	
	@CircuitBreaker(name = "debitFromWalletService", fallbackMethod = "buildFallbackDebitFromWallet")
	public Wallet debitAmountFromWallet(double amount) {
		System.out.println("---- trying to debit from wallet ------");
		Transaction transaction = new Transaction();
		transaction.setAmount(amount);
		transaction.setDescription("adding amount "+amount);
		restTemplate.postForObject("http://ACCOUNT-SERVICE/account/", transaction, Transaction.class);
		//accountFeign.addAmount(transaction);
		Wallet wallet = new Wallet();
		wallet.setWalletNumber(12235);
		wallet.setBalance(20000 - amount);
		return wallet;
	}
	public Wallet buildFallbackDebitFromWallet(double amount, Throwable t) {
		System.err.println("---- Inside the fall back Debit -----"+t.toString());
		Wallet myWallet = new Wallet(1111, 5000);
		return myWallet;
	}
}
