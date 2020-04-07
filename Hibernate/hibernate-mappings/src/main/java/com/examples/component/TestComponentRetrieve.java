package com.examples.component;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestComponentRetrieve {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtility.createSessionFactory();
		Session session = factory.openSession();
		Person person = session.get(Person.class, new Contact(123458, "david123"));
		System.out.println(person);
		session.close();
		factory.close();
	}
}
