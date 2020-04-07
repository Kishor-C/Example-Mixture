package com.examples;

public interface Abc {
	void test1();
	default void test2() {
		System.out.println("test2() has default implementation");
	}
	static void test3() {
		System.out.println("test3() is static");
	}
}
