package com.example.walletmicroserviceapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wallet")
public class WalletController {
	
	@Autowired
	private WalletService walletService;
	
	@GetMapping("{amount}")
	public ResponseEntity<Object> addMoney(@PathVariable("amount") double amount) {
		return ResponseEntity.status(200).body(walletService.addAmountToWallet(amount));
	}
}
