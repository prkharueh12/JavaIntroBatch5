package day07JavaIfElseScanner;

import java.util.Scanner;

public class Task1Vote {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter your age: ");
		int age = input.nextInt();
		
		System.out.println("Your age is " + age + " years old");
		
		if (age >= 1  || age < 130) {
		
			if (age >= 18) {
				System.out.println("You're eligible to vote!");
			}
			else  {
				System.out.println("You're NOT eligible to vote!");
			}
		}
		else {
			System.out.println("Invalid age Re-enter!");
		}
		input.close();
	}

}
