package day07JavaIfElseScanner;

import java.util.Scanner;

public class ScannerIntro {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("What is you name? ");
		
		// name of you object .nextLine, .nextDouble, .nextInt
         String name = input.nextLine();
         
         
         System.out.println("How old are you? ");
         int age = input.nextInt();
         
         
         
         System.out.println("Hi!! my name is "+ name +" and I'm "+age+ " years old.");
         input.close(); // indicated that you don't want to run a scanner anymore.
         
	}

}
