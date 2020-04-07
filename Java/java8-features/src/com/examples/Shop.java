package com.examples;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class Shop {
	public Future<Double> getAsyncPrice(String name) {
		CompletableFuture<Double> futurePrice = new CompletableFuture<Double>();
		// execute the task asynchronously in a different thread without making client to wait
		Thread t = new Thread(() ->  {
			// take some time to do a task & get the result
			delay();
			double price = Math.random() * name.charAt(1) + name.charAt(0);
			// sets the value to Future when it becomes available
			futurePrice.complete(price);
		});
		t.start();
		
		return futurePrice;
	}
	
	public static void delay() {
		try {
			Thread.sleep(5000);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
