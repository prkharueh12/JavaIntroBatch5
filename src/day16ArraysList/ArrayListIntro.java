package day16ArraysList;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String> ();
		
		names.add("Selenium");        //0
		names.add("SDET");            //1
		names.add("Techcircle");      //2
		names.add("Cucumber");        //3
		names.add("Jenkins");         //4
		names.add("JIRA");            //5
		
		names.add(1,"JAVA"); // add 
		
	
//		System.out.println(names.size()); // check size
//		System.out.println(names.get(0)); // print out using index position
//		System.out.println(names.get(1));
//		System.out.println(names.get(2));
		
//		System.out.println("Before removing : "+names.get(5));
//		names.remove(5);
//		System.out.println("After removing : "+names.get(5));

//		for (int i = 0; i < names.size(); i++) {
//			System.out.println(names.get(i));
//		}
		
		
		
		
	}

}
