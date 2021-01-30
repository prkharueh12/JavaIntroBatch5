package day16ArraysList;

import java.util.ArrayList;
import java.util.Iterator;

public class SearchMaxArraysList {

	public static void main(String[] args) {
		ArrayList <Integer> nums = new ArrayList <Integer>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		int minNum = findMinNum(nums); // call from the return!!!!!!!!
		System.out.println(minNum);
		
		//int maxNum = nums.get(0);
		
//		
//		Iterator<Integer> iterator  = nums.iterator();
//		while(iterator.hasNext()) {
//			int currentNum = iterator.next().intValue(); // unboxing
//			if (currentNum < minNum) {
//				minNum = currentNum;
//			}
//		}
//		System.out.println(minNum);

	}
	public static int findMinNum (ArrayList <Integer> nums) {
		int minNum = nums.get(0);
		
		Iterator<Integer> iterator  = nums.iterator();
		while(iterator.hasNext()) {
			int currentNum = iterator.next().intValue(); // unboxing
			if (currentNum < minNum) {
				minNum = currentNum;
			}
		}
		//System.out.println(minNum);
		return minNum;
	}
	
	
} // end class
