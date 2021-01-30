package day17ClassAndObject;

public class CarObject {

	public static void main(String[] args) {
		
		Car carA = new Car(); // default constructor
		
		carA.engineSize = 8 ;
		carA.year = 2020;
		carA.make = "Honda";
		carA.MAXSPEED = 200 ;
		carA.model = "Accord";
		
		carA.start();
		carA.stop();
		System.out.println("====================");
		carA.getInfo();
		
		

	}

}
