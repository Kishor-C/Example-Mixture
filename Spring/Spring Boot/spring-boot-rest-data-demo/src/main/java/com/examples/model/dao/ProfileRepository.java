package com.examples.model.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.examples.model.beans.Profile;

public interface ProfileRepository extends CrudRepository<Profile, Integer>{
	@Query("select p from Profile p where p.profileId = ?1")
	Profile findProfile(int profileId);
	
	@Query("delete from Profile p where p.profileId = ?1")
	@Modifying
	void deleteProfile(int profileId);
	
}
