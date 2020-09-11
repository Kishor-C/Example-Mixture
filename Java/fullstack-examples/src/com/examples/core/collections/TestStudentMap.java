package com.examples.core.collections;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestStudentMap {

	public static void main(String[] args) {
		Student s1 = new Student(101, "Alex", "A", "CSE");
		Student s2 = new Student(102, "Bob", "B", "CSE");
				
		Student s3 = new Student(102, "Alex", "A", "ECE");
		Student s4 = new Student(103, "Bob", "A", "ECE");
		
		Map<String, List<Student>> map = new HashMap<>();
		
		// keep 2 students in separate list for every department
		List<Student> cseStudents = new ArrayList<>();
		List<Student> eceStudents = new ArrayList<>();
		
		cseStudents.add(s1);			cseStudents.add(s2);
		
		eceStudents.add(s3);			eceStudents.add(s4);
		
		map.put("CSE", cseStudents);
		map.put("ECE", eceStudents);
		
		System.out.println("Get Students based on Key");
		System.out.println("CSE: "+map.get("CSE"));
		List<Student> studentsList = map.get("CSE");
		for(Student s : studentsList) {
			if(s.getGrade().equals("A")) {
				System.out.println(s);
			}
		}
	}

}
