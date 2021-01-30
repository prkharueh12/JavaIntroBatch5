package practiceInterviewTask;

import java.util.Random;

public class RandomOutputEvenOdd {

	public static void main(String[] args) throws InterruptedException {
		Random ranNum = new Random();
		int numOut = ranNum.nextInt(5);
		System.out.println("The random number is " + numOut);

		String print = "";

		if (numOut % 2 == 0) {
			print = "Even number";
		}else if (numOut==0) {
			System.out.println("Magic Number");
		}
		else {
			print = "Odd number";
		}
		System.out.println(print);

		for (int i = numOut; i > 0; i--) {
			for (int j = 59; j > 0; j--) {
				System.out.println((i-1)+ "  minut(s) and " + j + " seconds left");
				Thread.sleep(100);
			}
		}
		
		System.err.println("DONE");
	}

}
