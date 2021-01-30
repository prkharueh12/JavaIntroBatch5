package homeworkIntro;

import java.util.Scanner;

public class ScannerAge {

	public static void main(String[] args) {
		/*
		2. write a program that can define the age groups of a person
		age groups are:
		infant (1 - 2)
		Toddler (3 - 5),
		Kid (6 - 9),
		Pre-Teen (10 - 12),
		Teenager (13 - 17),
		Young Adult (18 - 20),
		Adult (21 - 39),
		Young Middle-Aged Adult (40 - 49),
		Middle-Aged Adult (50 - 54),
		Very Young Senior Citizen (55 - 64),
		Young Senior Citizen (65 - 74),
		Senior Citizen (75 - 84),
		Old Senior Citizen (85+)
		*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the age: ");
		int enterAge = input.nextInt();
		System.out.println("Your age is: " + enterAge);
		
		if (enterAge >= 1 && enterAge < 130) {
			if (enterAge >= 1 && enterAge <=2 ) {
				System.out.println("Infant");
			}
			else if (enterAge >=3 && enterAge <=5) {
				System.out.println("Toddler");
			}
			else if (enterAge >=6 && enterAge <=9) {
				System.out.println("Kid");
			}
			else if (enterAge >=10 && enterAge <=12) {
				System.out.println("Pre-Teen");
			}
			else if (enterAge >=13 && enterAge <=17) {
				System.out.println("Teenager");
			}
			else if (enterAge >=18 && enterAge <=20) {
				System.out.println("Young Adult");
			}
			else if (enterAge >=21 && enterAge <=39) {
				System.out.println("Adult");
			}
			else if (enterAge >=40 && enterAge <=49) {
				System.out.println("Young Middle-Aged Adult");
			}
			else if (enterAge >=50 && enterAge <=54) {
				System.out.println(" Middle-Aged Adult");
			}
			else if (enterAge >=65 && enterAge <=74) {
				System.out.println("Young Senior Citizen");
			}
			else if (enterAge >=75 && enterAge <=84) {
				System.out.println("Senior Citizen");
			}
			else if (enterAge >=85  ) {
				System.out.println("Old Senior Citizen");
			}
			
			
		}
		else {
			System.out.println("Please enter valid age");
		}
		
		input.close();

	}

}
