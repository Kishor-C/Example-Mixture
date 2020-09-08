package com.examples;

public class VarArgsDemo {

	public static void main(String[] args) {
		sum(20);
		System.out.println("--------------");
		sum(20, 50, 30, 40);
	}
	public static void sum(int a, int... b) {
		int temp = a;
		for(int x : b) {
			temp = temp + x;
		}
		System.out.println("Sum = "+temp);
	}
}
