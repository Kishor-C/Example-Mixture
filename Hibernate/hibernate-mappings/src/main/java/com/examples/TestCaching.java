package com.examples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.examples.component.HibernateUtility;

public class TestCaching {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtility.createSessionFactory();
		Session session1 = factory.openSession();
		Session session2 = factory.openSession();
		Student student = session1.get(Student.class, 197);
		System.out.println("Roll No: "+student.getRollNo()+", Name: "+student.getName());
		
		Student student2 = session2.get(Student.class, 197);
		System.out.println("Roll No: "+student2.getRollNo()+", Name: "+student2.getName());
		
		session1.close();
		session2.close();
		factory.close();
	}
}
