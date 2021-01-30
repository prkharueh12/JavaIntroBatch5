package day19OOP_Encapsulation;

public class LoginTest {

	public static void main(String[] args) {
		Credentials loginInfo = new Credentials();
		
		System.out.println("Enter username: ");
		System.out.println(loginInfo.getUsername());
		
		System.out.println("Enter password: ");
		System.out.println(loginInfo.getPassword());
		
		System.out.println("Press SUBMIT button");

	}

}
