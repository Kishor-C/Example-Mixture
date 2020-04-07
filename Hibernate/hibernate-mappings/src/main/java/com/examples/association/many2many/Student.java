package com.examples.association.many2many;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {

	@Id
	@Column(name = "roll_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollNo;
	private String name;
	
	@ManyToMany
	@JoinTable(name = "student_course", joinColumns = @JoinColumn(name = "student_ref"),
		inverseJoinColumns = @JoinColumn(name = "course_ref"))
	private List<Course> courses;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	
}
