package com.example.springcloudconfigclientapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class SpringCloudConfigClientAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigClientAppApplication.class, args);
	}

}
