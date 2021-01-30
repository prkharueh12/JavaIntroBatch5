package day24Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Collection {

	public static void main(String[] args) {
		
		
		// ********** NO DUPLICATE ELEMENT*********
		Set <String> setCol = new HashSet<String> ();
		setCol.add("Tom");
		setCol.add("Brad");
		setCol.add("Gigg");
		setCol.add("Tom");
		
		System.out.println(setCol.size());
		
		
		String names[] = {"str","Apple","Pear","Melon","Banana","str","Apple"};
		
		// will not print duplicated element
		Set<String> uniqueElemetns = new HashSet<String>(); 
		
		for (String name : names) {
			uniqueElemetns.add(name);
		}
//		System.out.println(Arrays.toString(names));
//		System.out.println(uniqueElemetns);
		
		
		
		// will print what duplicated inside the ArraysList
		ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
		
		Iterator iterator = list.iterator();
		
		while (iterator.hasNext()) {
			
			String item  = (String)iterator.next();
			
			if (Collections.frequency(list, item)>1) {
				System.out.println(item);
			}
			
		}
		
	}

}
