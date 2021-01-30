package day07JavaIfElseScanner;

import java.util.Scanner;

public class ScannerValidateTriangle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter first triangle: ");
		int first = input.nextInt();
		System.out.println("Please enter second triangle: ");
		int second = input.nextInt();
		System.out.println("Please enter thirde triangle: ");
		int third = input.nextInt();
		
		if (first + second + third == 180) {
			System.out.println("It is a valid triagle!");
		}
		else {
			System.out.println("It is not a triagle");
		}

         input.close();
	}

}
