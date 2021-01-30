package day12Arrays;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		String str = "learning java";
		
		//convert string to an array using char
		char newArrays [] = str.toCharArray();
		
		Arrays.sort(newArrays); // sort will take care of alpha order, but  capital letters always come first!
		
		for (int i = 0; i < newArrays.length; i++) {
			System.out.println(newArrays[i]);
		}
		
		
		// task - create arrays of multiple names and sort as alphabetical order, then print the first one.
		
		String players [] = {"Henderson", "Magguire", "Van De Beek", "Bruno", "Cavani", "Antonie"};
		
		Arrays.sort(players);
		
		for (int i = 0; i < players.length; i++) {
			System.out.print(players[i] + ", ");
		}
		System.out.println();
		System.out.println("The first plater is "+players[0]);
	}
 
}
