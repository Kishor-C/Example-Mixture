package com.examples.core.collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestStudents {
	public static void main(String[] args) {
		List<Student> studentsSet = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int option = 0;
		do {
			System.out.println("1: Add Student 2: Exit");
			option = sc.nextInt(); 
			switch(option) {
			case 1: 
				System.out.println("Enter rollno:");
				int rollNo = sc.nextInt();
				System.out.println("Enter name:");
				String name = sc.next();
				System.out.println("Enter grade:");
				String grade = sc.next();
				Student s = new Student(rollNo, name, grade);
				studentsSet.add(s); 			// adds student to the Set
				System.out.println("Number of students: "+studentsSet.size());
				System.out.println("--------------------");
				break;
			
			}
		} while(option != 2);
		Iterator<Student> it = studentsSet.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
			System.out.println("--------------------------------");
		}
		sc.close();
	}

}
