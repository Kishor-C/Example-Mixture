package com.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.model.beans.UserDetails;

@Repository(value = "jdbc")
public class UserDaoJdbcImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public int store(UserDetails user) {
		int status = 0;
		String query = "insert into user_details values(?, ?, ?, ?)";
		status = jdbc.update(query, 
				new Object[] {user.getName(), user.getUsername(), user.getPassword(), user.getGender()});
		return status;
	}

	@Override
	public UserDetails getUser(String username) {
		return jdbc.query("select * from user_details where username = ?", new Object[] {username}, (rs) -> {
			rs.next();
			return new UserDetails(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
		});
	}
	@Override
	public int updatePassword(String username, String password) {
		int status = 0;
		status = jdbc.update("update user_details set password = ? where username = ?", new Object[] {password, username});
		return status;
	}
	@Override
	public List<UserDetails> getAllUsers() {
		return jdbc.query("select * from user_details", rs -> {
			List<UserDetails> list = new ArrayList<UserDetails>();
			while(rs.next()) {
				list.add(new UserDetails(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}
			return list;
		});
	}
	@Override
	public int deleteUser(String username) {
		// TODO Auto-generated method stub
		return 0;
	}
}
