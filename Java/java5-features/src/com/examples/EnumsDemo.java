package com.examples;

enum Gender {
	MALE, FEMALE;
}
enum Department {
	SALES, FINANCE, ACCOUNT
}
public class EnumsDemo {

	public static void main(String[] args) {
		Gender[] genders = Gender.values();
		for(Gender gender : genders) {
			System.out.println(gender);
		}
		System.out.println("----------------------------");
		Department department = Department.valueOf("SALES");
		System.out.println(department);
	}

}
