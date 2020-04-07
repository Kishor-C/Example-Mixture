package com.examples.association.on2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.examples.component.HibernateUtility;

public class TestOne2OneStoring {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtility.createSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Customers customer = new Customers();
		customer.setName("Charles");
		Accounts account = new Accounts();
		account.setBalance(8000);
		account.setCustomer(customer);
		customer.setAccount(account);
		
		session.save(customer);
		
		transaction.commit();
		session.close();
		factory.close();
	}
}
