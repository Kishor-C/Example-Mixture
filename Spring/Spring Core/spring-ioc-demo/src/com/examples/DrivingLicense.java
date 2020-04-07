package com.examples;

public class DrivingLicense implements Identification {

	@Override
	public void fetchDetails() {
		System.out.println("--- DL Information ----");
		System.out.println("Gives Name, DOB & Address Information");
	}

}
