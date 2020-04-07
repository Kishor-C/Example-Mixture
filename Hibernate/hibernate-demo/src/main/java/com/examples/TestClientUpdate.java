package com.examples;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestClientUpdate {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id:-");
		int id = sc.nextInt();
		
		SessionFactory sf = HibernateUtility.createSessionFactory();
		Session session = sf.openSession();
		Users user = session.get(Users.class, id);
		
		if(user != null) {
			Transaction tx = session.beginTransaction();
			session.delete(user);
			tx.commit();
		} else {
			System.err.println("Sorry user with an id: "+id+" doesn't exist");
		}
		sc.close();
		session.close();
		sf.close();
	}
}
