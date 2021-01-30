package day11StringObject;

public class String_ToUpperLowerCase {

	public static void main(String[] args) {
		
		//same as Scannner input = new Scanner();
		String word1 = new String("Manchester United");
		String word2 = "RED DEVIL ARMY";
		
		String toUp = word1.toUpperCase();
		String toLow = word2.toLowerCase();
		
		System.out.println(toUp);
		System.out.println(toLow);
		
		
		String str1 = "Bruno";
		String str2 = "BRUNO";
		
		// compare by using upper case  & lower case in the if condition.
		// we can add .method as many as we want
	
		if (str1.trim().equals(str2.trim().toUpperCase())) { 
			
			System.out.println("SAME");
		}else {
			System.out.println("NO");
		}
		
		
		
		

	}

}
