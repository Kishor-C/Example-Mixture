package com.examples.core.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <= 5; i++) {
			list.add(i);
		}
		System.out.println("List: "+list);
		Collections.sort(list);
		System.out.println("List in sorted order: "+list);
		Collections.reverse(list);
		System.out.println("List in reverse order: "+list);
		Collections.shuffle(list);
		System.out.println("Shuffled list: "+list);
		// inOrder to sort complex object your complex object must use Comparator or Comparable interface
		
		Student s1 = new Student(102, "Bob", "A");
		Student s2 = new Student(101, "Alex", "B");
		Student s3 = new Student(100, "Charles", "C");
		List<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		System.out.println("***** All Students *****");
		for(Student s : studentList) {
			System.out.println(s);
		}
		System.out.println("**** Sort Students By Rollno ****");
		Collections.sort(studentList, new Student.SortByRollNo());
		for(Student s: studentList) {
			System.out.println(s);
		}
		System.out.println("**** Sort Students by Name ****");
		Collections.sort(studentList, new Student.SortByName());
		for(Student s : studentList) {
			System.out.println(s);
		}
	}

}
