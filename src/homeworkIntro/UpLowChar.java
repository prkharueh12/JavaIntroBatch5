package homeworkIntro;

import java.util.Scanner;

public class UpLowChar {

	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in); 
//		
//		System.out.println("Enter Char:  (ONLY A-Z or a-z)");
//		
//        char inputAlpha = input.next().charAt(0); //scanner using next().charAt(0) for Char
//        
//        int test = inputAlpha; // When letter is input inside integer, it will compare to ASCII chart. ex. int num = A ; print "65"
//        
//        System.out.println("You entered: "+inputAlpha); 
//   if (test >=65 && test <=90) {
//	   System.out.println("Uppercase");
//   }
//   else {
//	   System.out.println("Lowercase");
//   } 
//        input.close();
//
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter a word: ");
		String input = scan.nextLine();
		System.out.println("Your input is "+ input);
		
		char firstChar = input.charAt(0); // take the first digit in (String input)
		System.out.println("First char is "+firstChar);
		char letter = firstChar; // connect firstChar to the if-else condition!
		
		
		
		char a = 'a';
		char z = 'z';
		char A = 'A';
		char Z = 'Z';
		// will look for the range --> compare char '' to int in number!
		int aRefNum = a;
		int zRefNum = z;
		int ARefNum = A;
		int ZRefNum = Z;
		
		
//		System.out.println(aRefNum);
//		System.out.println(zRefNum);
//		System.out.println(ARefNum);
//		System.out.println(ZRefNum);
		
		if (letter >= aRefNum && letter <= zRefNum ) {
			System.out.println(letter + " is lowercase.");
			
		}
		else if (letter >= ARefNum && letter <= ZRefNum ) {
			
			System.out.println(letter + " is uppercase.");
		}
		else {
			System.out.println("Invalid letter");
		}
		
		scan.close();
	}

}
