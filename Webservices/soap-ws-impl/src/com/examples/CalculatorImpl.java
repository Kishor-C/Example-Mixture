package com.examples;

import javax.jws.WebService;

@WebService(endpointInterface = "com.examples.Calculator")

public class CalculatorImpl implements Calculator {
	@Override
	public int add(int x, int y) {
		System.out.println("add() is called");
		return (x + y);
	}
	@Override
	public int sub(int x, int y) {
		System.out.println("sub() is called");
		return x - y;
	}
}
