package day07JavaIfElseScanner;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Is the match suspended? : True or False");
	
		boolean chk = input.nextBoolean();
		System.out.println("Answer: " + chk);

		if (chk == true) {
			System.out.println("Match is suspended!");
		} else
			System.out.println("What is your team score: ");
				int urScore = input.nextInt();
				System.out.println("What is their team score: ");
				int theirScore = input.nextInt();
				if (urScore > theirScore) {
					System.out.println("You won");
				} else if (urScore < theirScore) {
					System.out.println("You lost");
				} else if (urScore == theirScore) {
					System.out.println("Draw");
				}

		input.close();

	}

}
