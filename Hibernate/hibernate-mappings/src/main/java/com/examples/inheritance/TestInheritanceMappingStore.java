package com.examples.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.examples.component.HibernateUtility;

public class TestInheritanceMappingStore {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtility.createSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		// store employee
		Employee emp = new Employee();	emp.setEmpId(222);	emp.setName("Alexandar");	emp.setSalary(23000);
		session.save(emp);
		// store manager
		Manager mgr = new Manager();	mgr.setEmpId(333);	mgr.setName("Bruce");	mgr.setSalary(60000);
		mgr.setEmployeeCount(20);
		session.save(mgr);
		// store programmer
		Programmer prg = new Programmer();	prg.setEmpId(444);  prg.setName("Charles");  prg.setSalary(30000);
		prg.setTechnology("Java");
		session.save(prg);
		// store tester
		Tester tsr = new Tester();	tsr.setEmpId(555);  tsr.setName("David");   tsr.setSalary(28000);
		tsr.setTesterType("Manual");
		session.save(tsr);
		tx.commit();
		session.close();
		factory.close();
	}

}
