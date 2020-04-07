package com.examples.association.on2one;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.examples.component.HibernateUtility;

public class TestOne2OneDeleting {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtility.createSessionFactory();
		Session session = factory.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number");
		Accounts accounts= session.get(Accounts.class, sc.nextInt());
		Transaction transaction = session.beginTransaction();
		session.delete(accounts);
		transaction.commit();
		sc.close();
		session.close();
		factory.close();
	}
}
