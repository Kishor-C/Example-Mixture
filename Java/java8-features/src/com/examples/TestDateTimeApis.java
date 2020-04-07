package com.examples;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestDateTimeApis {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println("Default format of Time:"+time);
		System.out.println("Formatting Time: "+time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		System.out.println("Formatting Time: "+time.format(DateTimeFormatter.ofPattern("hh:mm:ss a")));
		String stringTime = "10:20";
		LocalTime time2 = LocalTime.parse(stringTime, DateTimeFormatter.ofPattern("HH:mm"));
		System.out.println("Time2: "+time2);
		System.out.println("Hour: "+time2.getHour());
		System.out.println("Minutes: "+time2.getMinute());
		System.out.println("------------ Using Duration to calcualte time different -----------------");
		LocalTime currentTime = LocalTime.now();
		LocalTime loggedInTime = LocalTime.of(6, 0);
		Duration duration = Duration.between(loggedInTime, currentTime);
		long hours = duration.toHours();
		System.out.println("You have logged in "+hours+" hours ");
	}
}
