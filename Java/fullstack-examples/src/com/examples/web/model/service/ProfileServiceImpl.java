package com.examples.web.model.service;

import com.examples.web.exception.InvalidCredentialsException;
import com.examples.web.exception.ProfileNotCreatedException;
import com.examples.web.model.beans.Profile;
import com.examples.web.model.dao.ProfileDao;
import com.examples.web.model.factory.ObjectFactory;

public class ProfileServiceImpl implements ProfileService {

	ProfileDao dao = null;
	
	public ProfileServiceImpl() {
		dao = (ProfileDao)ObjectFactory.getInstace("dao");
	}
	
	@Override
	public int storeProfile(Profile profile) throws ProfileNotCreatedException {
		return dao.store(profile);
	}

	@Override
	public Profile login(int userId, String password) throws InvalidCredentialsException {
		// TODO Auto-generated method stub
		return dao.login(userId, password);
	}

}
