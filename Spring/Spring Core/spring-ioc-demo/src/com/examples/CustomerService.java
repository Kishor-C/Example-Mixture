package com.examples;

public class CustomerService {
	
	private CustomerDao customerDao;
	private AccountDao accountDao;
	
	public void storeCustomer() {
		customerDao.storeCustomer();
		accountDao.createAccount();
	}
	
	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	
}
