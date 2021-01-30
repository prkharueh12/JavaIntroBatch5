package homeworkIntro;

import java.util.Scanner;

public class ScannerDigits {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = input.nextInt();
		System.out.println("Your number is: " + num);
		
		if (num >= 1 && num !=0) {
			if (num >= 1 && num <=9 ) {
				System.out.println("1 digit");
			}
			else if (num >=10 && num <=99) {
				System.out.println("2 digits");
			}
			else if (num >=100 && num <=999) {
				System.out.println("3 digits");
			}
			else if (num >=1000 && num <=9999) {
				System.out.println("4 digits");
			}
			else if (num >=10000 && num <=99999) {
				System.out.println("5 digits");
			}
			else if (num >=100000 && num <=999999) {
				System.out.println("6 digits");
			}

	}
else {
			System.out.println("Please enter valid number");
		}
		
		input.close();
}
}
