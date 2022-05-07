package com.edureka;

public class HelloWorld {
	String instanceVariable;
	static String staticVariable;
	static int a = 100;
	int b = 200;
	String c;
	
	public void show() {
		String localVartable = "This is LocalVariable";
		System.out.println(localVartable);
	}
	
	public void add(String c) {
		switch (c) {
		case "Hello":
			System.out.println("This is Say Hello");
			break;
		case "Hi":
			System.out.println("This is Say Hi");
			break;

		default: 
			System.out.println("Nothing Printing");
			break;
		}
	}
	public static void main(String[] args) {
			HelloWorld hello = new HelloWorld();
			System.out.println("Hello World");
			hello.instanceVariable = "This is InstanceVariable";
			staticVariable = "This is StaticVariable";
			hello.show();
			hello.add("Hello");
			hello.add("Hi");
			System.out.println(hello.instanceVariable);
			System.out.println(staticVariable);
			
			switch (hello.b) {
			case 10: 
				System.out.println("10 is printing");
				break;
			case 20: 
				System.out.println("20 is printing");
				break;
			case 30: 
				System.out.println("30 is printing");
				break;

			default: 
				System.out.println("Nothing Printing");
				break;
			}
	}

}
