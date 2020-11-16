package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PropertiesController {

	@Autowired
	private ConfigService config;

	@GetMapping("/configurations")
	public String getProperties() {
		return config.toString();
	}
}
