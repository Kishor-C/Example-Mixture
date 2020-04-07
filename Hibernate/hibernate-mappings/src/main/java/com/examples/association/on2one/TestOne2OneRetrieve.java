package com.examples.association.on2one;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.examples.component.Contact;
import com.examples.component.HibernateUtility;
import com.examples.component.Person;

public class TestOne2OneRetrieve {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtility.createSessionFactory();
		Session session = factory.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer id");
		Customers customer = session.get(Customers.class, sc.nextInt());
		System.out.println("Hello, "+customer.getName()+", Your Customer Id is : "+customer.getCustomerId());
		System.out.println("Your Account#: "+customer.getAccount().getAccountNo());
		System.out.println("Your Balance: "+customer.getAccount().getBalance());
		
		System.out.println("*********Getting Customer information from Account number******************");
		
		System.out.println("Enter account number");
		Accounts accounts = session.get(Accounts.class, sc.nextInt());
		System.out.println("Account#: "+accounts.getAccountNo()+", Customer Name: "+accounts.getCustomer().getName());
		System.out.println("Balance: "+accounts.getBalance());
		sc.close();
		session.close();
		factory.close();
	}
}
