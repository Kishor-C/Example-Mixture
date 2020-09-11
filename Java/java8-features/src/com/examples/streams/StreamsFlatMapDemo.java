package com.examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapDemo {

	public static void main(String[] args) {
		
		List<Integer> oddNumbers = Arrays.asList(1, 3, 5, 7, 9);
		List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8);
		List<Integer> primeNumbers = Arrays.asList(2, 3, 5, 7, 11, 13);
		List<List<Integer>> lists = Arrays.asList(oddNumbers, evenNumbers, primeNumbers);
		System.out.println("Before Flattening");
		System.out.println(lists);
		List<Integer> integerList = lists.stream().flatMap(n -> n.stream()).collect(Collectors.toList());
		System.out.println("After Flatening");
		System.out.println(integerList);
	
	}
}
