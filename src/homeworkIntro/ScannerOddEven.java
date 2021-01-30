package homeworkIntro;

import java.util.Scanner;

public class ScannerOddEven {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Enter number to check odd or even: ");
//		
//		int enterNum = input.nextInt();
//		
//		System.out.println("You have entered: "+ enterNum);
//		
//		if (enterNum % 2 == 0) {
//			System.out.println("It is an even number!");
//		}
//		else  {
//			System.out.println("It is an odd number!");
//		}
//       input.close();
		
		 Scanner sc = new Scanner(System.in); 
		   
	        // Character input 
		 System.out.println("Enter Char: ");
	        char c = sc.next().charAt(0); 
	        int test = c;
	   if (test >=65 && test <=90) {
		   System.out.println("Uppercase");
	   }
	        // Print the read value 
	        System.out.println("c = "+c); 
	        
	        sc.close();
	}

} 
