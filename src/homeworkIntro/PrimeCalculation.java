package homeworkIntro;

import java.util.Scanner;

public class PrimeCalculation {

	public static void main(String[] args) {
		// Create a program to calculate shipping for amazon shopping 
		//  ask user if they are prime member or not / expect yes or no answer 
		// if yes -->> shipping is free 
		// if no -->> 
		// ask user what the amount for your shopping as double 
		// if the number is more than 35 --->> free shipping 
		//	 print your total is same number as user entered
		// if the number is less than 35 -->> the add 5 dollar shipping 
		//print your total is 5 dollar more than your number 
		
		Scanner input = new Scanner(System.in);
		System.out.println("Are you a prime member?");
		String prime = input.nextLine();
	
		final double FEES = 5.0 ;
		
		if (prime.equalsIgnoreCase("NO")) {
			
			System.out.println("How munch have you shopped today?");
			double priceShop = input.nextDouble();
				if (priceShop >=35){
					System.out.println("You have shopped for $"+ priceShop);
					System.out.println("Congrats! You're eligible for free shipping.");
				}else {
					System.out.println("You have shopped ONLY $"+ priceShop);
					priceShop += FEES;
					System.out.println("Your total now is $"+ priceShop + " with $5 shipping fees applied.");
				}
			
		}else {
			if (prime.equalsIgnoreCase("YES")) {
			System.out.println("Hi! Prime Member enjoy shopping: you earn free shipping.");
			}else {
				System.out.println("Please  answer ONLY: YES or NO");
			}
		}
       input.close();
	}

}
