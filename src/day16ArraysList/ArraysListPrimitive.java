package day16ArraysList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraysListPrimitive {

	public static void main(String[] args) {
		         // if it is not an object, it will need to use a wrapper class. Integer, Character, Byte
		ArrayList<Integer> listNum = new ArrayList<>();
		
		listNum.add(100);
		listNum.add(200);
		listNum.add(300);
		listNum.add(400);
		listNum.add(500);

		listNum.set(2, 3000);
		
		System.out.println(listNum.size());
		
		
		
		
		
		Iterator <Integer> iterator = listNum.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		
		}
	
		 listNum.clear();
		System.out.println(listNum.size());
	}

}
