package com.model.dao;

import java.util.List;

import com.model.beans.UserDetails;

public interface UserDao {
	public int store(UserDetails user);
	public UserDetails getUser(String username); 
	public int updatePassword(String username, String password);
	public int deleteUser(String username);
	public List<UserDetails> getAllUsers();
}
