package day16ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindMaximumNum {

	public static void main(String[] args) {
		/*Find maximum number*/ 
		Integer numbers [] = {1,2,3,4,5,6,7,8,9,1,2,3,4}; // create int array that will be added to arrays list
		
		ArrayList <Integer> nums = new ArrayList <Integer> (Arrays.asList(numbers));
		
		int max = 0;
		int min = nums.get(0);
		
		for (int i = 0; i < nums.size(); i++) {
			//int currentNum = nums.get(i);
			// currentNum could be used with nums.get(i)
			 
			if (nums.get(i) > max) {
				max = nums.get(i);
				
			}
			
			if (nums.get(i) < min) {
				min = nums.get(i);
				
			}
		}
		
		System.out.println("The max number is: " + max);
		System.out.println("The min number is: " + min);
		
		
		Collections.sort(nums);
		System.out.println(nums.get(0));
		System.err.println(nums.get(nums.size()-1));
		
	}

}
