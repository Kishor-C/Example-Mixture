package com.examples;

import java.util.HashSet;
import java.util.Set;

public class GenericsDemo {

	public static void main(String[] args) {
		Set<String> stringSet = new HashSet<String>();
		stringSet.add("Hello");
		stringSet.add("Welcome");
		stringSet.add("Bye");
		for(String set : stringSet) {
			System.out.println(set);
		}
	}
}
