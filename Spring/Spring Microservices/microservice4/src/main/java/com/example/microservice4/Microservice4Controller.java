package com.example.microservice4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("microservice4")
public class Microservice4Controller {

	

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping
	public String method3() {
		LOG.info("Inside method4");
		
		return "Hello World";
	}
}
