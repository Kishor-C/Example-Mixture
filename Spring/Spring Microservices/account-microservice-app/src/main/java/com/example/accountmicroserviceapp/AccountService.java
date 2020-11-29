package com.example.accountmicroserviceapp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

	public Transaction debit(double amount) {
		// Here we assume that debit() method debits the amount and return the transaction
		Transaction transaction = new Transaction();
		transaction.setTransactionId(new Double(Math.random() * 123456).intValue());
		transaction.setAmount(amount);
		transaction.setDescription(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy'T'hh:mm:ss")));
		return transaction;
	}
}
