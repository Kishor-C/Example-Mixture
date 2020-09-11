package com.examples.core.threads;
class R1 implements Runnable 
{
	public synchronized void run()
	{
		Thread t = Thread.currentThread();
		String name = t.getName(); // gives the Thread name
		for (int i = 1; i <= 10; i++)
		{
			System.out.println("i = "+i+", name = "+name);
		}
	}	//object locking, 1 lock for one object
}
class TestThreads
{
	public static void main(String[] args)
	{
		R1 x = new R1();
		Thread t1 = new Thread(x,"A");	// name = A
		Thread t2 = new Thread(x,"B");	//name = B
		t1.start();
		t2.start();
	}
}