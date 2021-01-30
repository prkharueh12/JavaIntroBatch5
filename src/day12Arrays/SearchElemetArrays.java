package day12Arrays;

public class SearchElemetArrays {

	public static void main(String[] args) {
		String myArrays[] = { "Java", "JDBC", "SQL", "Jenkins", "Cucumber" };
		
		for (int i = 0; i < myArrays.length; i++) {
			 System.out.println("num["+ i +"]"+myArrays [i]);
			// System.out.print(i);

			if (myArrays[i].equals("Jenkins")) {
				System.out.println("Found it");
				System.out.println("Index of Jenkins is :"+ i); //i = 3 only because it was controlled by if-else

			}
		}
		
		
		
	}

}
