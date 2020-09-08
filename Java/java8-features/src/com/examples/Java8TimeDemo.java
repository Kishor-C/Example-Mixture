package com.examples;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Java8TimeDemo {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		LocalTime specificTime = LocalTime.parse("17:00", DateTimeFormatter.ofPattern("HH:mm"));
		System.out.println("Current Time: "+time
				+", Current Date & Time: "
				+dateTime+", Specific Time: "+specificTime);
		long hours = Duration.between(specificTime, time).toHours();
		System.out.println("Hours passed: "+hours);
	}

}



