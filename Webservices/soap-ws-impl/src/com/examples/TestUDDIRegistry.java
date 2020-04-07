package com.examples;

import javax.xml.ws.Endpoint;

public class TestUDDIRegistry {

	public static void main(String[] args) {
		Calculator calculator = new CalculatorImpl();
		Endpoint.publish("http://localhost:7878/calci", calculator);
		System.out.println("Object Registered!");
	}
}
