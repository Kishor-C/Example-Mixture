package com.examples;

import java.util.concurrent.Future;

public class TestClientApi {
	public static void main(String[] args) throws Exception {
		Shop shop = new Shop();
		long start = System.nanoTime();
		Future<Double> futurePrice = shop.getAsyncPrice("booking a room");
		// client does other task without waiting for discount price
		long invocationTime = (System.nanoTime() - start) / 100000;
		System.out.println("Time taken by getAsyncPrice: "+invocationTime);
		double price = futurePrice.get();
		System.out.println("Price: "+price);
	}
}
