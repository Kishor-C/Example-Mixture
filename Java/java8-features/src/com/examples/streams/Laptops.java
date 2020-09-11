package com.examples.streams;

import java.util.Arrays;
import java.util.List;

public class Laptops {
	private String brand;
	private double price;
	public Laptops(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptops [brand=" + brand + ", price=" + price + "]";
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public static List<Laptops> fetchLaptops(){
		List<Laptops> laptops =  Arrays.asList(
				new Laptops("Lenova", 50000), 
				new Laptops("Lenova", 35000), 
				new Laptops("Lenova", 60000),
				new Laptops("Lenova", 45000),
				new Laptops("Mac", 150000), 
				new Laptops("Mac", 250000), 
				new Laptops("Mac", 85000),
				new Laptops("HP", 16000), 
				new Laptops("HP", 26000), 
				new Laptops("HP", 35000), 
				new Laptops("HP", 55000));

		return laptops;
	}
}
