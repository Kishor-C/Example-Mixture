package com.examples.core.threads;
import java.util.concurrent.atomic.*;
// demo for variable updation without locking using AtomiInteger

class TestAtomics
{
	public static void main(String[] args)
	{
		AtomicInteger ai = new AtomicInteger(5);
		if(ai.compareAndSet(5,40))
		{
			System.out.println("replaced:"+ai);
		}
	}
}