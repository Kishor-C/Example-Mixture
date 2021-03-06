package com.example.oauthservicejwt;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAuthorizationServer
@EnableResourceServer
public class OauthServiceJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthServiceJwtApplication.class, args);
	}

	@RequestMapping(value = "user", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, Object> user(OAuth2Authentication user) {
		Map<String, Object> userInfo = new HashMap<String, Object>();
		userInfo.put("user", user.getUserAuthentication().getPrincipal());
		userInfo.put("authorities", AuthorityUtils.authorityListToSet(user.getUserAuthentication().getAuthorities()));
		return userInfo;
	}
}
