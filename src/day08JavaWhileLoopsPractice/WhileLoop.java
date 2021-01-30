package day08JavaWhileLoopsPractice;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter password: ");
		int enterNum = input.nextInt();
		
		int password = 12345;
		int i = 0;
		while (enterNum !=password) {
			System.out.println("Enter you numer: ");
			enterNum = input.nextInt();
			i++;
			
		}
		
		System.out.println("Congrats!");
		
		
	input.close();

	}

}
