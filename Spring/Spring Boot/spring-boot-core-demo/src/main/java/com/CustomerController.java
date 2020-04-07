package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@RequestMapping(value = "/home", method =  RequestMethod.GET)
	public ModelAndView open() {
		service.testStore();
		return new ModelAndView("index", "message", "Hello Spring Boot");
	}
}
