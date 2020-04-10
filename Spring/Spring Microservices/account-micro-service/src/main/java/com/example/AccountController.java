package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@GetMapping("/account/{accountNo}")
	public Account getBalance(@PathVariable("accountNo") int accountNo) {
		// must have a service instance method invocation
		System.out.println("getBalance() called");
		Account account = new Account(accountNo, accountNo * 31);
		return account;
	}
}
