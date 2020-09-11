package com.examples.core.collections;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<>(new Student.SortByName());
		TreeSet<String> ts2 = new TreeSet<>();

		ts.add(new Student(105, "Bob", "A"));
		ts.add(new Student(106, "Alex", "B"));
		ts.add(new Student(104, "Charles", "C"));
		ts.add(new Student(103, "David", "B"));			// add method will call compare method of SortByName() to sort
	
		ts2.add("Rahul");
		ts2.add("Ajay");
		ts2.add("Bravo"); // add method will call compareTo of String class to sort
		System.out.println("Set of Strings: "+ts2);
		for(Student s : ts) {
			System.out.println(s);
		}
	}

}
