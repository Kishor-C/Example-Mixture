package com.examples.core.threads;
import java.util.concurrent.locks.*;

class Shopping
{
	private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
	public void add(Object item)
	{
		Lock write= rwl.writeLock();
		write.lock();
		System.out.println(write);
		write.unlock();
		System.out.println(write);

		Lock read = rwl.readLock();
		read.lock();
		System.out.println(read);
		read.unlock();
		System.out.println(read);
	}
	public static void main(String[] args)
	{
		Shopping s = new Shopping();
		s.add("");
	}
}