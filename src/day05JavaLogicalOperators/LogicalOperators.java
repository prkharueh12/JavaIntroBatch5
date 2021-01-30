package day05JavaLogicalOperators;

public class LogicalOperators {

	public static void main(String[] args) {
		// Logical Operator. and(&&), or(||), !
		
		int numA = 3;
		int numB= 11;
		
		//To do logical operator, you need 2 boolean 
//		boolean  resultA = numA <= 10;
//		boolean  resultB = numB <= 10;
//		System.out.println(resultA && resultB);
//		System.out.println(resultA || resultB); 
		             
		
		//True && False line 17
		System.out.println(numA++ <= numB && numB <= numA);
	}

}
