package com.examples.core.threads;
import java.util.concurrent.*;

class C1 implements Callable<String>
{
	public String call() throws Exception
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+" entered");
		return "TEST";	
	}
}
public class TestThreadPool
{
	public static void main(String[] args) throws Exception
	{
		C1 c = new C1();
		ExecutorService es = Executors.newCachedThreadPool();
		Future<String> f1 = es.submit(c);
		System.out.println(f1.get());
		Thread.sleep(5000);
		es.submit(c);	// at this place thread invokes call()
		es.shutdown();
	}
}