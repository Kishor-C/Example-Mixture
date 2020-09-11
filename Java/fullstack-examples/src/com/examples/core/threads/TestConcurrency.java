package com.examples.core.threads;
import java.util.concurrent.*;
class T1 implements Runnable {
	Semaphore s;
	T1(Semaphore s) {
		this.s = s;
	}
	public void run() {
		try {
			String name = Thread.currentThread().getName();
			s.acquire();		
			System.out.println(name + " processing...");
			Thread.sleep(5000);
			s.release();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
public class TestConcurrency {
	public static void main(String[] args) {
		Semaphore s = new Semaphore(2);
		T1 t = new T1(s);
		new Thread(t, "A").start();
		new Thread(t, "B").start();
		new Thread(t, "C").start();
		new Thread(t, "D").start();
	}
}