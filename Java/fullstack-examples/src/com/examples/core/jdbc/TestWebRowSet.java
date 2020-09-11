package com.examples.core.jdbc;

import java.io.FileInputStream;

import javax.sql.rowset.WebRowSet;

import com.sun.rowset.WebRowSetImpl;

public class TestWebRowSet {

	public static void main(String[] args) throws Exception {
		/*
		WebRowSet wrs = new WebRowSetImpl();
		
		wrs.setUrl("jdbc:oracle:thin:@localhost:1521/xe");
		wrs.setUsername("system");
		wrs.setPassword("tiger");
		wrs.setCommand("select * from employee");
		wrs.execute();
	
		FileOutputStream fos = new FileOutputStream("employees.xml");
		wrs.writeXml(fos);;
		System.out.println("done....");
		*/
		
		WebRowSet wrs2 = new WebRowSetImpl();
		wrs2.readXml(new FileInputStream("employees.xml"));
		
		while(wrs2.next()) {
			System.out.println("Name = "+wrs2.getString(1));
			System.out.println("Age = "+wrs2.getInt(2));
			System.out.println("------------------------------");
		}
		
		wrs2.close();

	}

}
