package com.examples.association.many2many;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.examples.component.HibernateUtility;

public class TestManyToManyEnrollStudent {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtility.createSessionFactory();
		Session session = factory.openSession();
		Scanner sc = new Scanner(System.in);
		
		Course java = session.get(Course.class, 1004);
		Course angular = session.get(Course.class, 1005);
		
		List<Course> list = new ArrayList<>();
		list.add(java);
		list.add(angular);
		
		Student student = new Student();
		System.out.println("Enter name");
		student.setName(sc.next());
		student.setCourses(list);
		Transaction tx = session.beginTransaction();
		session.save(student);
		tx.commit();
		
		sc.close();
		session.close();
		factory.close();
	}

}
