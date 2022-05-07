package com.edureka.Manager;

public class Car extends Vehicles{
//		@Override
//		public void setPrice(int price) {
//		System.out.println("Value of car: "+price);
//		}
		
		public static void staticOverrride(String str) {
			System.out.println(str);
		}
		@Override
		public void changeGear() {
			System.out.println("Gear Position no 1 is mvoing forword and R is back");
		}
}
