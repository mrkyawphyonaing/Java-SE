package hello;

public class Animal {
	protected String name;
	public int age;

	public Animal (String name) {
		this.name = name;
	}
	
	public  String showAge () {
		if (age > 0 || age < 120 ) {
	
			System.out.println("Impossible");
			
		}
		else if(age < 0 || age > 120  ) {
			System.out.println("Lone Lone is "+ age + " years old" );
		}
		else {
			return null;
		}
		
		return null;
		
		
		
	

	}
	public void greet () {

		System.out.println("Hello I am " + name);
	}

}
