package com.controller;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.controller.beans.Login;
import com.controller.beans.Product;

@Controller
public class MainController {

	@RequestMapping(value = "/showProducts", method = RequestMethod.GET)
	public ModelAndView showProducts() {
		List<Product> productsList = Arrays.asList(new Product("Laptop", 45000, 3), new Product("Mobile", 25000, 10));
		ModelAndView mav = new ModelAndView("showProducts", "products", productsList);
		return mav;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showForm() {
		ModelAndView mav = new ModelAndView("loginForm", "login", new Login());
		return mav;
	}

	@RequestMapping(value = "/greet", method = RequestMethod.GET)
	public ModelAndView helloPageWithData() {
		ModelAndView mav = new ModelAndView("welcome", "time", LocalDateTime.now());
		return mav;
	}
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ModelAndView authenticateUser(@ModelAttribute("login") Login loginBean) {
		// you must have a logic to access business service
		ModelAndView mav = new ModelAndView("showData", "bean", loginBean);
		return mav;
	}
	
	
}
