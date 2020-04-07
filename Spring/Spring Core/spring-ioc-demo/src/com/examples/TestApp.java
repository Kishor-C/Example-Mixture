package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans5.xml");
		A a = (A) context.getBean("a1");
		((ClassPathXmlApplicationContext)context).close();
	}
}
