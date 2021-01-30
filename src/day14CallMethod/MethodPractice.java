package day14CallMethod;

import java.util.Arrays;

public class MethodPractice {

	public static void main(String[] args) {
		String tools [] = {"Java","JDBC","SQL","Junit","Selenium","Jenkins","Cucumber","Agile","SDLC","WebDriver"};
		
		//loopArrays(tools);
		
//		String arr [] = {"1","2","3"};
//		loopArrays(arr);
		
//		findIndex(tools);
//		sortArrays(tools);
//		findIndex(tools);
//		loopArrays(tools);
		
	findIndexelement (tools, "Java");
//		sortArrays(tools);
//		findIndexelement (tools, "SQL");
		
		//findIndexelement(tools, "SDLC");
		
	
	}
	
	//print all element
	public static void loopArrays (String[]name) {
		for (int i = 0; i < name.length; i++) {
			System.out.println("["+i+"]"+name[i]);
		}
	}
	
    // point the index in arrays
	public static void findIndex (String[]name) {
		for (int i = 0; i < name.length; i++) {
			if (name[i].equals("Selenium")) {
				System.out.println(i);
			}
		}
	}
	
	// find element as you want when you declare
	public static void findIndexelement (String[]name, String element) {
		boolean isFound = false;
		for (int i = 0; i < name.length; i++) {
			if (name[i].equals(element)) {
				isFound = true;
			System.out.println(i);
			}
		}
		
		if (isFound == false) {
			System.out.println("The item ("+element+") is not found!");
		}
	}
	
	// sort machine
	public static void sortArrays (String tool[]) {
		Arrays.sort(tool);
	}

}
