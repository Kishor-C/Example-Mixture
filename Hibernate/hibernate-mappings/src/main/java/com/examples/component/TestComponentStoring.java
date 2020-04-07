package com.examples.component;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestComponentStoring {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtility.createSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Contact contact1 = new Contact(123457, "david123");
		Contact contact2 = new Contact(123458, "david123");
		Person person1 = new Person(8, "David", contact1);
		Person person2 = new Person(9, "Edward", contact2);
		session.save(person1);
		session.save(person2);
		transaction.commit();
		session.close();
		factory.close();
	}
}
