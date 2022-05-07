package com.edureka.AbrestDemo;

public abstract class Mobile {
	public Mobile() {
		System.out.println("Mobile Constructor is running");
	}
	abstract void run();
	
	void dialNumber() {
		System.out.println("Number are dial from Nokia Mobile");
	}
}
