package com.examples.model.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {

	@Id
	private int userId;
	private String name;
	private String password;
	private long phoneNumber;
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Users(int userId, String name, String password, long phoneNumber) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.phoneNumber = phoneNumber;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
