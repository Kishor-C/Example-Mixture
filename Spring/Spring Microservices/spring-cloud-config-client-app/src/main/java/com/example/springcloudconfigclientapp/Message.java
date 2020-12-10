package com.example.springcloudconfigclientapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
public class Message {

	@Value("${title: Hello Default Title}")
	private String title;

	public String getTitle() {
		return title;
	}
	
}
