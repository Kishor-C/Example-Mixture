package com.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class B {
	
	@Autowired
	private A a;
	
	@Value(value = "25")
	private int x;
	
	public void testB() {
		//a.testA();
		System.out.println("testB() is called");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}
