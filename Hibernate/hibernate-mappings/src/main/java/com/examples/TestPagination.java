package com.examples;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.examples.component.HibernateUtility;
import com.examples.inheritance.Employee;
import com.examples.inheritance.Manager;
import com.examples.inheritance.Programmer;
import com.examples.inheritance.Tester;

public class TestPagination {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtility.createSessionFactory();
		Session session = factory.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the link value:");
		int linkValue = sc.nextInt();
		Query<Employee> query = session.createQuery("select e from Employee e");
		query.setFirstResult(linkValue);
		query.setMaxResults(10);
		List<Employee> list = query.getResultList();
		list.forEach(e -> System.out.println("Id = "+e.getEmpId()+", Name = "+e.getName()));
		sc.close();
		session.close();
		factory.close();
	}

}
