package com.examples.core.inheritance;

class A {
	A() {
		System.out.println("A()");
	}
	A(int x) {
		this();
		System.out.println("A(int)");
	}
	void display() {
		System.out.println("display() in A");
	}
}
class B extends A {
	B() {
		System.out.println("B()");
	}
	B(int x, int y) {
		super(x);
		System.out.println("B(int, int)");
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		A a1 = new A();
		a1.display();
		System.out.println("--------------");
		B b1 = new B(200, 300);
		b1.display();
		System.out.println("----------------");
	}

}
