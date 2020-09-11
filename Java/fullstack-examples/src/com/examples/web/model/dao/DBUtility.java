package com.examples.web.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DBUtility {
	public static Connection getConnection() throws SQLException{
		Connection connection = null;
		try {
			Class.forName(Driver.class.getName());
			String url = "jdbc:mysql://localhost:3306/mydb";
			String user = "root";
			String password = "root";
			connection = DriverManager.getConnection(url, user, password);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			throw new SQLException("Driver class is not present in the classpath");
		} 
		return connection;
	}
	public static void closeConnection(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {
		if(resultSet != null)
			resultSet.close();
		if(statement != null) 
			statement.close();
		if(connection != null) 
			connection.close();
	}
}
