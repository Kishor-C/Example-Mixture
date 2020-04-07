package com.examples.model.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examples.api.ProfileNotFoundException;
import com.examples.model.beans.Contact;
import com.examples.model.beans.Profile;
import com.examples.model.dao.ProfileRepository;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfileRepository profileDao;
	
	@Override
	@Transactional
	public Profile createProfile(Profile profile) {
		// Your User Defined Repository will have methods inherited from the Crud or JpaRepository 
		Profile createdProfile = profileDao.save(profile);
		return createdProfile;
	}
	@Override
	public Profile getProfile(int profileId) throws ProfileNotFoundException{
		Profile profile = profileDao.findProfile(profileId);
		if(profile == null) 
			throw new ProfileNotFoundException("Profile with an id "+profileId+" not found");
		return profile;
	}
	@Override
	public Profile login(int profileId, String password) throws ProfileNotFoundException {
		Profile profile = profileDao.findProfile(profileId);
		if(profile == null)
			throw new ProfileNotFoundException("Sorry Invalid Credentials");
		if(profile.getPassword().equals(password))
		return profile;
		else 
			throw new ProfileNotFoundException("Sorry Invalid Credentials");
	}
	@Override
	@Transactional
	public Profile updateProfilePassword(int profileId, String password) throws ProfileNotFoundException{
		Profile profile = profileDao.findProfile(profileId);
		profile.setPassword(password);
		Profile updatedProfile = profileDao.save(profile);
		return updatedProfile;
	}

	@Override
	@Transactional
	public void deleteProfile(int profileId) throws ProfileNotFoundException{
		profileDao.deleteProfile(profileId);
	}
	@Override
	public List<Contact> getAllContacts(int profileId) throws ProfileNotFoundException{
		Profile profile = getProfile(profileId);
		return profile.getContactList();
	}
	
}
