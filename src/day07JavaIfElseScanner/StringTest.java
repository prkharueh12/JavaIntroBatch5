package day07JavaIfElseScanner;

public class StringTest {

	public static void main(String[] args) {
		
		//use .equal (object)
		String str = "Hello";
		String str2 = "Hello";
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		System.out.println(str.equals("Hello"));

		// compound with if else - to change the value with if-else
		int num1 =3;
		int num2=5;
		int count =1;
		
		if (count>50) {
			num1 =30;
			num2 =50;
			System.out.println("Numbers are changed to " + num1 +" and " + num2);
		}
		else {
			System.out.println("Numbers are" + num1 +" and " + num2);
		}
	}

}
