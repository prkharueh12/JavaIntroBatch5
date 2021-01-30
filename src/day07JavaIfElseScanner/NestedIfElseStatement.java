package day07JavaIfElseScanner;

public class NestedIfElseStatement {

	public static void main(String[] args) {
	
		int temp = 50;
		
		boolean sunny = true;
		
		if (temp >=90) {
			if (sunny) {
				System.out.println("Beach Time");
			}
			else {
				System.out.println("Movie Time");
			}
		}
		else {
			if (sunny) {
				System.out.println("Sport Time");
			}
			else {
				System.out.println("Fishing Time");
			}
			
		}

	}

}
