package day07JavaIfElseScanner;

import java.util.Scanner;

public class ScannerAddNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		int num1 = input.nextInt();
		System.out.println("Please enter the second number: ");
		int num2 = input.nextInt();
		System.out.println("Please enter the third number: ");
		int num3 = input.nextInt();
		
		if (num1>num2 && num1>num3) {
			System.out.println("The maximum number is " + num1);
		}
		else if (num1<num2 && num3<num2) {
			System.out.println("The maximum number is " + num2);
		}
		else if (num1<num3 && num2<num3) {
			System.out.println("The maximum number is " + num3);
		}
		else {
			System.out.println("The numbers are equal");
		}
		
		input.close();
	}

}
