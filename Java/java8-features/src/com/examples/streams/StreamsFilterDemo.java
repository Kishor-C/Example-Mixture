package com.examples.streams;

import java.util.List;

public class StreamsFilterDemo {

	public static void main(String[] args) {
		List<Laptops> laptops = Laptops.fetchLaptops();
		
		System.out.println("Laptops that are < 5000");
		laptops.stream().filter(laptop -> laptop.getPrice() < 50000).forEach(System.out::println);
	
	}
}
