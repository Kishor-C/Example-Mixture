package com.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtility {
	public static Connection establishConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/connvertex", "root", "root");
		return connection;
	}
	
	public static void close(Connection con, Statement stmt, ResultSet rs) throws SQLException {
		if(rs != null) 
			rs.close();
		if(stmt!=null)
			stmt.close();
		if(con!=null)
			con.close();
	}
}
