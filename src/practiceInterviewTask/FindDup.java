package practiceInterviewTask;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDup {

	public static void main(String[] args) {
		String tools [] = {"Java","Selenium", "Cucumber","Java", "Java"};
		int count = 0;
		for (int i = 0; i < tools.length; i++) {
			for (int j = i+1; j < tools.length; j++) {
				if (tools[i].equals(tools[j])){
					count++ ;
					
					//System.out.println(tools[j]);
					
				}
				
			}
		}
		System.out.println(count);

		
		// Remove duplicated element: store unique element to new array or store it into set collection
		
		ArrayList <String> listTools = new ArrayList <String> (Arrays.asList(tools));
		ArrayList <String> uniqList = new ArrayList <String> ();
		
		for (int i = 0; i < listTools.size(); i++) {
			//System.out.println(listTools.get(i));
			if (!uniqList.contains(listTools.get(i))) {
				uniqList.add(listTools.get(i));
				
			}
			
		}
		System.out.println(uniqList);
	
	}

} //end class
