package com.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.model.beans.UserDetails;

public class SingleUserExtractor implements ResultSetExtractor<UserDetails> {

	@Override
	public UserDetails extractData(ResultSet rs) throws SQLException, DataAccessException {
		UserDetails user = new UserDetails();
		while(rs.next()) {
			user.setName(rs.getString(1));
			user.setUsername(rs.getString(2));
			user.setPassword(rs.getString(3));
			user.setGender(rs.getString(4));
		}
		return user;
	}

}
