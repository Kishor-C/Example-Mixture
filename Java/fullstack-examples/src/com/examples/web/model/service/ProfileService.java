package com.examples.web.model.service;

import com.examples.web.exception.InvalidCredentialsException;
import com.examples.web.exception.ProfileNotCreatedException;
import com.examples.web.model.beans.Profile;

public interface ProfileService {
	public int storeProfile(Profile profile) throws ProfileNotCreatedException;
	public Profile login(int userId, String password) throws InvalidCredentialsException;
}
