package day16ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperators {

	public static void main(String[] args) {
		
		Integer numbers [] = {1,2,3,4,5,6,7,8,9,1,2,3,4}; 
		
		ArrayList <Integer> list1 = new ArrayList <Integer> (Arrays.asList(numbers));
		ArrayList <Integer> list2 = new ArrayList <Integer> ();
		
		list2.add(2);
		list2.add(5);
		list2.add(4);
		list2.add(3);
		
		// to check if list2 exits in list1
		
		boolean result = list1.containsAll(list2);
		System.out.println(result);

	}

}
