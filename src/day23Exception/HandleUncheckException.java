package day23Exception;

public class HandleUncheckException {

	public static void main(String[] args) {
		
		int x = 4 ;
		int y = 2 ;
		
		try {
		System.out.println("The result is: "+x/y);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("I'm here!!!");

	}

}
