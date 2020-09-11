package com.examples.core.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestResultSet {
	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","tiger");
		PreparedStatement pstmt = con.prepareStatement("select name,age from employee",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
		/*
			when ResultSet has to be updated then the select query you are passing for
			preparing statement musn't contain * (no_of_columns)
		*/

		ResultSet rs = pstmt.executeQuery();
	
		while(rs.next()) {

			System.out.println("Name = "+rs.getString(1));
			System.out.println("Age = "+rs.getInt(2));
			System.out.println("==============");
			/*count++;
			if(count == 3) {
				rs.deleteRow();
			}*/
			
		}
		rs.moveToInsertRow();
		rs.updateString(1, "NewValue");
		rs.updateInt(2, 30);
	
		rs.insertRow();
		
		
		rs.close();
		pstmt.close();
		con.close();
	}
}
