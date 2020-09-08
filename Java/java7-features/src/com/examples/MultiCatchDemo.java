package com.examples;

public class MultiCatchDemo {

	public static void main(String[] args) {
		try {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int result = x / y;
			System.out.println("Result = "+result);
		} catch(ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e) {
			e.printStackTrace();
		}
	}
}



