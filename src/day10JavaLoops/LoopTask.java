package day10JavaLoops;

import java.util.Scanner;

public class LoopTask {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Task 1: Write a program to print numbers from 20 to 30. You can use: for loop
		 * while loop do while loop Task 2: Write a program to calculate the sum of Task
		 * 3: Write a program that ask the user to input a positive integer. It should
		 * then print the multiplication table of that number
		 */
		System.err.println("Task1. Write a program to print numbers from 20 to 30. You can use:");
		for (int i = 20; i <= 30; i++) {
			System.out.println(i);

		}
		System.err.println("Task2. Write a program to calculate the sum of 1-1000");
		int sum = 0;
		for (int num = 1; num <= 100; num++) {
			System.out.println(num);
			sum = sum + num;

		}
		System.out.println("The total is " + sum);

		System.err.println("\nTask 3. multiplication table of that number");

		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sum1 = 0;

		for (int i = 1; i <= 12; i++) {
			sum1 = num * i;
			System.out.println(num + " x " + i + " = " + sum1);
			Thread.sleep(1000);
			
		}
		System.err.println("DONE!!!");
		
		input.close();
	}

}
