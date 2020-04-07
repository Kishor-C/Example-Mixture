package com.examples.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.examples.model.beans.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

	@Modifying
	@Query("delete from Contact c where c.contactId = ?1 and c.profileIdRef = ?2")
	public void deleteContactByProfileId(int contactId, int profileId);
}
