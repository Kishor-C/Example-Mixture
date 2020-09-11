package com.examples.core.iostreams;
import java.io.*;
@SuppressWarnings("serial")
class Employee implements Serializable {
	String name;
	int age;
	Employee(String name, int age) {
		this.name = name;		this.age = age;
	}
}
public class TestSerialization {
	public static void main(String[] args) {
		try (
		   FileOutputStream fos = new FileOutputStream("emp.txt");
		    ObjectOutputStream oos = new ObjectOutputStream(fos);
		)
		{
		     
     	  	     Employee e1 = new Employee("Rahul",44);
		     oos.writeObject(e1);
		     fos.flush();
		     fos.close();
		     System.out.println("Object is serialized..");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}