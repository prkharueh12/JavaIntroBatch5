package day16ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class ExractFilterDigitLetterChar {

	public static void main(String[] args) {
		String str = "abc123!@#defg4567$%^hijk890&*()(";
		
		String arr [] = str.split(""); // make arrays [] it will split to 2 arrays.
		
//		System.out.println(str);
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
		
		/* 1. Convert String str to Array []
		 * 2. Create new 3 ArraysList <String>
		 * 3. Use lambda expression to differentiate Alpha, Num, Special Char */
		
		ArrayList <String> digit = new ArrayList <String> (Arrays.asList(arr)); 
		// Remove everything that is not numbers.
		// park is value; could be anything!
		digit.removeIf(park -> !Character.isDigit(park.charAt(0)));
		System.out.println(digit);
		
		
		ArrayList <String> letter = new ArrayList <String> (Arrays.asList(arr)); 
		letter.removeIf(alpha -> !Character.isLetter(alpha.charAt(0)));
		System.out.println(letter);
		
		ArrayList <String> special = new ArrayList <String> (Arrays.asList(arr)); 
		special.removeIf(sp -> Character.isLetterOrDigit(sp.charAt(0)));
		System.out.println(special);
		
	}
	

}
