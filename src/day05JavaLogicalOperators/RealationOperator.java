package day05JavaLogicalOperators;

public class RealationOperator {

	public static void main(String[] args) {
		//Relational Operator
		double numA = 10.555;
		double numB = 10.555;
		double numC = 11;
		boolean result = numA==numB; // It has to to be the same data type, even though they are casted.
		
		
		float numD = 10.555F;
		float numE = 2.345555F;
		float numF = 5.345555F;
		
		double numG = numD; //Auto casting Float numD 
		
		char A = 'A';
		char a = 'a';
		
		boolean resultA = A != a;
		
		System.out.println(resultA);
		//System.out.println(numOne==numTwo);
		
		
		


	}

}
