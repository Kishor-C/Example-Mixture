package com.example.walletmicroserviceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class WalletService {

	@Autowired
	private RestTemplate restTemplate;
	
	
	@CircuitBreaker(name = "walletService" , fallbackMethod = "buildFallbackWallet" )
	public Wallet addAmountToWallet(double amount) {
		System.out.println("--- trying to add amount to wallet ----");
		Transaction transaction = null;
		//randomlyRunLong();
		transaction = restTemplate.getForObject("http://ACCOUNT-SERVICE/account/"+amount, Transaction.class);
		Wallet myWallet = new Wallet(1111, transaction.getAmount() + 5000);
		return myWallet;
	}
	
	public Wallet buildFallbackWallet(double amount, Throwable t) {
		System.err.println("---- Inside the fall back -----"+t.toString());
		Wallet myWallet = new Wallet(1111, 5000);
		return myWallet;
	}
	
}
