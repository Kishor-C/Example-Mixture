package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ExternaConfigClientApp4Application {

	@Value("${user.name}")
	private String user;
	@Value("${user.role}")
	private String role;
	
	public static void main(String[] args) {
		SpringApplication.run(ExternaConfigClientApp4Application.class, args);
	}
	
	
	@GetMapping("/")
	public String getMessage() {
		return "Hello "+user+", you are a "+role;
	}

}
