package com.examples;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List<User> list = new ArrayList<User>();
		list.add(new User(1, "Alex", 23));
		list.add(new User(1, "Alex", 23));
		System.out.println("Size: "+list.size());
	}
}
