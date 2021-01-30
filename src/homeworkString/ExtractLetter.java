package homeworkString;

public class ExtractLetter {

	public static void main(String[] args) {
		/*Write a program to extract all the letter from a given alphanumeric string "a1b2c34d098098efg"
		output:
		abbdefg

		*/
		
		String ref = "abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";
		
		String word = "a1b2c34d098098efg";
		
		char a = 'a';
		char z = 'z';
		int numOfa = a ;
		int numOfz = z ;
		System.out.println(numOfa +" to "+ numOfz);
		//Method 1 using indexOf ref if all element is valid. (>1)
		
//		for (int i = 0; i < word.length(); i++) {
//			//System.out.println(word.charAt(i));
//			
//			if( ref.indexOf(word.charAt(i))>-1) {
//				System.out.print(word.charAt(i));
//			}
//		
//		}
	
		// Method 2 using for loop to print all required element and use .contain(Char to String) in to match the list.
		
//		for (int i = 0; i < word.length(); i++) {
//			if (word.contains(Character.toString(ref.charAt(i)))) {  Character.toString is in used because we need a letter to match.
//				//System.out.print(ref.charAt(i));
//			}
//		}
			
		// Method 3 using for loop to print all require element and compare with a-z by number.
		
		for (int i = 0; i < word.length(); i++) {
			//System.out.print(word.charAt(i));
			
			int number = word.charAt(i); // number will contain # in all element *word
			
			// if will scope numOfa-numOfz with number in *word element
			if (number >= numOfa && number <= numOfz) {
				System.out.print(word.charAt(i));
			}
		}
		
		
	}

}
