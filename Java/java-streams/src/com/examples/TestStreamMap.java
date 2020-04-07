package com.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class TestStreamMap {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
				new Employee(500, "Alex", 35000.0, "Finance"),
				new Employee(600, "Charles", 25000.0, "Sales"),
				new Employee(700, "David", 25000.0, "Finance"),
				new Employee(400, "Bruce", 85000.0, "Sales"),
				new Employee(900, "Edward", 85000.0, "Account")
				);
		Map<String, List<Employee>> map = list.stream()
				.collect(Collectors.groupingBy((Employee e) -> e.getDesig()));
		System.out.println(map);
	}
}
