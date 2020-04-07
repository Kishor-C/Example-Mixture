package com.examples.model.service;

import java.util.List;

import com.examples.api.ProfileNotFoundException;
import com.examples.model.beans.Contact;
import com.examples.model.beans.Profile;

public interface ProfileService {
	public Profile createProfile(Profile profile);
	public Profile getProfile(int profileId) throws ProfileNotFoundException;
	public Profile login(int profileId, String password) throws ProfileNotFoundException;
	public Profile updateProfilePassword(int profileId, String password) throws ProfileNotFoundException;
	public void deleteProfile(int profileId) throws ProfileNotFoundException;
	public List<Contact> getAllContacts(int profileId) throws ProfileNotFoundException;
}
