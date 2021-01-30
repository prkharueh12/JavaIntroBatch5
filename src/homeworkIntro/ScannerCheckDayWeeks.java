package homeworkIntro;

import java.util.Scanner;

public class ScannerCheckDayWeeks {

	public static void main(String[] args) {
		/*
		1. write program that can print out the name of the day based on the number 1 ~ 7
		number = 1  // 1 ~ 7
		output:
		Monday
		number = 5
		output:
		Friday
		*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number to check day of the week: ");
		
		int enterNum = input.nextInt();
		
	//	if (enterNum >=1 && enterNum <=7) {
			
			if (enterNum == 1) {
				System.out.println("Monday");
			}
			else if (enterNum == 2) {
				System.out.println("Tuesday");
			}
			else if (enterNum == 3) {
				System.out.println("Wendsday");
			}
			else if (enterNum == 4) {
				System.out.println("Thursday");
			}
			else if (enterNum == 5) {
				System.out.println("Friday");
			}
			else if (enterNum == 6) {
				System.out.println("Saturday");
			}
			else if (enterNum == 7) {
				System.out.println("Sunday");
	//		}	
			
			
		}
		else {
			System.out.println("Invalid number of the weeks: Re-enter: 1-7");
		}
		
		input.close();
		
	/* 
	 * int num = 10;
		String month  = "Invalid month";
		int days = 0;
		if (num == 1) {
			month = "January";
			days = 31;
		}
		if (num == 2) {
			month = "February";
			days = 28;
		}
		if (num == 3) {
			month = "March";
			days = 31;
		}
		if (num == 4) {
			month = "April";
			days = 30;
		}
		if (num == 5) {
			month = "May";
			days = 31;
		}
		if (num == 6) {
			month = "June";
			days = 30;
		}
		if (num == 7) {
			month = "July";
			days = 31;
		}
		if (num == 8) {
			month = "August";
			days = 31;
		}
		if (num == 9) {
			month = "September";
			days = 30;
		}
		if (num == 10) {
			month = "October";
			days = 31;
		}
		if (num == 11) {
			month = "November";
			days = 30;
		}
		if (num == 12) {
			month = "December";
			days = 31;
		}
		System.out.println(month);
		System.out.println(num + " is "+ month);
//		1 is january has 31 days
		System.out.println(num + " is "+ month + " and "+month+" has "+ days+" days");

	 * 
	 * 
	 * 
	 * */	
		
		
		
		
		
		
		
		
		

	}

}
