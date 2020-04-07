package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.beans.UserDetails;
import com.model.dao.UserDao;
import com.model.dao.UserNotFoundException;
import com.model.service.UserServiceImpl;

@Controller
public class UserController {

	@Autowired
	private UserServiceImpl service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView openStoreForm() {
		ModelAndView mav = new ModelAndView("UserOperationForm", "user", new UserDetails());	
		return mav;
	}
	
	@RequestMapping(value = "/store", method = RequestMethod.POST)
	public ModelAndView processStore(@ModelAttribute("user") UserDetails userDetails) {
		int status = service.storeService(userDetails);
		// if status is 1 success else error page can be shown
		return new ModelAndView("StoreSuccess", "result", status);
	}
//	@RequestMapping(value = "/update", method = RequestMethod.POST) 
//	public ModelAndView processUpdate(@RequestParam("un") String username, @RequestParam("pw") String password) {
//		int status = dao.updatePassword(username, password);
//		return new ModelAndView("StoreSuccess", "result", status);
//	}
	@RequestMapping(value = "/search", method = RequestMethod.POST) 
	public ModelAndView processSearch(@RequestParam("user") String username) {
		ModelAndView mav = null;
		try {
			UserDetails user = service.getUserService(username);
			mav = new ModelAndView("UserPage", "result", user);
		} catch(UserNotFoundException unfe) {
			mav = new ModelAndView("errorPage", "error", unfe.getMessage());
		}
		return mav;
	}
//
	@RequestMapping(value = "/allUsers", method = RequestMethod.GET) 
	public ModelAndView processAllUsers() {
		
		return new ModelAndView("AllUsersPage", "allUsers", service.getAllUsersService());
	}
//	
}
