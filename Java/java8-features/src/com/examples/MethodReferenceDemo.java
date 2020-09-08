package com.examples;

import java.time.LocalDate;

interface Foo {
	int getValue();
}
public class MethodReferenceDemo {

	public static void main(String[] args) {
		Foo foo = "Hello" :: length;
		System.out.println("Size of Hello: "+foo.getValue());
		foo = LocalDate.now() :: getYear;
		System.out.println("Year: "+foo.getValue());
	}

}
