package com.examples.core.jdbc;


import javax.sql.rowset.*;
public class TestRowSets
{
	public static void main(String[] args) throws Exception
	{
		JdbcRowSet jrs = 
			RowSetProvider.newFactory().createJdbcRowSet();
		jrs.setUrl("jdbc:derby://localhost:1527/simpledb");
		jrs.setUsername("user2"); // copy the url and username
		jrs.setPassword("1234"); // from your previous program

		jrs.setCommand("select * from emp");
		jrs.execute();

		while(jrs.next())
		{
			System.out.println("Name = "+jrs.getString(1));
			System.out.println("Age = "+jrs.getInt(2));
			System.out.println("===========");
		}
	}
}
	/*
		DatabaseMetaData db = con.getMetaData()
		ResultSetMetaData rd = rs.getMetaData()
	*/