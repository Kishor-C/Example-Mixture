package com.examples.web.model.dao;

import com.examples.web.exception.InvalidCredentialsException;
import com.examples.web.exception.ProfileNotCreatedException;
import com.examples.web.model.beans.Profile;

public interface ProfileDao {
	public int store(Profile profile) throws ProfileNotCreatedException;
	public Profile login(int userId, String password) throws InvalidCredentialsException;
}
