package com.example.demomicroservice;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class MyResource {

	@PostMapping(value = "store")
	public String storeApi() {
		return "Welcome User, store is called";
	}

	@GetMapping(value = "fetch")
	public String fetch() {
		return "Welcome User, fetch is called";
	}
	
	@PutMapping(value = "update")
	public String updateApi() {
		return "Welcome User, update is called" ;
	}
	
	@DeleteMapping(value = "delete")
	public String delete() {
		return "Welcome User, delete is called";
	}
	
		
}
