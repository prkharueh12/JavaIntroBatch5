package day11StringObject;

public class ConvertStringToNum {

	public static void main(String[] args) {
		String num = "99";
		int num2 = Integer.parseInt(num);
		
		System.out.println(num+1);
		
		System.out.println(num2+=1);
 
		String fakeBool = "True";
		boolean convert = Boolean.parseBoolean(fakeBool);
		System.out.println(convert);
		
		if (convert== true) {
			System.out.println("String fakebool ="+fakeBool + "\nboolean convert = "+convert);
		}
		
		
		
	}

}
