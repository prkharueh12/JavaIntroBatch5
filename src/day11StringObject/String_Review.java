package day11StringObject;

public class String_Review {

	public static void main(String[] args) {
		String email = "test@gmail.com";

	//	System.out.println(email.substring(email.indexOf("@") + 1));
		

//		boolean check = true;
//		System.out.println(email.contains("@gmail.com"));
//		if (check == true) {
//			
//			System.out.println("Domain is gmail.com");
//		}

		int indexOfad = email.indexOf('@');
		int indexOfdot = email.indexOf('.');
		String domainName = email.substring(indexOfad + 1, indexOfdot);
		System.out.println(domainName); // will print gmail

		char a = 'a';
		char z = 'z';
		int value_a = a;
		int value_z = z;

		System.out.println(value_a);
		System.out.println(value_z);
		char valueAl = ' ';

		for (int i = value_a; i < value_z; i++) {
			valueAl = (char) i; // cast it to char in order to get char ' ' letter
			System.out.println(valueAl);

		}

	}
}
