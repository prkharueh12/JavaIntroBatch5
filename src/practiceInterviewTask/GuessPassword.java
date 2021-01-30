package practiceInterviewTask;

import java.util.Scanner;

public class GuessPassword {

	public static void main(String[] args) {
		String pw = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Create you password: (at least 5 digits)");
		String setPass = input.nextLine();
		int length = setPass.length();
//		System.out.println(length);
		if (length < 5) {
			System.out.println("Re-Create a password:");
			setPass = input.nextLine();
		}
		else {
			System.out.println("Your password was successfully created.");
			setPass = pw ;
		}
	
		//String pw = "admin";
		
		
		
		//System.out.println(pw.charAt(4));

		
		//String setPass;
		String more = "Try again!";

		for (int t = 4; t >= 1; t--) {

			System.out.println("Enter password: ");
			setPass = input.nextLine();

			if (!pw.equalsIgnoreCase(setPass)) {
				System.err.println("Invalid password ");
				System.out.println((t - 1) + " time(s) left " + more);

			}
			if (setPass.equalsIgnoreCase("")) {
				System.err.println("**Field could NOT be blank**");
				
			}
			if (t == 2) {
				more = "";
			}

			if (t == 1 && !pw.equalsIgnoreCase(setPass)) {
				System.err.println("Your account is locked.\nOver 3 attempts!");

			}
			if (t == 1 && pw.equalsIgnoreCase("")) {
				more = "";

			}

			else {
				if (pw.equalsIgnoreCase(setPass)) {
					System.err.println("Congratulations! Log in successful!");
					break;
				}
			}

		}
		input.close();
	}

}
