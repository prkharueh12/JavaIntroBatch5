package day10JavaLoops;

import java.util.Random;
import java.util.Scanner;

public class GuessNumGame {

	public static void main(String[] args) {
		Random ranNum = new Random();

		int numOut = ranNum.nextInt(10);
		System.out.println(numOut);

		int count = 3;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Please quess a secret number?");
			int enter = input.nextInt();
			if (enter == numOut) {
				System.err.println("Congratz!!");
				break;
			} else if (enter < numOut) {
				System.out.println("Too low");
				System.out.println("You have " + (count - 1) + " left");
			} else {
				System.out.println("Too high");
				System.out.println("You have " + (count - 1) + " left");
			}

			if (count == 1) {
				System.out.println("GAME OVER!!");
				break;
			}

			count--;
		} while (count < 3);

		input.close();

	}

}
