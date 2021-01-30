package day12Arrays;

public class ForLoopStrLengthLetter {

	public static void main(String[] args) {
		String name[] = { "Bruno", "Martial", "Greenwood", "Bissaka", "Fred", };
		for (int i = 0; i < name.length; i++) {
			
			//System.out.print(name[i] + " ");
//			if (name[i].length() <4) {}
//			System.out.println(name[i]);
			
			
			
			System.out.println();
			//convert String Array to Char Array in order to break down each character, so that we can find last char, length ...
			char charArr [] = name[i].toCharArray();
			
			for (int j = 0; j < charArr.length; j++) {
			//	System.out.print(charArr[j] + " ");
				
				if (charArr[j] == 'd' || charArr[j] == 'l' ) {
					//System.out.println(name[i]);
					
				}
			}
			//System.out.println();
			// print last char of each name
			//System.out.println(name[i].charAt(name[i].length()-1));
			
			//print index of each name
			//System.out.println(name[i].length());
			
			//print length of 
			//System.out.println(name[i].length());
			
			// print last 2 char of each name *using substring
			//System.out.println(name[i].substring(name[i].length()-2));
		}

	}

}
