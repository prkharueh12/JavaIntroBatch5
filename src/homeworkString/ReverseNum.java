package homeworkString;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		/* Write a program that asks the user to input an integer and then outputs the number with the digits reversed. 
		 * For example, if the input is 34567, the output should be 76543.*/
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number(1-9) that will be reversed: ");
		int numInput = input.nextInt();
		String numToString = Integer.toString(numInput);
		System.out.println("Reversed numbers are: ");
		
		
		for (int i = numToString.length()-1; i >= 0; i--) {
			System.err.print(numToString.charAt(i));
		}
		input.close();
	}

}
