package com.example.microservice2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("microservice2")
public class Microservice2Controller {

	@Autowired
	private RestTemplate restTemplate;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping
	public String method2() {
		LOG.info("Inside method2");
		String response = null;
		response = restTemplate.getForObject("http://localhost:8083/microservice3", String.class);
		LOG.info("Response recived in method2 is: "+response);
		return response;
	}
}
