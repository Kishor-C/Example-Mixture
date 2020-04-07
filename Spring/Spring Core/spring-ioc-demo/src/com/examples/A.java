package com.examples;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class A implements InitializingBean, DisposableBean{

	private String message;
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() method");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("setMessage() method");
	}
	
}
