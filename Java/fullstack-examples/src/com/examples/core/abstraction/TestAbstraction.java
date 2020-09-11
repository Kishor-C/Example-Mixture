package com.examples.core.abstraction;

interface Vehicle {
	void wheels();
	void mileage();
}
abstract class Bike implements Vehicle {
	public void wheels() {
		System.out.println("2 wheels");
	}
}
abstract class Car implements Vehicle {
	public void wheels() {
		System.out.println("4 wheels");
	}
}
class Pulsar extends Bike {
	public void mileage() {
		System.out.println("Pulsar mileage 40kmpl");
	}
}

class KTM extends Bike {
	public void mileage() {
		System.out.println("KTM mileage 35kmpl");
	}
}

class Swift extends Car {
	public void mileage() {
		System.out.println("Swift mileage 20kmpl");
	}
}
class Alto extends Car {
	public void mileage() {
		System.out.println("Alto mileage 25kmpl");
	}
}

public class TestAbstraction {

	public static void main(String[] args) {
		Vehicle v;
		v = new Pulsar();	v.mileage();	v.wheels();
		System.out.println("--------------------");
		v = new KTM();	v.mileage();	v.wheels();
		System.out.println("--------------------");
		v = new Swift();	v.mileage();	v.wheels();
		System.out.println("--------------------");
		v = new Alto();	v.mileage();	v.wheels();
		System.out.println("--------------------");

	}

}
