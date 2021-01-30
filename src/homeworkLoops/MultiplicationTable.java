package homeworkLoops;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Write a Java program that takes a number as input and prints its
		 * multiplication table up to 10.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number for multiplication table: ");
		int num = input.nextInt();
		int result;

		for (int i = 1; i <= 10; i++) {
			result = num * i;
			System.out.println(num + " x " + i + " = " + result);
			Thread.sleep(100);
		}

		input.close();
	}

}
