package day20OOP_Polymophism;

public abstract class Animal {

	public abstract void play ();
	
	public void walk () {
	System.out.println("Walking!");	
	}
	
	public void makeSound () {
		System.out.println("Sounding!");
	}
	
	public  String name (String nm) {
		return "my name is : "+ nm;
	}
}
