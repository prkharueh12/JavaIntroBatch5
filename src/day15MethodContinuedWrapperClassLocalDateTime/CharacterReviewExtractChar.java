package day15MethodContinuedWrapperClassLocalDateTime;

public class CharacterReviewExtractChar {

	public static void main(String[] args) {
		
		//Extract numbers/ characters/ special char by using method class tools
		
		String str = "sdkljf1235wjw@#$#%$%^#dfjsdlfk"; 
		
		String digit = "";
		String letter = "";
		String speChar = "";
		
		
		for (int i = 0; i < str.length(); i++) {
			char eachChar = str.charAt(i); // *****list each character by using Char name =  CharAt(i)****
			// Character. to search!
			if (Character.isDigit(eachChar)) {
				digit += eachChar;
			}
			
			if (Character.isLetter(eachChar)) {
				letter += eachChar; 
			}
			
			if (!Character.isLetterOrDigit(eachChar)) {
				speChar += eachChar; 
			}
			//System.out.println(eachChar);
		}
		
		
		System.out.println(digit);
		System.out.println(letter);
		System.out.println(speChar);
		
		


	}

} // end Class
