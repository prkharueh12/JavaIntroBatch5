package day15MethodContinuedWrapperClassLocalDateTime;

public class WrapperAutoboxingUnBoxing {

	public static void main(String[] args) {
		byte val1 = 28 ;
		Byte val2 = val1 ; // Auto boxing!!
		
		char charValue = 'c';
		Character charValue2 = charValue;
		
		System.out.println(charValue2.charValue());

		System.out.println(charValue2.isLetterOrDigit(charValue)); // true
		
		
		int numA =4 ;
		Integer numB = numA;
		System.out.println(numB.intValue());
		
		float num = 123.44f;
		Float numNew = num;
		System.out.println(numNew.toString());
		
		
		
	// UnBoxing-----> Obj to primitive
		
		Integer a = new Integer(10);
		int b = a.intValue(); 
		System.out.println(b);
		
	}

}
