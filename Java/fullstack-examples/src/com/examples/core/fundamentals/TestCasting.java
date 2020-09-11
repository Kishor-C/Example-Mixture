package com.examples.core.fundamentals;
class Employee {
	void raiseSalary() {
		System.out.println("0%");
	}
}
class Manager extends Employee {
	void raiseSalary() {
		System.out.println("35%");
	}
	void testManager() {
		System.out.println("testManager");
	}
}
class Tester extends Employee {
	void raiseSalary() {
		System.out.println("20%");
	}
	void testTester() {
		System.out.println("testTester");
	}
}
class CheckType {
	void demo(Employee e) {
		e.raiseSalary();
		if(e instanceof Manager) {
			Manager m = (Manager)e;
			System.out.println("Manager conversion");
			m.raiseSalary();
		}
		if(e instanceof Tester) {
			Tester t = (Tester)e;
			t.raiseSalary();
			System.out.println("Tester converdsion");
		}
	}
}
class TestCasting {
	public static void main(String[] args) {
		Manager m = new Manager();
		Tester t = new Tester();
		CheckType c = new CheckType();
		c.demo(m);
		c.demo(t);
	}
}