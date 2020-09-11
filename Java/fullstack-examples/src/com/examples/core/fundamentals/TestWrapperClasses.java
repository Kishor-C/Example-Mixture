package com.examples.core.fundamentals;
class TestWrapperClasses
{
	public static void main(String[] args)
	{
		int a = 11;
		System.out.println("Hexa : "+Integer.toHexString(a));
		System.out.println("Binary : "+Integer.toBinaryString(a));
		System.out.println("Octal : "+Integer.toOctalString(a));
		System.out.println("Min of int "+Integer.MIN_VALUE);
		System.out.println("Max of int "+Integer.MAX_VALUE);
		System.out.println("Max of byte "+Byte.MAX_VALUE);

		Integer i = 13;	// 13 -> int -> Integer (AutoBoxing)
		int j = i;	// i -> Integer -> int (AutoUnboxing)
		System.out.println(j);
		// AutoBoxing and AutoUnboxing was introduced in 
		// JDK 5

		// Integer i = new Integer(13); explicit boxing
		// int j = i.intValue(); explicit unboxing
	}
}		// Eclipse Luna 64 bit - for JEE developers