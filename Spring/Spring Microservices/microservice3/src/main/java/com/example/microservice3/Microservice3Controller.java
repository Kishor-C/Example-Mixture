package com.example.microservice3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("microservice3")
public class Microservice3Controller {

	@Autowired
	private RestTemplate restTemplate;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping
	public String method3() {
		LOG.info("Inside method3");
		String response = null;
		response = restTemplate.getForObject("http://localhost:8084/microservice4", String.class);
		LOG.info("Response recived in method3 is: "+response);
		return response;
	}
}
