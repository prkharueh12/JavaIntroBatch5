package day20OOP_Polymophism;

public class TestMethodOverloading {

	public static void main(String[] args) {
		//Calling from another class 1. create an instance 
		
		MethodOverloading lib = new MethodOverloading();
		
		System.out.println("Area of square: " + lib.getArea(5));
		
		System.out.println(lib.getArea(2,5));
		
		System.out.println(lib.getArea(2.5,6.5));

	}

}
 