package day11StringObject;

public class String_Substring {

	public static void main(String[] args) {
		String str = "Computer";
		
		System.out.println(str.substring(2, 5));
		System.out.println(str.substring(2));
		
		String email = "test@yahoo.com";
                    // .substring(index or indexOf); needs the index to start to print to the entire word.
				   //  .substring(startIndex, Non-print index )
		System.out.println(email.substring(email.indexOf('@')));
		//System.out.println(email.indexOf('@'));

	}

}
