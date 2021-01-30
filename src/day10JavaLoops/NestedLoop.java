package day10JavaLoops;

public class NestedLoop {

	public static void main(String[] args) throws InterruptedException {

//		for (int i = 1; i <= 5; i++) { //how many time you want to run the loops (Outer loop)
//			for (int j = 1; j <= 5; j++) {  // what repeated items you want to run! (Inner loop)
//				System.out.println(j);
//			}
//			System.out.println("*****************");
//		}

		// Nested loop with time Thread.sleep.
//		for (int j = 0; j < 2; j++) {
//
//			System.out.println("START!");
//			for (int i = 10; i >= 0; i--) {
//				System.out.println(i);
//				Thread.sleep(100);
//			}
//			System.out.println("DONE!!");
//		}

		String dash = ">>";
		System.out.print  ("Loading...");
			
		for (int t = 0; t < 5; t++) {

			for (int i = 0; i <= 5; i++) {
				Thread.sleep(100);
				System.out.print(dash);
				Thread.sleep(100);
                 
			}
			
		}
	}

}
