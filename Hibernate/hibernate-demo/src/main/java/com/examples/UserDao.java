package com.examples;

import java.time.LocalDate;
import java.util.List;

public interface UserDao {
	public Users store(Users user);
	public Users login(int userId, String password) throws CredentialException;
	public Users updatePassword(int userId, String newPassword);
	public Users updateDOB(int userId, LocalDate dob);
	public Users getUser(int userId);
	
	public List<Users> getAllUsers();
}
