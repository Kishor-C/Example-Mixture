package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class WalletService {

	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "addAmountToWalletFallBack")
	public Wallet addAmountToWallet(int accountNo) {
		Wallet wallet = new Wallet();
		// making use of Ribbon when multiple requests sent to multiple instances of Account-Micro-Service
		for(int i = 1; i < 10; i++) {
			new Thread(() -> {
				Account account = restTemplate.getForObject("http://ACCOUNT-MICRO-SERVICE/account/"+accountNo, Account.class);
				wallet.setBalance(account.getBalance() * 0.5);
			}).start();	
		}
		
		return wallet;
	}
	
	public Wallet addAmountToWalletFallBack(int accountNo) {
		Wallet wallet = new Wallet();
		return wallet;
	}
}
