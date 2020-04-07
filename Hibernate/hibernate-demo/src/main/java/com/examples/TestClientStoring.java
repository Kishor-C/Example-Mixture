package com.examples;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestClientStoring {
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		Scanner sc = new Scanner(System.in);
		Users user = new Users();
		System.out.println("Enter id");
		user.setUserId(sc.nextInt());
		System.out.println("Enter name");
		user.setName(sc.next());
		System.out.println("Enter DOB in yyyy-MM-dd");
		user.setDob(LocalDate.parse(sc.next()));
		System.out.println("Enter password");
		//user.setPassword(sc.next());
		sc.close();
		// DAO code
		
		SessionFactory sf = HibernateUtility.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		int key = (int)session.save(user);
		tx.commit();
		session.close();
		sf.close();
		System.out.println("Stored and key generated: "+key);
	}
}
