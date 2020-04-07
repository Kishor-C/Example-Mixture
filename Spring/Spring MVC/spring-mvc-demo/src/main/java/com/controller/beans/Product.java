package com.controller.beans;

public class Product {
	private String name;
	private double price;
	private int quantiy;
	
	public Product(String name, double price, int quantiy) {
		super();
		this.name = name;
		this.price = price;
		this.quantiy = quantiy;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantiy() {
		return quantiy;
	}
	public void setQuantiy(int quantiy) {
		this.quantiy = quantiy;
	}
}
