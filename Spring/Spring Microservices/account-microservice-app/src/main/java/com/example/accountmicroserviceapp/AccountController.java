package com.example.accountmicroserviceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountController {
	
	@Autowired
	private AccountService accountService;

	// this takes only amount, but in real time it takes accountNumber & calls a business services 
	// that validates business functionalities and return the appropriate end result
	@GetMapping(value = "{amount}")
	public ResponseEntity<Object> debitApi(@PathVariable("amount") double amount) {
		return ResponseEntity.status(200).body(accountService.debit(amount));
	}
	
	@PostMapping
	public ResponseEntity<Object> creditApi(@RequestBody Transaction transaction) {
		return ResponseEntity.status(200).body(accountService.credit(transaction));
	}
}
