package day11StringObject;

public class ConvertNumToString {

	public static void main(String[] args) {
		
		// create an empty string + num 
		// make it String to use String method such as indexOf, charAt,....Replace.
		int num = 100;
		
		String a = ""+ num;
		System.out.println(a);
		System.out.println(a.length());
		
		double price = 9.54545;
		String b = ""+ price;
		System.out.println(b);
		System.out.println(b.indexOf('.'));
	

	}

}
