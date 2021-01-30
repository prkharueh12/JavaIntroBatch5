package homeworkIntro;

import java.util.Scanner;

public class GradeLevel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your school grade in number? ");
		byte num = input.nextByte();
		
		switch (num) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("You're in Elementary School.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("You're in Middle School.");
			break;
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("You're in High School.");
			break;
		case 13:
		case 14:
		case 15:
		case 16:
			System.out.println("You're in College.");
			break;
		case 17:
		case 18:
			System.out.println("You're in Grad School.");
			break;
		default:
			 System.out.println("Invalid.");
			break;
		}
		
		input.close();
	

	}

}
