package com.examples.streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= 30; i++) {
			list.add(i);
		}
		System.out.println("--------- Sequential Stream -------------");
		list.stream().filter(i -> i % 2 == 0)
			.forEach(i -> System.out.println("i = "+i+", processed thread = "+Thread.currentThread().getName()));
		System.out.println("--------- Parallel Stream -------------");
		list.parallelStream().filter(i -> i % 2 == 0)
		.forEach(i -> System.out.println("i = "+i+", processed thread = "+Thread.currentThread().getName()));
	
		
	}
}
