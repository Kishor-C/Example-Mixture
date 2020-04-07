package com.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserService {

	private List<User> userDatabase = new ArrayList<User>();
	private UserDaoImpl dao = new UserDaoImpl();
	
	//store user
	public User storeUser(User user) {
		return dao.store(user);
	}
	//get All the users
	public List<User> getUsers() {
		return dao.getAllUsers();
	}
	// get user based on id
	public User getUserById(int id) {
		return dao.getUserById(id);
	}
	// delete the user by id
	public boolean deleteUser(int id) {
		boolean isDeleted = false;
		Iterator<User> it = userDatabase.iterator();
		while(it.hasNext()) {
			User user = it.next();
			if(user.getUserId() == id) {
				it.remove();
				isDeleted = true;
				break;
			}
		}
		return isDeleted;
	}
	// update password of an user
	public User updatePassword(int id, String password) {
		User user = getUserById(id);
		user.setPassword(password);
		return user;
	}
}
