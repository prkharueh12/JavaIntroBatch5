package day19OOP_Inheritance;

public class BookObject {

	public static void main(String[] args) {
		
		EBook eB = new EBook ("JAVA", "Katherine ", 32.99, "Large", 532);
		
		System.out.println(eB.toString());
		
		System.out.println(eB.author);
		System.out.println(eB.size);
		
		System.out.println("*****************");
		AudioBook AB = new AudioBook () ;
		AB.title= "JAVA Inheritance";
		AB.readBook();
		

	}

}
