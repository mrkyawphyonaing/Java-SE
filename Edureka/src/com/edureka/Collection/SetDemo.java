package com.edureka.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//HashSet<String> set = new HashSet<String>();
		TreeSet<String> set = new TreeSet<String>();// Data is unordered but it is alphabetically sort
		set.add("John");
		set.add("Jayy");
		set.add("Annie");
		set.add("Joe");
		set.add("BillGate");
		set.add("Jinney");
		set.add("Mizucarbat");
		set.add("Jim");
		set.add("Curmax");
		set.add("John");
		set.add("John");
		
		System.out.println("Set is : " + set);
		
		Iterator <String> itr = set.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
			
		}
		
		set.remove("Jim");
		System.out.println("Set after remove Jim is ; "+ set);
		if (set.contains("John")) {
			System.out.println("John is in the set");	
		}
		System.out.println("Set of size is : "+ set.size() );
	}

}
