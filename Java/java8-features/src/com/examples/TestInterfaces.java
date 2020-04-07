package com.examples;

class Xyz implements Abc {
	@Override
	public void test1() {
		System.out.println("test1() implemented in Xyz");
	}	
	@Override
	public void test2() {
		System.out.println("test2() implemented in Xyz");
	}
}

public class TestInterfaces {
	public static void main(String[] args) {
		Abc a = new Xyz();
		a.test2();
		a.test1();
		Abc.test3();
	}
}
