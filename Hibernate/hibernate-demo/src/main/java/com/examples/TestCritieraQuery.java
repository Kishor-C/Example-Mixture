package com.examples;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestCritieraQuery {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtility.createSessionFactory();
		Session session = factory.openSession();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<String> criteria =  builder.createQuery(String.class);
		Root<Employee> root = criteria.from(Employee.class);
		criteria.select(root.get("name"));
		
		List<String> employees = session.createQuery(criteria).getResultList();
		System.out.println(employees);
		session.close();
		factory.close();
	}
}
