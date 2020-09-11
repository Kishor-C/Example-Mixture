package com.examples.core.jdbc;

import java.sql.*;
public class TestJDBC
{
	public static void main(String[] args) throws Exception
	{
		String driver = "org.apache.derby.jdbc.EmbeddedDriver";
		String url = 
			"jdbc:derby://localhost:1527/simpledb";

		//1) Loading the jdbc driver
		Class.forName(driver);
		//2) Establish Connection 
		Connection con = 
			DriverManager.getConnection(url,"user2","1234");			System.out.println("Connected : "+con);

		//3) Create Statement object
		Statement stmt = con.createStatement();
		//4) Execute the Query
		String query = "insert into emp values('Rahul',44)";
		int count = stmt.executeUpdate(query);
		System.out.println(count + " rows updated");
		//5) Closing the resources
		stmt.close();		con.close();
	}
}