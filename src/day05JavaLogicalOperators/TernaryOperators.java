package day05JavaLogicalOperators;

import java.util.Scanner;

public class TernaryOperators {

	public static void main(String[] args) {
		//Scanner + Ternary
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter you number: ");
//		int numA = input.nextInt();
//		
//		int a = 5;
//		
//		int b = (a == numA) ? 50: 70;
//		System.out.println("The value of b is " + b);
//		
//		input.close();
		
		
//		int n1 = 10;
//		int n2 = 9;
//		int max = (n1 >= n2 ) ? 10 : 9;
//		System.out.println("The largest number is: "+max);
		
		// using String to compare 2 variable
		
		double num = -5.6;
		//String test;
		String test = (num>0)? "Positive" : "Negative";
		System.out.println("The number is: "+ test);
		
		//boolean
		boolean result2 = (num>0) ? true : false;
		System.out.println("The answer is: "+ result2);
		
		int a = 10; 
		a= 100;
		// after this line, maxPlayer must not be able to change.
		final int maxPlayer = 12;
		
	}

}
