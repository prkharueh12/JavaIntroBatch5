package day24Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollection {

	public static void main(String[] args) {
		Integer num [] = {1,2,3,4,5,5,6};
		 num [4] = 8;		
		 
		 //*****ArrayList WILL NOT take primitive type unless you use wrapper class!!! <Integer>
		 
		 
		 ArrayList<Integer> numList = new  ArrayList<Integer> (Arrays.asList(num));
		 numList.add(0, 20);
		 numList.add(numList.size()-1, 100);
		 
		 for (int i = 0; i < numList.size(); i++) {
			System.out.println(numList.get(i));
		}
		 
		 
		 // LinkedList, List are interface.
		 
		 //.add, .addLast are implementation
		 LinkedList <Integer> lL = new LinkedList<Integer>(Arrays.asList(num));
		 
		 lL.addFirst(20);
		 lL.addLast(100);
		 for (Integer myList: lL) {
			 System.out.println(myList); 
			 
		 }
		
		//use it iterator to move the cursor.
		 Iterator ite = lL.iterator();
		 System.out.println(lL.get(0));
		 ite.next();
		 System.out.println(ite.next());
		 System.out.println(ite.next());
		 
		 // use iterator and while to print all element with infinite.
		 
		 /*hasNext() : hasNext() method returns true if iterator have more elements.
		  * next() : next() method returns the next element and also moves cursor pointer to the next element*/
		 
		 while(ite.hasNext()) {
			 System.out.println(ite.next());
		 }
		 
//		LinkedList <String> list = new LinkedList<String>();
//		list.add("Bruno");
//		list.add("Donny");
//		list.add("Scott");
//		list.add("Fred");
//		
//		System.out.println(list);
		
		
	}

}
