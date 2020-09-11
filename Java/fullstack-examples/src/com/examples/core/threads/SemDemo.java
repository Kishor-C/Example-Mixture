package com.examples.core.threads;
import java.util.concurrent.*;

class SemDemo
{
	public static void main(String[] args)
	{
		Semaphore sem = new Semaphore(1);
		IncThread i = new IncThread(sem);
		DecThread d = new DecThread(sem);
		d.start();
		i.start();
	}
}
class IncThread extends Thread
{
	Semaphore s;
	IncThread(Semaphore s)
	{
		this.s = s;
	}
	public void  run()
	{
		try
		{
			System.out.println("Starting A");
			s.acquire();
			System.out.println("A gets a permit");
			for(int i=0;i<5;i++)
			{
				Shared.count++;
				System.out.println("A:"+Shared.count);
				Thread.sleep(10);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("A releases the permit");
		s.release();
	}
}
class Shared
{
	static int count = 0;
}
class DecThread extends Thread
{
	Semaphore s;
	DecThread(Semaphore s)
	{
		this.s = s;
	}
	public void  run()
	{
		try
		{
			System.out.println("Starting B");
			s.acquire();
			System.out.println("B gets a permit");
			for(int i=0;i<5;i++)
			{
				Shared.count++;
				System.out.println("B:"+Shared.count);
				Thread.sleep(10);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("B releases the permit");
		s.release();	
	}
}