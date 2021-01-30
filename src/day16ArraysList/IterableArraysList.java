package day16ArraysList;

import java.util.ArrayList;
import java.util.Iterator;

public class IterableArraysList {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Selenium");        
		names.add("SDET");       
		names.add("Techcircle");      
		names.add("Cucumber");        
		names.add("Jenkins");         
		names.add("JIRA");  

			Iterator <String> iterator = names.iterator();
			
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			
			}
	}

}
