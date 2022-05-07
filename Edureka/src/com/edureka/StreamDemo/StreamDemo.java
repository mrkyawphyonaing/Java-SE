package com.edureka.StreamDemo;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer>list = Arrays.asList(1,2,3,5,7,8,9);
		int a = list.stream().mapToInt(m->m).sum();
		System.out.println(a);
	}

}
