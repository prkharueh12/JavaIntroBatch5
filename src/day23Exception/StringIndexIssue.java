package day23Exception;

public class StringIndexIssue {

	public static void main(String[] args) {
		String str = "Welcome!";

		char[] strArr = str.toCharArray();

		try {

			for (int i = 0; i <= strArr.length; i++) {
				char eachChar = strArr[i];
				System.out.println(eachChar);
			}
			//(ArrayIndexOutOfBoundsException e)
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("I am through!!");

	}
}