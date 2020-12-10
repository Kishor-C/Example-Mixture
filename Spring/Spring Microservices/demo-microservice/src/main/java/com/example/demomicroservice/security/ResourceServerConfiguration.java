package com.example.demomicroservice.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers(HttpMethod.GET,"/demo/**").hasAnyRole("USER", "ADMIN")
		.antMatchers(HttpMethod.POST, "/demo/**").hasRole("ADMIN")
		.antMatchers(HttpMethod.PUT, "/demo/**").hasRole("ADMIN")
		.antMatchers(HttpMethod.DELETE, "/demo/**").hasRole("ADMIN")
		.anyRequest().authenticated();
		
	}
		
}
