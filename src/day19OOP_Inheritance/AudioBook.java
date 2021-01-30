package day19OOP_Inheritance;

public class AudioBook extends EBook {
	String type;
	
	public void readBook () {
		System.out.println("Listening to "+ title);
	}
}
