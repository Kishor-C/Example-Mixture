package com.example.accountmicroserviceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountMicroserviceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountMicroserviceAppApplication.class, args);
	}

}
