package com.example.walletmicroserviceapp;

public class Transaction {
	private long transactionId;
	private double amount;
	private String description;
	public Transaction(long transactionId, double amount, String description) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.description = description;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
