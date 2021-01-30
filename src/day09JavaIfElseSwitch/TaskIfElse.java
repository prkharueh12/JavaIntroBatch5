package day09JavaIfElseSwitch;

import java.util.Scanner;

public class TaskIfElse {

	public static void main(String[] args) {
		/**
		 *  Write a Java Program using if statement.
		 *  Note: Create a variable time as a integer and print below messages: 
			     time is between 1 to 24;
		 *      Good Morning  
			5< 12 
			Good Afternoon
			12 — 17
			Good Evening
			17—24
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the time: ");
		int time = input.nextInt();
		System.out.println("You entered: " + time);
		
		if (time >= 1 && time <=12) {
			System.out.println("Good Morning");
		}
		else if (time >= 13 && time <=17) {
			System.out.println("Good Afternoon");
		}
		else if (time >= 18 && time <=24) {
			System.out.println("Good Evening");
		}
		else { 
			System.out.println("Invalid");
		}
		
		input.close();

	}

}
