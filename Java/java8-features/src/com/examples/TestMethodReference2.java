package com.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestMethodReference2 {
	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person("Bruce", 35), 
				new Person("Alex", 30), new Person("David", 25),  new Person("Charles", 22));
		
		for(Person p : list) {
			System.out.println("Name = "+p.getName()+", Age = "+p.getAge());
		}
		//Earlier you wrote your own comparator implementation
		Collections.sort(list, (p1, p2) -> p1.getName().compareTo(p2.getName()));
		System.out.println("-----------Comparison with Lambda Expression------------------");
		for(Person p : list) {
			System.out.println("Name = "+p.getName()+", Age = "+p.getAge());
		}
		Collections.sort(list, Person :: compareByAgeAsc);
		System.out.println("-----------Comparison with Method Reference------------------");
		for(Person p : list) {
			System.out.println("Name = "+p.getName()+", Age = "+p.getAge());
		}
	}
}
