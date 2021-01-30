package practiceInterviewTask;

import java.sql.Array;
import java.util.Arrays;

public class mainCall {

	public static void main(String[] args) {
		
		int num1 [] = {69,80,39,79} ;
		
		int num2 [] = {90,800,56,33,678,433,221} ;
		
		withMainCallUtil test = new withMainCallUtil () ;
		test.myfirstStatement();
		
		sameClassPrint ();
	
		
		test.maxNumArr(num2);
		
	}

	
	public static void sameClassPrint () {
		
		System.out.println("Hello from the same class");
	}
	
	
} //end class

	
	
	
	
	