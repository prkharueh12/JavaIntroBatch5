package day15MethodContinuedWrapperClassLocalDateTime;

public class MethodValueOf {

	public static void main(String[] args) {
		String str = "123";
		
		// convert string to the different data type
		int num = Integer.parseInt(str);//String to int 
		
		byte b = Byte.parseByte(str);//String to byte  
		
		short s = Short.parseShort(str); //String to short 
		
		long l = Long.parseLong(str); //String to Long 
		
		int num2 = Integer.valueOf(str); // same as line 18
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		

	}

}
