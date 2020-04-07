package com.examples.model.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.examples.model.beans.Users;

public class UserDaoImpl {
	public List<Users> findAllUsers(int phone) {
		SessionFactory factory = HibernateUtility.createSessionFactory();
		Session session = factory.openSession();
		String hql = "select u from Users u where u.phoneNumber like '"+phone+"%'";
		Query<Users> query = session.createQuery(hql, Users.class);
		List<Users> allUsers = query.getResultList();
		session.close();
		factory.close();
		return allUsers;
	}
}
