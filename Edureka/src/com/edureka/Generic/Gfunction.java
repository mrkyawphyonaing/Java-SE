package com.edureka.Generic;

public class Gfunction {
	static <T> void  genericDisplay (T element) {
		System.out.println(element.getClass().getName()+ " = " +element);
	}
	
	public static void main(String[] args) {
		genericDisplay("Hello");
		genericDisplay(2022);
		genericDisplay(0.5);
		genericDisplay(true);
		genericDisplay('H');
	}
}
