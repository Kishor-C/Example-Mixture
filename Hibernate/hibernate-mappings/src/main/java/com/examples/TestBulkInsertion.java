package com.examples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.examples.component.HibernateUtility;

public class TestBulkInsertion {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtility.createSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		for(int i = 100; i <= 200; i++) {
			Student student = new Student();
			student.setRollNo(i);
			student.setName("A"+i);
			session.save(student);  // entities state is in the persistence context
			if(i % 10 == 0) {
				session.flush();  // query is executed on the database but not committed
				session.clear();
				System.out.println("------------------------------");
			}
		}
		tx.commit();
		session.close();
		factory.close();
	}
}
