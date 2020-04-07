package com.model.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class UserDetails {
	private String name;
	@Id
	private String username;
	private String password;
	private String gender;
	
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDetails(String name, String username, String password, String gender) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
