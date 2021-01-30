package day04JavaCastingOperation;

public class OperatorsDay4 {

	public static void main(String[] args) {
		// addition
		//int num1 = 5;
		//short num2 = 6;
		
		//int num3 = num1+num2;
		//System.out.println(num3);
		//System.out.println(num1+num2);
		
		//System.out.println(num1*num2);

		//int numA = (int) 5.5; 
		double numB = 5.5;
		int numC = 8 ;
		
		long numD= (long) numB*numC;
		double numE = numB*numC ;
		//System.out.println("This is long: "+numD);
		//System.out.println("This is double: "+numE);
		
	//division with Explicit type (casting).	
	int num1 = 5;
	int num2 = 6;
	double resultA = (double) num1 / (double) num2;
	float resultB =  (float)num1 / (float)num2;
//	System.out.println("num1 / num2 = resultA-->  = "+resultA);
//	System.out.println("num1 / num2 = resultB-->  = "+resultB);
		
		
		int Cal1 = 11;
		int Cal2 = 7;
		double Cal3 = (double)Cal1/ (double)Cal2;
		System.out.println(Cal3);
		
		//Modulus
		 Cal1 = 10;
		 Cal2 = 3;
		 
		 System.out.println(Cal1%Cal2 ); // result is 1
		 
		 Cal1++; //print 11
		 Cal1--; //print 10
		  System.out.println(Cal1); // result is 11
		 
		 int numOne = 10 ; //declare variable type and put value
		// numOne++;         // increment by using variable name++
		// System.out.println(numOne);
		//System.out.println(numOne ++); // post fix will need another sysout (numOne)
		 
		System.out.println(++numOne);// otherwise use pre fix.
	}

}
  