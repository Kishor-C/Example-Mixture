package com.examples.api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.examples.model.beans.Contact;
import com.examples.model.beans.Profile;
import com.examples.model.service.ContactService;
import com.examples.model.service.ProfileService;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*", 
methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class RestApi {

	@Autowired
	private ProfileService profileService;
	@Autowired
	private ContactService contactservice;
	

	@RequestMapping(value = "/profile/{id}", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getProfileAPI(@PathVariable("id") int profileId) {
		ResponseEntity<Object> response = null;
		try {
			Profile profile = profileService.getProfile(profileId);
			response = ResponseEntity.status(200).body(profile);
		} catch(ProfileNotFoundException e) {
			BodyContent responseBody = new BodyContent(e.getMessage(), 404);
			response = ResponseEntity.status(404).body(responseBody);
		}
		return response;
	}
	@RequestMapping(value = "/profile/{id}/{pw}", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> loginApi(@PathVariable("id") int profileId, @PathVariable("pw") String password) {
		ResponseEntity<Object> response = null;
		try {
			Profile profile = profileService.login(profileId, password);
			response = ResponseEntity.status(200).body(profile);
		} catch(ProfileNotFoundException e) {
			BodyContent responseBody = new BodyContent(e.getMessage(), 404);
			response = ResponseEntity.status(404).body(responseBody);
		}
		return response;
	}
	@RequestMapping(value = "/profile", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> createProfileAPI(@RequestBody Profile profile) {
		ResponseEntity<Object> response = null;
		Profile createdProfile = profileService.createProfile(profile);
		response = ResponseEntity.status(201).body(createdProfile);
		return response;
	}
	
	@RequestMapping(value = "/profile/{id}/{password}", method = RequestMethod.PUT,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> updatePasswordAPI(@PathVariable("id") int profileId, 
				@PathVariable("password") String password) {
		ResponseEntity<Object> response = null;
		try {
			Profile profile = profileService.updateProfilePassword(profileId, password);
			response = ResponseEntity.status(200).body(profile);
		} catch(ProfileNotFoundException e) {
			BodyContent responseBody = new BodyContent(e.getMessage(), 404);
			response = ResponseEntity.status(404).body(responseBody);
		}
		return response;
	}
	@RequestMapping(value = "/profile/{id}", method = RequestMethod.DELETE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> deleteProfileAPI(@PathVariable("id") int profileId) {
		ResponseEntity<Object> response = null;
		try {
			profileService.getProfile(profileId);
			profileService.deleteProfile(profileId);
			BodyContent responseBody = 
					new BodyContent("Profile with an id "+profileId+" deleted", 200);
			response = ResponseEntity.status(200).body(responseBody);
			
		} catch(ProfileNotFoundException e) {
			BodyContent responseBody = new BodyContent(e.getMessage(), 404);
			response = ResponseEntity.status(404).body(responseBody);
		}
		return response;
	}

	@RequestMapping(value = "/profile/{id}/addContact", 
			method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> addContactAPI(@PathVariable("id") int profileId, @RequestBody Contact contact) {
		ResponseEntity<Object> response = null;
		contact.setProfileIdRef(profileId);
		Contact createdContact = contactservice.addContact(contact);
		response = ResponseEntity.status(200).body(createdContact);
		return response;
	}
	
	@RequestMapping(value = "/profile/{id}/contacts", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getContactsAPI(@PathVariable("id") int profileId) {
		ResponseEntity<Object> response = null;
		try {
			List<Contact> allContacts = profileService.getAllContacts(profileId);
			response = ResponseEntity.status(200).body(allContacts);
		} catch(ProfileNotFoundException e) {
			BodyContent responseBody = new BodyContent(e.getMessage(), 404);
			response = ResponseEntity.status(404).body(responseBody);
		}
		return response;
	}
	
}
