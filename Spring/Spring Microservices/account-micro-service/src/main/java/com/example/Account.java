package com.example;

public class Account {
	private int accountNo;
	private double balance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accountNo, double balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
