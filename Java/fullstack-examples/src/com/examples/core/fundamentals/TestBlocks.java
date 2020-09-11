package com.examples.core.fundamentals;
// IIB - Instance Initialization Block
// SIB - Static Initialization Block
class Test {
	static int j;
	Test() {
		System.out.println("Test()");
	}
	Test(int i) {
		System.out.println("Test(int)");
	}
	// SIB
	static {
		System.out.println("SIB");
	}
	// IIB
	{
		System.out.println("IIB");
	}
}
class TestBlocks {
	public static void main(String[] args) {
		Test.j = 100;
		Test.j = 200;
	}
}	