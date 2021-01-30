package day16ArraysList;

import java.util.ArrayList;

public class mergeArrayList {

	public static void main(String[] args) {
		ArrayList <Integer> listA = new ArrayList <Integer>();
		
		listA.add(1);
		listA.add(2);
		listA.add(3);
		
		ArrayList <Integer> listB = new ArrayList <Integer>();
		
		listB.add(4);
		listB.add(5);
		
		listA.addAll(listB); 
		
		System.out.println(listA);

	}

}
