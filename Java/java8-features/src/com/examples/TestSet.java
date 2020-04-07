package com.examples;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Set<User> set1 = new HashSet<User>();
		
		for(int i = 1; i < 50000; i++) {
			System.out.println("Object Numbers: = "+i);
			User user = new User(i, "Name "+i, 23);
			set1.add(user);
		}
		System.out.println("User Size: "+set1.size());
	}
}
