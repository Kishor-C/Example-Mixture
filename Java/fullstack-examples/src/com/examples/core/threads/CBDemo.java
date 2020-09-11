package com.examples.core.threads;
import java.util.concurrent.*;
class Action extends Thread
{
	public void run()
	{
		System.out.println("barrier reached...");
		System.out.println(Thread.currentThread().getName()+":");
	}
}
class T extends Thread
{
	String name;
	CyclicBarrier cb;
	T(CyclicBarrier cb, String name)
	{
		this.name = name;	
		this.cb = cb;
	}
	public void run()
	{
		System.out.println(name);
		try
		{
			cb.await();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(Thread.currentThread().getName());
	}
}
class CBDemo
{
	public static void main(String[] args)
	{
		CyclicBarrier cb = new CyclicBarrier(3, new Action());
		T t = new T(cb,"A");		T u = new T(cb,"B"); 	T v = new T(cb,"C");
		t.start();			u.start();			v.start();
	}
}