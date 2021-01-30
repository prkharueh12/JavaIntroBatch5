package day05JavaLogicalOperators;

public class Task {

	public static void main(String[] args) {
		
		//TASK 1
//		String name = "James";
//		int age = 19;
//		boolean result = (age > 20) ? true: false;
//		
//		System.out.println(name+ " is eligible to buy alcohol? " + "\n\t"+result);

	//----------------------------------------------------------------------------------
//		int current = 13 ;
//		
//		
//		String check = (current >12) ? " PM" : " AM";
//		
//		current = (current >12) ? current -12: current;
//		
//		System.out.println("Current time is " + current + check);
		
		// writ your program that can decide your entered number. if it is even printing your number,Even number, and Sunny day, or printing your number,Odd number, and Rainy day 
		
		int numA = 10;
		int cal = (numA %2);
		String check = (cal == 0) ? "Even number, ":"Odd number";
		String result = (cal == 0) ? "then Sunny day!": " then rainy day!";
		System.out.println("You entered: " + numA + " ; it is " + check + result);
		
		
	//----------------------------------------------------------------------------------	
//		int num = 5;
//		boolean resultA = (num > 0) ? true: false;
//		boolean resultB = (num < 0) ? true: false;
//		boolean resultC = (num == 0) ? true: false;
//			
//		System.out.println(num + " is positive number" + " :" +resultA);
//		System.out.println(num + " is negative number" + " :" +resultB);
//		System.out.println(num + " is zero "+ " :" +resultC);
		
		
//----------------------------------------------------------------------------------		
//		int number = 200;
//        boolean isPositive = number > 0; // if number is greater than zero then it is positive
//        boolean isNegative = number < 0; // if number is less than zero then it is negative
//        boolean isZero =   number == 0; // if number is equal to zero, then it's zero
//        System.out.println( number+ " is positive number: " + isPositive);
//        System.out.println( number+ " is negative number: " + isNegative);
//        System.out.println( number+" is zero: "+isZero);
	}

}
