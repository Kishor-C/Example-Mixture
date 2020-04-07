package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {

	@Autowired
	private WalletService service;
	
	@GetMapping(value = "/wallet/{accountNo}")
	public Wallet addAmountApi(@PathVariable("accountNo") int accountNo) {
		Wallet wallet = service.addAmountToWallet(accountNo);
		return wallet;
	}
}
