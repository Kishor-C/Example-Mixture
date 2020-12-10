package com.example.springcloudconfigclientapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("config-client")
public class RestApi {
	
	@Autowired
	private Message message;
	
	@GetMapping
	public String fetchTitle() {
		return message.getTitle();
	}
}
