package day16ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class FindUniqueElement {

	public static void main(String[] args) {
		/*Find it unique numbers */
		Integer numbers [] = {1,2,3,4,5,6,7,8,9,1,2,3,4}; // create int array that will be added to arrays list
		
		ArrayList <Integer> nums = new ArrayList <Integer> (Arrays.asList(numbers));
		
		ArrayList <Integer> uni = new ArrayList <Integer> (); // empty list
		
		for (int i = 0; i < nums.size(); i++) {
			if (!uni.contains(nums.get(i))) {   // keep looping if any numbers is not exist in unique!! True/False using contain
				
				uni.add(nums.get(i));
			}
		}
		System.out.println(uni);
		
		
	
	}

}
