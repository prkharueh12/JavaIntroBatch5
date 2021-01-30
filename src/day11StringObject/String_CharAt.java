package day11StringObject;

public class String_CharAt {

	public static void main(String[] args) {
		// String literal - no need to declare.
		
//		System.out.println("Park".charAt(0));
		
		// CharAt() is a method!
		String name = "TechCircle";
//		System.out.print(name.charAt(0));
//		System.out.print(name.charAt(1));
//		System.out.print(name.charAt(2));
//		System.out.print(name.charAt(3));
//		System.out.print(name.charAt(4));
//		System.out.print(name.charAt(5));
		
		//Print TechCircle with for loop
//		for (int i = 0; i <= 9; i++) {
//			//System.out.println(i);
//			System.out.print(name.charAt(i));
//		}
		
		//Validate if package is in 2021
//		String pattNum = "IPR2021-31215646";
//		if(pattNum.charAt(3) == '2' && pattNum.charAt(4)== '0' && pattNum.charAt(5)== '2' && pattNum.charAt(6)== '1') {
//			System.out.println("Current year is 2021.");
//		}else {
//			System.out.println("Failed, Please Update.");
//		}
      
		
		// Task: check if the first and the last letter of the string are the same?
		String str = "civic";
		
		//Also use : if (str.charAt(0)== str.charAt(str.length()-1))
		//or declare int lastIndex = str.length()-1;
		System.out.println(str.charAt(str.length()-1));
		System.out.println(str.charAt(0));
		
		if (str.charAt(0)== str.charAt(str.length()-1)) {
			System.out.println("They are the same.");
		}else {
			System.out.println("They ain't the same");
		}
		
		// use For loop and .length to print a string
		// or for (int i = 0; i <= str.length()-1; i++)

		for (int i = 0; i < str.length(); i++) {
			System.err.print(str.charAt(i));
			
		}
		
	}

}
