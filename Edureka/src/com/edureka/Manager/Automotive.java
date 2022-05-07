package com.edureka.Manager;

public class Automotive {

	public static void main(String[] args) {
		Car mercede = new Car();
		mercede.numberOfWheeels =4;
		mercede.color = "Black";
		mercede.speed = 1000;
		mercede.changeGear();
		mercede.setPrice(100000);
		System.out.println("Mercede price is: "+mercede.getPrice());
		System.out.println();
		
		SuperCar supercar = new SuperCar();
		supercar.color="Gold";
		supercar.speed=10000;
		supercar.numberOfWheeels=4;
		supercar.changeGear();
		supercar.getTurbo();
		supercar.staticOverrride("Hello Override");
		
		Vehicles vehicles1 = mercede;
		vehicles1.changeGear();
		
		Vehicles vehicles2 = new Vehicles();
		vehicles2.changeGear();
		
		Car max = supercar;
		max.changeGear();
		
		
	}

}
