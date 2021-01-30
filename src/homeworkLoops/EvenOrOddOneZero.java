package homeworkLoops;

import java.util.Scanner;

public class EvenOrOddOneZero {

	public static void main(String[] args) {
		 

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to check Odd or Even: ");
		int num = input.nextInt();
		int result;
		if (num % 2 == 0) {
			result = num % 2;
			System.out.println("The number is even.");
			result = 1;
			System.out.println(result);
		}
		if (num % 2 == 1) {
			result = num % 2;
			System.out.println("The number is odd.");
			result = 0;
			System.out.println(result);
		}
		
		input.close();

	}

}
