package com.examples.inheritance;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.examples.component.HibernateUtility;

public class TestInheritanceMappingRetrieve {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtility.createSessionFactory();
		Session session = factory.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id:");
		Employee employee = session.get(Employee.class, sc.nextInt());
		System.out.println("Name = "+employee.getName()+", Salary = "+employee.getSalary());
		if(employee instanceof Manager) {
			Manager manager = (Manager)employee;
			System.out.println("Employee Count: "+manager.getEmployeeCount());
		} 
		if(employee instanceof Programmer) {
			Programmer programmer = (Programmer)employee;
			System.out.println("Technology: "+programmer.getTechnology());
		}
		if(employee instanceof Tester) {
			Tester tester = (Tester)employee;
			System.out.println("Tester type: "+tester.getTesterType());
		}
		sc.close();
		session.close();
		factory.close();
	}

}
