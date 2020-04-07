package com.examples.component;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Contact implements Serializable {
	private long phone;
	private String email;
	
	public Contact(long phone, String email) {
		super();
		this.phone = phone;
		this.email = email;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Contact [phone=" + phone + ", email=" + email + "]";
	}
	
	
}
