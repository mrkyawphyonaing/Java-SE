package com.edureka.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "May";
		stu.age = 16;
		List<String> list1 = new ArrayList<String>();
		List list2 = new ArrayList();
		list1.add("John");
		list1.add("Jayy");
		list1.add("Jose");
		list1.add("Jim");
		list1.add("Joe");
		list1.add("John");
		
		list2.add(stu);
		list2.add(2022);
		list2.add(0.5);
		list2.add('A');
		list2.add(true);
		
		System.out.println("List 1 is : "+list1);
		System.out.println("List 2 is : "+list2);
		
		//Get the element from List
		String name = list1.get(2);
		System.out.println("Name is : " + name);
		
		Object o = list2.get(2);
		System.out.println("O is : " + o);
		
		// Update element in list 
		list1.set(3, "Shally");
		System.out.println("List 1 now is : "+list1);
		
		// Remove element from List 
		list1.remove(3);
		System.out.println("List 1 after remove is : " + list1);
		
		//list1.clear(); remove all
		
		if (list1.contains("John")) {
			System.out.println("John is in the list");
			
		}
		
		// Iterate in Array List
		System.out.println("======Iterating with Basic for loop======");
		for (int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("=================");
		System.out.println();
		System.out.println("======Iterating with Enhance for loop======");
		for (String str : list1) {
			System.out.println(str);
		}
		System.out.println("=================");
		System.out.println();
		System.out.println("======Iterating with Iterator======");
		Iterator<String> ite = list1.iterator();
		/*System.out.println(ite.next());
		System.out.println(ite.next());
		System.out.println(ite.next());*/
		while (ite.hasNext()) {
			String str = ite.next();
			System.out.println(str);
			if (str.equals("Jose")) {
				ite.remove();
			}
		}
		System.out.println("=================");
		System.out.println("List after iteration is : "+ list1);
	}

}

class Student {
	String name;
	int age;
}