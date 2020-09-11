package com.examples.core.fundamentals;
class TestLiterals
{
	public static void main(String[] args)
	{
		int a = 'A';
		System.out.println("a : "+a);	// a = 65
		char b = 97;			
		System.out.println("b : "+b);	// b = 'a'
		int c = 10_00_000;		// supported from JDK 7
		System.out.println("c : "+c);	// c = 1000000

		String s1 = "10";
		String s2 = "20";		
		System.out.println("s1+s2 : "+(s1 + s2));// s1+s2 : 1020
		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);
		System.out.println("i+j : "+(i + j)); // i + j : 30
	}
}