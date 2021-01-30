package homeworkIntro;

import java.util.Scanner;

public class SalaryCal {

	public static void main(String[] args) {
	/*
	 * write a program that can calculate the salary after tax based on the salary and tax rate
              Ex:
                 if salary = 100000
                   taxRate = 0.28
                  totalTax = salary * taxRate;
          salary after tax = salary - totalTax
	 
		double salary = 100_000.00;
		double taxRate = 0.28;
		double totalTax= salary*taxRate;
		double salaryAftertax = salary - totalTax;
		
		System.out.println("salary after tax is $" + salaryAftertax); */
		
//		Rectangle Calculation
//         	Area = w × h
//				w = width
//				h = height
		
/*		double width = 7.7;
		double height = 2.2;
		double area = width * height ;
		
		System.out.println("The area of this rectangle is " + area); */

			
		double width_S, height_S;
		
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Enter the width: ");
		width_S = Keyboard.nextDouble();
		
		System.out.println("Enter the height: ");
		height_S = Keyboard.nextDouble();
		
		double area = width_S * height_S ;
		System.out.println("The area of this rectangle is " + area);
	}

}
