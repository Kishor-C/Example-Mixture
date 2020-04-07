package com.examples.model.service;


import com.examples.model.beans.Contact;

public interface ContactService {
	public Contact addContact(Contact contact);
	public void deleteContact(int contactId, int profileId);
}
