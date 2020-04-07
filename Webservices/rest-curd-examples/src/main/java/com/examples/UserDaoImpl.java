package com.examples;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UserDaoImpl {
	public User store(User user) {
		SessionFactory sf = HibernateUtility.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		int id = (int)session.save(user);
		tx.commit();
		User createdUser = session.get(User.class, id);
		session.close();
		sf.close();
		return createdUser;
	}
	public User getUserById(int id) {
		SessionFactory sf = HibernateUtility.createSessionFactory();
		Session session = sf.openSession();
		User user = session.get(User.class, id);
		session.close();
		sf.close();
		return user;
	}
	public List<User> getAllUsers() {
		SessionFactory sf = HibernateUtility.createSessionFactory();
		Session session = sf.openSession();
		List<User> list = session.createQuery("select u from User u", User.class).getResultList();
		session.close();
		sf.close();
		return list;
	}
}
