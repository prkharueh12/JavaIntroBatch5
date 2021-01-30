package day17ClassAndObject;

public class Car {
	// instant variable ----> inside of a class and outside of any method
	String make ;  
	String model ;
	int year;
	int engineSize;
	 int MAXSPEED = 0; 
	
		public void start () {
			System.out.println("Start the car");
		}
		public void getInfo () {
			System.out.println("Make: " + make);
			System.out.println("Model: " + model);
			System.out.println("Year: " + year);
			System.out.println("Engine Size: " + engineSize);
			System.out.println("Max Speed: " + MAXSPEED);
		}
		public void stop () {
		   System.out.println("Stop the car");
		}
			
	
		
		
		
}
