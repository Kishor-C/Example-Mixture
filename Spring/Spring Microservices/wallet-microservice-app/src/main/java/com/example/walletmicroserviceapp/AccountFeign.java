package com.example.walletmicroserviceapp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("ACCOUNT-SERVICE/account")
public interface AccountFeign {
	
	@GetMapping(value = "{amount}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Transaction getAmount(double amount);
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Transaction addAmount(@RequestBody Transaction transaction);
}
