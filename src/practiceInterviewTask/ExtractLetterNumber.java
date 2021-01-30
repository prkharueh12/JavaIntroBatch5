package practiceInterviewTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractLetterNumber {

	public static void main(String[] args) {
		String text = "SDET2021TechCircleBatch5";
		String text1 = "Manchester1998Win3champions";
		
		splitMethod(text1);
		splitMethod(text);
		
		
		
//		//convert regular Sting to ArraysList
//		String splitText [] = text.split("");
//		
//		//create a list that will contain only a letter by using lambda predicate
//		ArrayList <String> txt = new ArrayList <String> (Arrays.asList(splitText));
//		txt.removeIf(d-> Character.isDigit(d.charAt(0)));
//		// same here but only numbers
//		ArrayList <String> num = new ArrayList <String> (Arrays.asList(splitText));
//		num.removeIf(d-> !Character.isDigit(d.charAt(0)));
//	
//		System.out.println("This is only letter: " + txt);
//		System.out.println("This is only number: " + num);
		
	}

	
	
	public static void  splitMethod (String text ) {
		
		String splitText [] = text.split("");
		
		//create a list that will contain only a letter by using lambda predicate
		ArrayList <String> txt = new ArrayList <String> (Arrays.asList(splitText));
		txt.removeIf(d-> Character.isDigit(d.charAt(0)));
		// same here but only numbers
		ArrayList <String> num = new ArrayList <String> (Arrays.asList(splitText));
		num.removeIf(d-> !Character.isDigit(d.charAt(0)));
	
		System.out.println("This is only letter: " + txt);
		System.out.println("This is only number: " + num);
		
	}
	

} //end class
