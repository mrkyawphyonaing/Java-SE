package Main;

import hello.*;

import test.Fish;

public class PackageDemo {
	public static void main(String[] args) {
		
		Animal a = new Animal (" blacky ");
		a.greet();

		Dog d = new Dog (" Lone Lone" );
		d.greet();
		d.sayName();
		
		Fish f = new Fish("Lucky Fish");
		f.sayName();
		
		d.age = 20;
		d.showAge();
		
		System.out.println("Lone Lone is "+ d.age + " years old" );
}

}
