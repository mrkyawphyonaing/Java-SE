package com.edureka;

import java.util.Iterator;

public class IterationStatement {
	static int a = 10;
	public static void main(String[] args) {
		for (int i = 10; i > 1; i--) {
			
			if (i==5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println();
		while (a > 1) {
			System.out.println(a);
			if (a == 5) {
				break;
			}
			
			a--;
		}
	}

}
