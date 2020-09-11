package com.examples.core.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	public int storeEmployee(Employee employee) {
		int status = 0;
		Connection connection = null;
		PreparedStatement pstmt = null;
		try {
			connection = DbUtility.establishConnection();
			connection.setAutoCommit(false);
			String employeeInsert = "insert into employee values(?, ?, ?)";
			String addressInsert = "insert into address values(?, ?, ?)";
			pstmt = connection.prepareStatement(employeeInsert);
			pstmt.setInt(1, employee.getId());
			pstmt.setString(2, employee.getName());
			pstmt.setDouble(3, employee.getSalary());
			pstmt.executeUpdate();
			pstmt = connection.prepareStatement(addressInsert);
			pstmt.setInt(1, employee.getId());
			pstmt.setString(2,employee.getAddress().getState());
			pstmt.setString(3,employee.getAddress().getCity());
			status = pstmt.executeUpdate();
			if(status > 0) 
				connection.commit();
			DbUtility.close(connection, pstmt, null);
		} catch(Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return status;
	}
	
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		try {
			Connection con = DbUtility.establishConnection();
			String query = "select id,name,salary,state,city from employee join address on employee.id = address.eid";
			PreparedStatement pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Employee e = new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3));
				e.setAddress(new Address(rs.getString(1), rs.getString(2)));
				employees.add(e);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
				
		return employees;
	}
}
