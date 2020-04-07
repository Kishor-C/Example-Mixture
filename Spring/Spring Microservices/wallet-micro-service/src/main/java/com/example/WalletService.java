package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Service
public class WalletService {

	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "addAmountToWalletFallBack"
			)
	public Wallet addAmountToWallet(int accountNo) {
		Wallet wallet = new Wallet();
		Account account = restTemplate.getForObject("http://ACCOUNT-MICRO-SERVICE:8083/account/"+accountNo, Account.class);
		wallet.setBalance(account.getBalance() * 0.5);
		return wallet;
	}
	
	public Wallet addAmountToWalletFallBack(int accountNo) {
		Wallet wallet = new Wallet();
		return wallet;
	}
}
