  package day20OOP_Polymophism;

public class MethodOverloading {

	// Many method with same name in the same class, also called "Compile time Polymorphism"
	// Compile time -> Method overloading
	
	//Square
	public int getArea (int a) {
		return a*a ;
		
	}
	
	public double getArea (double a) {
		return a*a ;
	}

	public int getArea (int a, int b) {
		return a*b ;
	}
	
	public double getArea (double a, double b) {
		return a*b ;
	}
}