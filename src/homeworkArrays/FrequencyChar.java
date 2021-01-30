package homeworkArrays;

import java.util.Arrays;

public class FrequencyChar {

	public static void main(String[] args) {
		/*FrequencyOfEachChars1. write a program that can return the frequency of characters from a StringEx:
		 * str = "ababaac";
		 * output:a4b2c1
			Step 1: remove duplicates
			Step 2: find the frequency of each nonDiup characters from the original string
*/
	
			//        abc
					String str = "ababaac ";
					String uniqueChars = "";
					for (int i = 0; i < str.length(); i++) {
			//System.out.println(str.charAt(i));
						char ch = str.charAt(i);
			//uniqueChars = Character.toString(str.charAt(i));
						if (uniqueChars.indexOf(ch) == -1) {
							uniqueChars += Character.toString(str.charAt(i));
						}
					}
					System.out.println(uniqueChars);
					
					for (int i = 0; i < uniqueChars.length(); i++) {
			//System.out.println(uniqueChars.charAt(i));
						int Frequency = 0;
						for (int j = 0; j < str.length(); j++) {
							if (uniqueChars.charAt(i) == str.charAt(j)) {
								Frequency++;
							}
						}
						System.out.print(uniqueChars.charAt(i));
						System.out.print(Frequency);
					}
	}

}
