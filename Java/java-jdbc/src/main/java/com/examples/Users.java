package com.examples;

import java.time.LocalDate;

public class Users {
	private int userId;
	private String name;
	private LocalDate dob;
	private String password;
	public Users(int userId, String name, LocalDate dob, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.dob = dob;
		this.password = password;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
