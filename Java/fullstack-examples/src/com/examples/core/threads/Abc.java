package com.examples.core.threads;
import java.util.concurrent.*;
class S
{
	static int count = 0;
}
class A extends Thread
{
	Semaphore s ;
	String name;
	A(Semaphore s, String name)
	{
		this.s = s;
		this.name = name;	
	}
	public void run()
	{
		try
		{
			System.out.println(name + " starts");
			s.acquire();
			for(int i = 0; i<150; i++)
			{
				S.count++;
				System.out.println("Count="+S.count+" running thread is"+name);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(name+" ends");
		s.release();
	}			
}
class Abc
{
	public static void main(String[] args)
	{
		Semaphore s = new Semaphore(1);
		A a = new A(s, "A");	A b = new A(s, "B");	A c = new A(s,"C");
		a.start();	b.start();	c.start();
	}
}