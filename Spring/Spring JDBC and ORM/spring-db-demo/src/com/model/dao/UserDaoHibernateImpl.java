package com.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.model.beans.UserDetails;

@Repository(value = "hibernate")
public class UserDaoHibernateImpl implements UserDao {

	@Autowired
	private HibernateTemplate template;
	
	@Override
	public int store(UserDetails user) {
		String str = (String)template.save(user);
		return str != null ? 1 : 0;
	}

	@Override
	public UserDetails getUser(String username) {
		
		return template.get(UserDetails.class, username);
	}

	@Override
	public List<UserDetails> getAllUsers() {
		return (List<UserDetails>) template.find("select u from UserDetails u");
		
	}
	@Override
	public int updatePassword(String username, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(String username) {
		// TODO Auto-generated method stub
		return 0;
	}


}
