package com.examples.core.fundamentals;
class A
{
	int i;
	A(int i)
	{
		this.i = i ;
	}
	@Override
	public String toString() {
		return "i = "+i;
	}
}
class TestObjectClass
{
	public static void main(String[] args)
	{
		A a1 = new A(10);
		A a2 = new A(20);
		System.out.println(a1);	// a1.toString()
		System.out.println(a2.toString());
	}
}