package com.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceDemo {

	public static void main(String[] args) {
	
		try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
			System.out.println(reader.readLine());
		} catch(IOException e) {
			e.printStackTrace();
		} 
	}

}



