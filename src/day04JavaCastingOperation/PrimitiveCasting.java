package day04JavaCastingOperation;

public class PrimitiveCasting {

	public static void main(String[] args) {
		//convert data type 
		
		byte num1 = 8;    //Implicit casting
		long num2 = num1; //cast small data type value to larger. Casting syntax is no needed.
		
		long num3 = 6 ;          // Explicit casting
		byte num4 = (byte)num3 ; // Large data type value to small.  Casting syntax is needed.

		short num5 = 3000;
		long num6 = num5;
		//System.out.println("This is Short to Long type: " + num6);
		
		int num7 = (int) num6;
		//System.out.println("This is int to Long type: " + num7); 
		
		float num8 = 5.23F;
		double num9 = num8;
		
		float num10 = (float) num9;
		
		double test1 = 50.44;
		int test2 = (int)test1;
		
		System.out.println("This is double to int type: " + test2);
		
		
		 
		
	}

}
