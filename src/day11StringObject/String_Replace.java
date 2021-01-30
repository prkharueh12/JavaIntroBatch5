package day11StringObject;

public class String_Replace {

	public static void main(String[] args) {
		String word1 = "Car";
		String word2 = word1.replace('r', 't');
		System.out.println(word2);
		
		
		// Replace the whole string
		String word3 = word1.replace(word1, "Dog");
		System.out.println(word3);
	}

}
