package day10JavaLoops;

import java.util.Scanner;

public class Timer {

	public static void main(String[] args) throws InterruptedException {

		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter minute(s)");
		
		for (int J = input.nextInt(); J > 0; J--) {

			for (int i = 59; i > 0; i--) {
				System.out.println((J - 1) + "minutes and " + i + " Second left");
				Thread.sleep(100);
			}
			System.err.println("Times fly!!!");

		}

		System.err.println("======TIME IS UP!!!=======");
		
		input.close(); 
	}

}
