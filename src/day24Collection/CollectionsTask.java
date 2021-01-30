package day24Collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class CollectionsTask {

	public static void main(String[] args) {
		
		String name [] = {"Bruno","Donny","Robert","Shaw","Rio"};
		
		Collection <String> listName = new LinkedList <String> (Arrays.asList(name));

		Iterator ita = listName.iterator();
		while (ita.hasNext()) {
			System.out.println(ita.next());
		}
	
		// using Lamda fillter or add element the start with D
		
		
		listName = listName.stream().filter(b -> b.startsWith("D")).collect(Collectors.toList()); // recommended
		System.out.println(listName);
		
		
		listName.removeIf(d ->d.startsWith("B")); //[Donny, Robert, Shaw, Rio]
		System.out.println(listName);
	}
}
