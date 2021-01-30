package day14CallMethod;

public class CreateMethod {

	public static void main(String[] args) {
		// Method - a block of code where you can reuse it. There will be only one place
		// to change if necessary.
		// Creating, calling, passing, overloading method.

		printHello();
		add2Numbers();
		openBrowser();
		
		
		
		
		
		
		
	} //Main method above

	// modifier returnType nameOfMethod (Parameter list) {
	// }
	public static void printHello() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello");
		}
	}
	
	
	public static void add2Numbers() {
		System.out.println(5+5);
	}
	
	public static void openBrowser () {
		System.out.println("Opening Chrome browser!");
	}
	
	
	
} // end class
