package com.examples;

import static java.lang.Math.*;
import static java.lang.Integer.MIN_VALUE;
import static java.lang.Integer.MAX_VALUE;
public class StaticImportDemo {
	public static void main(String[] args) {
		System.out.println("PI = "+PI);
		System.out.println("Max: "+max(30, 40)); // Math.max
		System.out.println("Min: "+min(30, 40)); // Math.min
		System.out.println("Int min range: "+MIN_VALUE);
		System.out.println("Int max range: "+MAX_VALUE);
	}
}
