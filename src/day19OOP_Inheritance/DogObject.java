package day19OOP_Inheritance;

public class DogObject {

	public static void main(String[] args) {
		Dog pup1= new Dog ();
		
//		pup1.name = "Paul";
//		pup1.bark();
//		pup1.eat();
//		pup1.move();
		
		
		Shark sk = new Shark ();
		
		sk.name = "Gary";
		sk.size = "Large";
		sk.weight= 700;
		
		sk.swim();
		sk.eat();
		sk.move();

	}

}
