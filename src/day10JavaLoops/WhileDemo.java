package day10JavaLoops;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		int count, number;
		System.out.println("Enter a number ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		
		count = 1;
		while (count <= number) {
			if (count == number) {
				System.out.println(count);
			}
			else {
			System.out.println(count+ ",");
			}
			count++;
		}
			
		System.out.println();
		System.out.println("Buckle my shoe.");
		
		input.close();

	}

}
