package day11StringObject;

public class String_Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "Java";
		String word2 = word.concat("Love it!"); //store inside string word2 which you're able to call. 
		System.out.println(word2);
		
		System.out.println(word.concat("Selenium")); // NOT stored and can't reuse.
		
		System.out.println(word.concat( "Automaiton"));
		System.out.println(word.concat(word2));

	}

}
