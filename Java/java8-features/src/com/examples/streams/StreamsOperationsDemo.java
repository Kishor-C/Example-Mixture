package com.examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsOperationsDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 5, 8, 8, 4, 5, 6, 7 ,8, 9, 10);
		System.out.println("----- Numbers that are even -----");
		numbers.stream().filter(i -> i % 2 == 0).forEach(System.out :: println);
		
		System.out.println("---- Getting Unique elements -----");
		numbers.stream().distinct().forEach(System.out::println);
		
		System.out.println("---- Truncating a stream which is no longer than given size ----");
		numbers.stream().distinct().limit(5).forEach(System.out :: println);
		
		
		System.out.println("---- Get streams of multiple of 10 ---");
		numbers.stream().distinct().map(x -> x * 10).forEach(System.out :: println);
		
		System.out.println("----- Total even numbers ------");
		long count = numbers.stream().filter(i -> i % 2 == 0).count();
		System.out.println("Count: "+count);
		
		System.out.println("----- Filter and add to new Collection -----");
		List<Integer> oddList = numbers.stream().filter(i -> i % 2 == 1).collect(Collectors.toList());
		System.out.println(oddList);	
	}

}
