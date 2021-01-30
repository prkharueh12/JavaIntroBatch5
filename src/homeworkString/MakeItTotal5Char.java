package homeworkString;

import java.util.Scanner;

public class MakeItTotal5Char {

	public static void main(String[] args) {
		/*
		 * Write a program that checks the length of the string. If the string length is
		 * less than 5 characters then add any character and make it a total of five
		 * chars. if the length is equal to 5 then keep the original string. if string
		 * length greater than 5 characters then keep the last 5 characters. Examples:
		 * String str1 = "computer"; String str2 = "Java"; String str3 = "Pizza";
		 * //expected “puter” , “JavaA” “Pizza”
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Input a word here: ");
		String str = input.nextLine();


		System.out.println("The word has " + str.length() + " characters.");

		if (str.length() == 1) {
			System.out.println(str.concat("AAAA"));
		} else if (str.length() == 2) {
			System.out.println(str.concat("AAA"));
		} else if (str.length() == 3) {
			System.out.println(str.concat("AA"));
		} else if (str.length() == 4) {
			System.out.println(str.concat("A"));
		} else if (str.length() == 5) {
			System.err.println(str);
		} else if (str.length() > 5) {

			for (int i = str.length() - 5; i <= str.length() - 1; i++) {
				System.err.print(str.charAt(i));
			}
		}
		else {
			System.out.println("Invalid");
		}
			
		input.close();
	}
}