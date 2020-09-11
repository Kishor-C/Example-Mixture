package com.examples.core.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	public int storeUser(Users user) {
		// 0 means not stored 1 means stored
		int status = 0;
		try {
			
			Connection connection = DbUtility.establishConnection();
			String query = "insert into users(name, dob, password) values (?, ?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, user.getName());
			preparedStatement.setDate(2, Date.valueOf(user.getDob()));
			preparedStatement.setString(3, user.getPassword());
			
			status = preparedStatement.executeUpdate();
			DbUtility.close(connection, preparedStatement, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public Users find(int id) throws UserNotFoundException {
		Users user = null;
		try {
			Connection connection = DbUtility.establishConnection();
			String query = "select * from users where user_id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				user = new Users();			
				user.setUserId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setDob(rs.getDate(3).toLocalDate());
				user.setPassword(rs.getString(4));
			}
			DbUtility.close(connection, preparedStatement, rs);
		} catch(Exception e) {
			e.printStackTrace();
		}
		if(user == null) 
			throw new UserNotFoundException("Sorry user with an id "+id+" not found");
		return user;
	}
	
	public List<Users> getAllUsers() {
		List<Users> list = new ArrayList<Users>();
		try {
			Connection connection = DbUtility.establishConnection();
			String query = "select * from users";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				Users user = new Users();			
				user.setUserId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setDob(rs.getDate(3).toLocalDate());
				user.setPassword(rs.getString(4));
				list.add(user);
			}
			rs.close();
			DbUtility.close(connection, preparedStatement, rs);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
