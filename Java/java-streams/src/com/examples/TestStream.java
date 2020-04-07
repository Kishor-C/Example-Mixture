package com.examples;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class TestStream {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(10, 50, 20, 25);
		List<Integer> list2 = Arrays.asList(90, 40, 10, 25);
		List<Integer> list3 = Arrays.asList(10, 60, 30, 25);
		
		List<List<Integer>> allLists = Arrays.asList(list1, list2, list3);
		System.out.println(allLists);
		List<Integer> singleList =  allLists.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println(singleList);
	}
}
