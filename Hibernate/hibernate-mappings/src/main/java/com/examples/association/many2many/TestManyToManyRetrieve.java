package com.examples.association.many2many;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.examples.component.HibernateUtility;

public class TestManyToManyRetrieve {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtility.createSessionFactory();
		Session session = factory.openSession();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter roll no:");
		int rollNo = sc.nextInt();
		Student student = session.get(Student.class, rollNo);
		System.out.println("Roll No: "+student.getRollNo()+", Name: "+student.getName());
		System.out.println("********* Courses he has taken ******************");
		List<Course> courses = student.getCourses();
		courses.forEach(course -> { 
			System.out.println(course.getCourseName());
		});
		System.out.println("Enter course id to know the students enrolled to the course");
		int courseId = sc.nextInt();
		Course course = session.get(Course.class, courseId);
		List<Student> students = course.getStudents();
		students.forEach(s -> { 
			System.out.println(s.getName());
		});
		sc.close();
		session.close();
		factory.close();
		
	}

}
