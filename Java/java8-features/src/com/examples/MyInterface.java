package com.examples;

public interface MyInterface {
	void method1();
	default void method2() {
		System.out.println("method2() Default Implementation");
	}
	default void method3() {
		System.out.println("method3 Default Implementation");
	}
	static void method4() {
		System.out.println("Static method Implementation");
	}
}


