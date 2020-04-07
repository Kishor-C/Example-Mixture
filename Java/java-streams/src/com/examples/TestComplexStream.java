package com.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestComplexStream {
	public static void main(String[] args) {
		List<Items> allItems = Arrays.asList(
				new Items("FrenchFries", 40.0, "OTHERS"),
				new Items("FriedRice", 50.0, "Rice"),
				new Items("JeeraRice", 45.0, "Rice"),
				new Items("CurdRice", 40.0, "Rice"),
				new Items("Chicken", 80.0, "Nonveg"),
				new Items("Fish", 90.0, "Nonveg"),
				new Items("Prawns", 70.0, "Nonveg")
				);
		String allNames = allItems.stream().map(item -> item.getName()).collect(Collectors.joining());
		System.out.println("Items: "+allNames);
		allNames = allItems.stream().map(item -> item.getName()).collect(Collectors.joining(", "));
		System.out.println("Items: "+allNames);
	}
}
