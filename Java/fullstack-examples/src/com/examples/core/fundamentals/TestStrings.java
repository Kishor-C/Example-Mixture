package com.examples.core.fundamentals;
class TestStrings
{
	public static void main(String[] args)
	{
		String s1,s2,s3,s5;
		s1 = "hi";
		s2 = "hi";
		s3 = new String("hi");
		
		s5 = "HI";
		System.out.println(s1.equals(s3)); //true
		System.out.println(s1 == s3);// false
		System.out.println(s1 == s2);//true
		System.out.println(s1.equals(s5));//false
		System.out.println(s1.equalsIgnoreCase(s5));//true
		String s6 = s1.concat("ABC");
		System.out.println(s1); //hi
		System.out.println(s6); //hiABC

		StringBuffer sb1,sb2;
		sb1 = new StringBuffer("hi");
		sb2 = new StringBuffer("hi");
		System.out.println(sb1.equals(sb2));//false
		sb1.append("Xyz");
		System.out.println(sb1);//hiXyz
	}
}