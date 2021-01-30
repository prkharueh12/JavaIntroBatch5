package homeworkArrays;

import java.util.Arrays;

public class FindIndex {

	public static void main(String[] args) {
		/*Write a Java program to find the index of Selenium before sorting and after sorting.
			String[] my_array2 = {
			"Java",
			“JDBC”,
			“SQL”,
			“Junit”,
			“Selenium”,
			“Jenkins”,
			“Cucumber”,
			“Agile”,
			“SDLC”,
			“WebDriver”
					 * */
		
		String tools [] = {"Java","JDBC","SQL","Junit","Selenium","Jenkins","Cucumber","Agile","SDLC","WebDriver"};
		
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(tools));
		for (int i = 0; i < tools.length; i++) {
			if(tools [i].equals("Selenium")) {
				System.out.println("The index of \"Selenium\" before sorting is " + i);
				
				
			}
		}
		System.out.println();
		
		Arrays.sort(tools);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(tools));
		for (int i = 0; i < tools.length; i++) {
			if(tools [i].equals("Selenium")) {
				System.out.println("The index of \"Selenium\" after sorting is " + i);
				
				
			}
		}

	}

}
