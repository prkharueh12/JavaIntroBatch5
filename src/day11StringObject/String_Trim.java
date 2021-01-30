package day11StringObject;

public class String_Trim {

	public static void main(String[] args) {
		// Trim will remove white spaces.
		String word = "               hello";
		String word2 = word.trim();
		
	
		System.out.println(word);
		System.out.println("Before triming: "+word.length());
		
		// same as line 15 ---> System.out.println(word.trim());
		System.out.println(word2);
		System.out.println("After triming : "+word2.length());
	}

}
