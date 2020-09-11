package com.examples.core.fundamentals;
class Emp {
	String name;
	int age;
	double salary;
	Emp(String name, double salary) {
		this.name = name;
		this.salary = salary;
		System.out.println("Emp(String, double)");
	}
	Emp(String n, int age, double salary) {
		this(n,salary);//call to constructor must be in 1stLine
		this.age = age;	// it will  initialize the global var	
		System.out.println("Emp(String, int, double)");
	}
}
class TestThis {
	public static void main(String[] args) {
		Emp e1 = new Emp("A",50,50000);
		System.out.println(e1.name);	// name = A
		System.out.println(e1.age);	// age = 50
		Emp e2 = new Emp("B",60000);
		System.out.println(e2.name);	// name = B
	}
}