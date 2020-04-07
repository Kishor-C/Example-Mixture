package com.examples;

public class Items {
	private String name;
	private double price;
	private String type;
	
	public Items(String name, double price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Items [name=" + name + ", price=" + price + ", type=" + type + "]";
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
