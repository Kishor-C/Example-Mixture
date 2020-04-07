package com.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestSorting {
	public static void main(String[] args) {
		
		// anonymous class
		
		Comparator<User> compareByIdAsc = (o1, o2) -> o1.getUserId() - o2.getUserId();
		Comparator<User> compareByIdDesc = (o1 , o2) -> o2.getUserId() - o1.getUserId();
		Comparator<User> compareByAgeDesc = (x, y) -> y.getAge() - x.getAge();
		Comparator<User> compareByAgeAsc = (x, y) -> x.getAge() - y.getAge();
		
		List<User> list = new ArrayList<User>();
		list.add(new User(1, "Alex", 23));
		list.add(new User(2, "Bruce", 20));
		list.add(new User(5, "David", 30));
		list.add(new User(4, "Charles", 50));
		list.add(new User(3, "Edward", 40));
		System.out.println("Before Sorting");
		for(User user : list) {
			System.out.println(user);
		}
		Collections.sort(list, (o1, o2) -> o2.getUserId() - o1.getUserId());

		System.out.println("After Sorting");
		for(User user : list) {
			System.out.println(user);
		}
	}
}
