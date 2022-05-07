package com.edureka.Lambda;

import java.util.function.BiConsumer;
import java.util.function.Function;

public class LambdaDemo {
	public static void main(String[] args) {
		Function<String, Integer> function = (a)->Integer.parseInt(a); 
		int b = function.apply("123");
		System.out.println(b);
		
		BiConsumer<String, Integer> biconsumer = (a,c)->{System.out.println(a+c);};
		biconsumer.accept("Hello ", 2022);
		
	}
}

