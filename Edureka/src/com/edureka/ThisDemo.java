package com.edureka;

public class ThisDemo {
	
	int id;
	String name;
	public ThisDemo() {
		this("Jame");
		System.out.println("Welcome to Taungyi");
	}
	public ThisDemo(String n) {
		System.out.println(n);
	}
	public ThisDemo(int id, String name) {
		this.id = id;
		this.name = name;
	}
	 void add (ThisDemo d) {
		System.out.println("add method of argument include ThisDeom is printing");
	}
	 
	 void show() {
		 System.out.println(id + ". " + name);
	 }
	public static void main(String[] args) {
		ThisDemo td1 = new ThisDemo();
		ThisDemo td2 = new ThisDemo(1, "John");
		td1.add(td1);
		td2.show();
	}

}
