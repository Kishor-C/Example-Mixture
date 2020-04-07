package com.examples.association.on2one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Accounts {

	@Id
	@Column(name = "account_no")
	private int accountNo;
	private double balance;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_ref")
	private Customers customer;

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

	public Customers getCustomer() {
		return customer;
	}

	public void setCustomer(Customers customer) {
		this.customer = customer;
	}
	
	
}
