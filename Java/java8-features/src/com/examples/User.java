package com.examples;

public class User implements Comparable<User>{
	private int userId;
	private String name;
	private int age;
	public User() {	}
	public User(int userId, String name, int age) {
		this.userId = userId;
		this.name = name;
		this.age = age;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return userId * 31;
	}
	@Override
	public boolean equals(Object obj) {
		User other = (User)obj;
		return (other.getUserId() == this.userId);
	}
	public String toString() {
		return "Id = "+userId+", Name = "+name+", Age = "+age;
	}
	@Override
	public int compareTo(User o) {
		
		return o.getUserId() - userId;
	}
}
