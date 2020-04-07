package com.examples.model.beans;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Profile {
	@Id
	@Column(name = "profile_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int profileId;
	
	private String name;
	
	@Column(name = "phone_number")
	private long phoneNumber;
	
	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;
	
	private String password;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "profileIdRef")
	private List<Contact> contactList;
	
	
	public List<Contact> getContactList() {
		return contactList;
	}
	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Profile() {
		super();
	}
	
	public Profile(int profileId, String name, long phoneNumber, LocalDate dateOfBirth, String password) {
		super();
		this.profileId = profileId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.password = password;
	}
	public Profile(int profileId, String name, long phoneNumber, LocalDate dateOfBirth) {
		super();
		this.profileId = profileId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
	}
	public int getProfileId() {
		return profileId;
	}
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
