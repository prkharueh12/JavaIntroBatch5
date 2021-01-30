package homeworkString;

import java.util.Scanner;

public class FindMidChar {

	public static void main(String[] args) {
		/*
		 * Write a Java program to find the middle character of a string. If the length
		 * of the string is odd there will be one middle character. If the length of the
		 * string is even there will be 2 middle characters. Test Data: Input a string:
		 * abcde Expected Output: c Input a string: car11car Expected Output: 11
		 * 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = input.nextLine();

		int length = word.length();

		int sum = (length / 2);
		int sum2 = (length / 2) - 1;

//		String alphasum1 = Integer.toString(sum);
//		String alphasum2 = Integer.toString(sum2);

		if (length % 2 == 1) {
			System.out.println(word.charAt(sum));
		}
		if (length % 2 == 0) {
			System.out.print(word.charAt(sum2));
			System.out.println(word.charAt(sum2 + 1));

			input.close();
		}
		
		/*Write a Java program to replace the word dog with the word cat.
			String str = "The quick brown fox jumps over the lazy dog.";
	

		String str = "The quick brown fox jumps over the lazy dog.";
		String newStr = str.replace("dog.", "cat.");
		System.out.println(newStr);
		* */
	}
}
