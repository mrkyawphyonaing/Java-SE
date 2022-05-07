package com.Edureka.API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;

public class StreamAPI {

	public static void main(String[] args) {
			//Stream API//
		//Creation
				// Array
				// Collection
				// Stream Helper Class
		//Intermediate Operation
				// Return Stream
		//Terminal Operation
				// Not return Stream
		
		int [] Array = {1,2,3,4,5,6,7,8,9};
		int result = Arrays.stream(Array).map(a->a).sum();
		System.out.println("Sum Result is: "+result);
		System.out.println();
		List<String> list = new ArrayList<String>();
		Collections.addAll(list, "Aung","Zaw","Htoo","Aye");
		list.stream().sorted().forEach(a->System.out.println(a));
		System.out.println();
		showList(list);
		
		
	}
	
	private static void showList(List<String>list) {
		for (String str : list) {
			System.out.println(str);
		}
	}

}
