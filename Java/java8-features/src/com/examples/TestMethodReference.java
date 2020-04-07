package com.examples;

interface X { 
	void foo();
}
class Y { 
	static void test1() {
		System.out.println("test1 in Y");
	}
	void test2() {
		System.out.println("test2 in Y");
	}
}
class Z {
	static void demo1() {
		System.out.println("demo1 in Z");
	}
	void demo2() {
		System.out.println("demo2 in Z");
	}
}
public class TestMethodReference {

	public static void main(String[] args) {
		X x1 = Y :: test1;					invoke(x1);
		System.out.println("----------------");
		x1 = Z :: demo1;					invoke(x1);
		System.out.println("-------------------");
		Y y1 = new Y();
		x1 = y1 :: test2;					invoke(x1);
		Z z1 = new Z();
		System.out.println("---------------------");
		x1 = z1 :: demo2;					invoke(x1);
	}
	
	static void invoke(X x) {
		x.foo();
	}

}
