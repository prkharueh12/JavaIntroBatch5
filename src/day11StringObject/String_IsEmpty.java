package day11StringObject;

public class String_IsEmpty {

	public static void main(String[] args) {
		String a = "abc";
		String b = "";
		String c = null;	
		
		if (a.isEmpty()){
			System.out.println("Check A=================");
			System.err.println("is empty");
		}
		else if (!a.isEmpty()){
			System.err.println("is Not empty");
		}
		
		
		if (b.isEmpty()){
			System.out.println("Check B================");
			System.err.println("is empty");
		}
		else if (!b.isEmpty()){
			System.err.println("is Not empty");
		}
		
		
	}

}
