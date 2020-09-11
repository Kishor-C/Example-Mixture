package com.examples.core.iostreams;
import java.io.*;

public class TestDeserialization
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fis = new FileInputStream("emp.txt")
			;
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee e = (Employee)ois.readObject();
			System.out.println("Name = "+e.name);
			System.out.println("Age = "+e.age);
			fis.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}