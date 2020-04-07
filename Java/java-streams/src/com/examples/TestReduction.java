package com.examples;

import java.util.Arrays;
import java.util.List;

public class TestReduction {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 15, 25, 5, 35, 45);
		list.stream()
		.forEach(x -> System.out.println(x + " Processed by "+Thread.currentThread().getName()+" thread"));
		System.out.println("--------------------------------");
		list.parallelStream()
		.forEach(x -> System.out.println(x +" Processed by "+Thread.currentThread().getName()+" thread"));
	}
}
