package com.examples.core.threads;
import java.util.concurrent.*;

class TX extends Thread
{
	CountDownLatch c ;
	TX(CountDownLatch c)
	{
		this.c = c;
	}
	public void run()
	{
		c.countDown();
		c.countDown();
		c.countDown();
		c.countDown();
		c.countDown();
	}
}

class CDLDemo
{
	public static void main(String[] args)throws Exception
	{
		CountDownLatch c = new CountDownLatch(11);
		System.out.println("Starting...");
		TX t = new TX(c);	
		t.start();		
		c.await();
		System.out.println("Done...");
	}
}