package com.edureka.Generic;

public class Test<T,U> {
		T tTest;
		U uTest;
		public Test() {
			System.out.println("Default constructor is running");
		}
		public Test(T tTest, U utest) {
			this.tTest = tTest;
			this.uTest = utest;
		}
		public void display(T tTest, U uTest) {
			System.out.println(tTest);
			System.out.println(uTest);
		}
}

class genericDemo  {
	public static void main(String[] args) {
		Test <String, Integer> test = new Test<String, Integer>();
		test.display("Hello", 2022);
	}
}