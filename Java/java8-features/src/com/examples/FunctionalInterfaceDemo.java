package com.examples;

import java.util.Comparator;
import java.util.TreeSet;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> set1 = new TreeSet<>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		
		TreeSet<Integer> set2 = new TreeSet<>((o1, o2) -> o2 -o1);
		
		set1.add(20);
		set2.add(30);
	}

}
