package com.examples;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Java8DateDemo {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.parse("1988-11-24");
		LocalDate joingDate = LocalDate.parse("15-05-2003", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println("Current Date: "+today);
		System.out.println("Birth Date: "+birthday);
		System.out.println("Joining Date: "+joingDate);
		long totalYears = Period.between(birthday, today).getYears();
		long months = Period.between(birthday, today).getMonths();
		long totalMonths = Period.between(birthday, today).toTotalMonths();
		long experience = Period.between(joingDate, today).getYears();
		System.out.println("Age: "+totalYears+" years and "+months+" months");
		System.out.println("Total Months: "+totalMonths);
		System.out.println("Year of Experience: "+experience);	
	}
}


