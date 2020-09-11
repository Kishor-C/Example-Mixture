package com.examples.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsNumbersForEachDemo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 4, 1, 2, 3);
		System.out.println("------ Using Lambda Expression -------");
		numbers.forEach(n -> System.out.println(n));
		System.out.println("------- Using Method reference ------");
		numbers.forEach(System.out :: println);
	}

}
