package com.examples;

import java.util.Comparator;
import java.util.TreeSet;

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		Comparator<Integer> descendingOrder = new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		};
		TreeSet<Integer> set1 = new TreeSet<>(descendingOrder);
		set1.add(25);
		set1.add(10);
		set1.add(35);
		set1.add(15);
		System.out.println("Set1: "+set1);
		Comparator<Integer> descendingOrderLambda = (o1, o2) -> o2 -o1;
		TreeSet<Integer> set2 = new TreeSet<>(descendingOrderLambda);
		set2.add(25);
		set2.add(10);
		set2.add(35);
		set2.add(15);
		System.out.println("Set2: "+set2);
	}

}


