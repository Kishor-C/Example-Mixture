package com.examples.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examples.model.beans.Contact;
import com.examples.model.dao.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactDao;
	
	@Override
	@Transactional
	public Contact addContact(Contact contact) {
		// throw a user-defined checked exception
		if(contact.getProfileIdRef() == 0)
			throw new RuntimeException("Profile Id is missing");
		return contactDao.save(contact);
	}

	@Override
	public void deleteContact(int contactId, int profileId) {
		
	}

}
