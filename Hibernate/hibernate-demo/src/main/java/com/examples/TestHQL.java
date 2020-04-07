package com.examples;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class TestHQL {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtility.createSessionFactory();
		Session session = factory.openSession();
		
		Query<Object> query = session.createQuery("select u.userId, u.name, u.dob from Users u");
		List<Object> usersList = query.getResultList();
		for(Object obj : usersList) {
			Object[] o = (Object[])obj;
			System.out.println("Id = "+o[0]+", Name = "+o[1]+", Dob = "+o[2]);
			System.out.println("------------------------------");
		}
		session.close();
		factory.close();
	}

}
