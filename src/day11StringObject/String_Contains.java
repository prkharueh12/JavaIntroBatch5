package day11StringObject;

public class String_Contains {

	public static void main(String[] args) {
		String email = "test@gmail.com | ";
		// contains is boolean type.
		System.out.println(email.contains("gmail.com"));
		System.out.println(email.contains("@"));
		System.out.println(email.contains("|"));

	}

}
