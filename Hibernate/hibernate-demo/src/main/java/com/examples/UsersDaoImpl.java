package com.examples;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class UsersDaoImpl implements UserDao {

	@Override
	public Users store(Users user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users login(int userId, String password) throws CredentialException {
		Users user = null;
		SessionFactory factory = HibernateUtility.createSessionFactory();
		Session session = factory.openSession();
		Users temp = session.get(Users.class, userId); // either you will get null or an object
		if(temp != null) {
			String pass = temp.getPassword();
			if(pass.equals(password)) {
				user = temp;
			}
		}
		session.close();
		factory.close();
		if(user == null) 
			throw new CredentialException();
		return user;
	}

	@Override
	public Users updatePassword(int userId, String newPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users updateDOB(int userId, LocalDate dob) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Users> getAllUsers() {
		List<Users> usersList = null;
		SessionFactory factory = HibernateUtility.createSessionFactory();
		Session session = factory.openSession();
		String HQL = "select u from Users u";
		Query<Users> query = session.createQuery(HQL, Users.class);
		usersList = query.getResultList(); // all the entities added into the list
		session.close();
		factory.close();
		return usersList;
	}
}
