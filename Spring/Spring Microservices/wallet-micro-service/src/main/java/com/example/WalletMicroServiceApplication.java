package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class WalletMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletMicroServiceApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate rest(RestTemplateBuilder builder) {
		return builder.build();
	}
}
