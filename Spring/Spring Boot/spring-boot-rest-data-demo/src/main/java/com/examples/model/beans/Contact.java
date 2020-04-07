package com.examples.model.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "contact_id")
	private int contactId;
	@Column(name = "contact_name")
	private String contactName;
	@Column(name = "contact_no")
	private long contactNo;
	
	@Column(name = "profile_id_ref")
	private int profileIdRef;
	
	public int getProfileIdRef() {
		return profileIdRef;
	}
	public void setProfileIdRef(int profileIdRef) {
		this.profileIdRef = profileIdRef;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	
}
