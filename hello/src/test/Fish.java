package test;

import hello.Animal;

public class Fish extends Animal {
	
	public Fish (String name) {
		super(name);
	}
	
	public void sayName () {
		
		System.out.println(" I am " + name );
	}

}
