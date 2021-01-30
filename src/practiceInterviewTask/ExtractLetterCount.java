package practiceInterviewTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractLetterCount {

	public static void main(String[] args) {
		String alpha = "aaabbcccdde";
		
		String uniChar= "";
		
		for (int i = 0; i < alpha.length(); i++) {
			char ch = alpha.charAt(i);
			if (uniChar.indexOf(ch) == -1) {
				uniChar = uniChar+ Character.toString(alpha.charAt(i));
			}
		}
		System.out.println(uniChar);
		//nested loop to compare!!!
	for (int i = 0; i < uniChar.length(); i++) {
		int count = 0 ;
		for (int j = 0; j < alpha.length(); j++) {
			if (uniChar.charAt(i) == alpha.charAt(j)) {
				count++;
			}
		}
		System.out.println(uniChar.charAt(i) + " has "+ count);
	}




	}

}
