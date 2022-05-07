package com.edureka.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class LinklistDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Welcome");
		list.add("Edureka");
		
		Collection <String> collect = new ArrayList<String>();
		collect.add("to");
		collect.add("the");
		collect.add("most");
		collect.add("popular");
		collect.add("online");
		collect.add("Software");
		collect.add("Training");
		collect.add("Center");
		
		
		System.out.println("The Linked list is: "+list);
		//list.addAll(collect);
		list.addAll(1,collect);
		System.out.println("The New Linked list is : " + list);
		list.add(10,"in");
		list.add(11,"the");
		list.add(12,"World");
		System.out.println("Current linkedlist is : "+list);
		
		int size = list.size();
		String [] number = new String [size];
		number = list.toArray(number);
		System.out.println("After linkedlist to change Array are :");
		System.out.println(Arrays.toString(number));
		
		
	}

}

