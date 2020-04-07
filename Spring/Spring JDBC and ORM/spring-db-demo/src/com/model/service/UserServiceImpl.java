package com.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.model.beans.UserDetails;
import com.model.dao.UserDao;
import com.model.dao.UserNotFoundException;

@Service
public class UserServiceImpl {

	@Autowired
	@Qualifier(value = "hibernate")
	private UserDao dao;
	
	@Transactional
	public int storeService(UserDetails userDetails) {
		int status = dao.store(userDetails);
		return status;
	}
	
	public List<UserDetails> getAllUsersService() {
		return dao.getAllUsers();
	}
	
	public UserDetails getUserService(String username) throws UserNotFoundException {
		UserDetails user = dao.getUser(username);
		if(user == null) 
			throw new UserNotFoundException("Sorry Username: "+username+" is not found");
		return user;
	}
}
