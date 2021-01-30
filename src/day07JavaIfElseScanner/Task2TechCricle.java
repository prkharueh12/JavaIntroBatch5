package day07JavaIfElseScanner;

import java.util.Scanner;

public class Task2TechCricle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter school name: ");
		String enterName = input.nextLine();	
		
		System.out.println("You entered: " + enterName);
		String schoolName = "TechCircle";
		
		if (enterName.equals(schoolName)) {
			System.out.println("Correct!");
		}
		else {
			System.out.println("Incorrect!");
		}

		input.close();
	}

}
