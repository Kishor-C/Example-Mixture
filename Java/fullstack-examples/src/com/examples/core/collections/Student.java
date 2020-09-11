package com.examples.core.collections;


import java.util.Comparator;

public class Student {
	private int rollNo;
	private String name;
	private String grade;
	private String deptName;
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public static class SortByRollNo implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getRollNo() - o2.getRollNo();
		}
		
	}
	
	public static class SortByName implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			String name1 = o1.getName();
			String name2 = o2.getName();
			int res = name1.compareTo(name2);   // name1 - name2;
			return res;
		}
		
	}
	
	// Generate 2 constructors, getters & setters and toString()
	public Student(int rollNo, String name, String grade) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
	}

	public Student(int rollNo, String name, String grade, String deptName) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
		this.deptName = deptName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", grade=" + grade + ", deptName=" + deptName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;		
		int result = 1;
		result = prime * result + rollNo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}
	
	
}
