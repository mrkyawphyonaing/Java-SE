package com.edureka.Manager;

public class Vehicles {
	int numberOfWheeels;
	String color;
	int speed;
	private int price;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void changeGear() {
		System.out.println("Moving Vehicles");
	}
}
