package com.examples.core.fundamentals;
class TestMath
{
	public static void main(String[] args)
	{
		System.out.println("PI : "+Math.PI);
		double r = Math.random();
		System.out.println("Random number : "+r);
		System.out.println("Ceil : "+Math.ceil(10.4));
		int w = new Double(r*10000).intValue();
		System.out.println("Whole number : "+w);
	}
}

/*

	Math.PI - > 3.14
	Math.E - > 2.8
	Math.random() to generate random numbers 0 to 1
	Math.ceil(10.4);	11
	Math.floor(10.4);	10

*/