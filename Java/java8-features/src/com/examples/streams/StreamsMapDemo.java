package com.examples.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapDemo {

	public static void main(String[] args) {
		List<Laptops> laptops = Laptops.fetchLaptops();
		
		System.out.println("----- Get all the brands and map to a list of strings -----");
		List<String> brands =  laptops.stream().map(laptop -> laptop.getBrand())
				.distinct()
				.collect(Collectors.toList());
		System.out.println(brands);
	
	}
}
