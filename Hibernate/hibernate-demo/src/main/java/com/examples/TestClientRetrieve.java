package com.examples;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestClientRetrieve {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure(); // by default hibernate.cfg.xml for other files you can pass the name
		SessionFactory sf = configuration.buildSessionFactory();
		Session s = sf.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		Users u = s.get(Users.class, sc.nextInt());
		System.out.println("Name = "+u.getName()+", Dob: "+u.getDob());
		s.close();
		sf.close();
		sc.close();
	}

}
