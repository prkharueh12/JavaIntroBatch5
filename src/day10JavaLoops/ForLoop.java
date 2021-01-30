package day10JavaLoops;

public class ForLoop {

	public static void main(String[] args) {
//		for (int i = 1; i <= 10; i++) {
//			//System.out.println("This is "+ i);
//			System.out.println("Done");
//			
//		}
		
		for (int i = 10; i <= 60; i++) {
			System.out.println(i);
		}
		for (int i = 10; i <= 30; i+=5) {
			System.out.println("This is new "+i);
		}

		for (int i = 10; i >= 1; i--) {
			System.out.println("Countdown to "+i);
		}
		
		for (int i = 30; i >= 15; i--) {
			System.out.println("Countdown to "+i);
			
			if (i ==20 ){
				break;
			}
		}
		
		
	}

}
 