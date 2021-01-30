package day07JavaIfElseScanner;

import java.util.Scanner;

public class ScannerVote {

		public static void main(String[] args) {
			  /*write a program that can check 
	       * if the person is eligible to vote 
	       * for Donald Trump or Joe Biden
	       * Ex:name = "John" citizenShip = "USA"
	       * output:John is eligible to vote for Donald Trump or Joe Biden?true
	      */
			Scanner a = new Scanner(System.in);
			System.out.println("Please enter your name");
			String name = a.nextLine();
			System.out.println("Please enter your nationallity");
			String citizenShip = a.nextLine();//"USA";
			System.out.println("How old are you?");
			
			
			int age = a.nextInt();//9;
			boolean isEligible = citizenShip.equals("USA") && age >=18;
			if (isEligible) {
				System.out.println(name+" is eligible to vote for Donald Trump or Joe Biden?"+ isEligible);
			}
			//same as above
//			if (citizenShip.equals("USA") && age >=18) {
//				System.out.println(name+" is eligible to vote for Donald Trump or Joe Biden?"+ isEligible);
//			}
			a.close();


	}

}
