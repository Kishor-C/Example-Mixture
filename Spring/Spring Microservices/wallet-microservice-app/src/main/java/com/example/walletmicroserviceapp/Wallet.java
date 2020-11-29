package com.example.walletmicroserviceapp;

public class Wallet {
	private int walletNumber;
	private double balance;
	public Wallet(int walletNumber, double balance) {
		super();
		this.walletNumber = walletNumber;
		this.balance = balance;
	}
	public Wallet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getWalletNumber() {
		return walletNumber;
	}
	public void setWalletNumber(int walletNumber) {
		this.walletNumber = walletNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
