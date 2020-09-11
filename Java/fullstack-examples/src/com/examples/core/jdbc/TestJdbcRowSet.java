package com.examples.core.jdbc;




import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class TestJdbcRowSet {

	public static void main(String[] args) throws Exception {
		JdbcRowSet crs = RowSetProvider.newFactory().createJdbcRowSet();
		crs.setUrl("jdbc:oracle:thin:@localhost:1521/xe");
		crs.setUsername("system");
		crs.setPassword("tiger");
		crs.setCommand("select * from employee");
		crs.execute();
		while(crs.next()) {
			System.out.println("Name = "+crs.getString(1));
			System.out.println("Age = "+crs.getInt(2));
		}
		
		
		
	
	}

}
