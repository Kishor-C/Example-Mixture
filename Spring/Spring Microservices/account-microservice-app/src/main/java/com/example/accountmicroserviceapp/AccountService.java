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
		System.out.println("****** debit called *******");
		return transaction;
	}
	
	
	public Transaction credit(Transaction transaction) {
		transaction.setTransactionId(11234);
		transaction.setAmount(transaction.getAmount() + 2000);
		System.out.println("---- Amount  credit to the account balance is: "+transaction.getAmount()+"-----------");
		return transaction;
	}
}
