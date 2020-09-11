package com.examples.streams;

import java.util.List;

public class StreamsLimitDemo {

	public static void main(String[] args) {
		List<Laptops> laptops = Laptops.fetchLaptops();
		
		System.out.println("--- Show only 5 laptops ----");
		laptops.stream().limit(5).forEach(System.out::println);
	}

}
