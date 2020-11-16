package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class ConfigService {

	@Value("${database.url: Hello URL}")
	private String url;
	
	@Value("${database.user: Hello User}")
	private String user;
	
	@Value("${database.password: Hello Password}")
	private String password;
	
	@Value("${title}")
	private String title;
	
	public String getUrl() {
		return url;
	}
	public String getUser() {
		return user;
	}
	public String getPassword() {
		return password;
	}
	public String getTitle() {
		return title;
	}
	@Override
	public String toString() {
		return "ConfigService [url=" + url + ", user=" + user + ", password=" + password + ", title=" + title + "]";
	}
	
	
}
