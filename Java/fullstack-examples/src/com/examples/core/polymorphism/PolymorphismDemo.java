package com.examples.core.polymorphism;

class Calci {
	int add(int x, int y) {
		return (x + y);
	}
	double add(double x, double y) {
		return (x + y);
	}
}
class A {
	void display() {
		System.out.println("display() in A");
	}
}
class B extends A {
	void display() {
		System.out.println("display() in B");
	}
}
public class PolymorphismDemo {

	public static void main(String[] args) {
		Calci c = new Calci();
		double result = c.add(25.3, 23);
		System.out.println("Result = "+result);
		result = c.add(20, 30);
		System.out.println("Result = "+result);

		System.out.println("----------------------");
		A a; 
		a = new A();
		a.display();
		System.out.println("----------------------");
		a = new B();
		a.display();
	}

}
