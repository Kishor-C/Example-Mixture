package com.examples.web.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.examples.core.jdbc.DbUtility;
import com.examples.web.exception.InvalidCredentialsException;
import com.examples.web.exception.ProfileNotCreatedException;
import com.examples.web.model.beans.Profile;

public class ProfileDaoImpl implements ProfileDao {

	@Override
	public int store(Profile profile) throws ProfileNotCreatedException {
		int status = 0;
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = DBUtility.getConnection();
			statement = connection.prepareStatement("insert into profile(name, password, dob, phone) values(?, ?, ?, ?)");
			statement.setString(1, profile.getName());
			statement.setString(2, profile.getPassword());
			statement.setDate(3, Date.valueOf(profile.getDob()));
			statement.setLong(4, profile.getPhone());
			status = statement.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
			status = 0;
		} finally {
			try {
				DbUtility.close(connection, statement, null);
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		if(status == 0) {
			throw new ProfileNotCreatedException("Sorry Profile is not created, try again");
		}
		return status;
	}

	@Override
	public Profile login(int userId, String password) throws InvalidCredentialsException {
		Profile profile = null;
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtility.getConnection();
			statement = connection.prepareStatement("select * from profile where profile_id = ? and password = ?");
			statement.setInt(1, userId);
			statement.setString(2, password);
			resultSet = statement.executeQuery();
			while(resultSet.next()) {
				profile = new Profile();
				profile.setProfileId(resultSet.getInt("profile_id"));
				profile.setName(resultSet.getString("name"));
				profile.setDob(resultSet.getDate("dob").toLocalDate());
				profile.setPhone(resultSet.getLong("phone"));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
			profile = null;
		} finally {
			try {
				DbUtility.close(connection, statement, resultSet);
			} catch(SQLException e) {
				e.printStackTrace();
			}	
		}
		if(profile == null) {
			throw new InvalidCredentialsException("Sorry UserId or Password is wrong");
		}
		return profile;
	}

	
}
