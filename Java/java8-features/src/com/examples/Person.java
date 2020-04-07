package com.examples;

public class Person {
	private String name;
	private int age;
	public Person() {
		super();
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	static int compareByNameAsc(Person p1, Person p2) {
		return p1.getName().compareTo(p2.getName());
	}
	static int compareByAgeAsc(Person p1, Person p2) {
		//return p1.getAge() - p2.getAge();
		return Integer.compare(p1.getAge(), p2.getAge());
	}
}
