package day12Arrays;

import java.util.Arrays;

public class SortArrays {

	public static void main(String[] args) {
		int nums [] = {1,3,1,2,5,74,48,64,8};
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		
		System.out.println();
		Arrays.sort(nums); // one line of code will sort the smallest to the largest 
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		
		
		System.out.println();
		System.out.println(nums[nums.length-2]+ " is the second largest number.");
		
		System.out.println(nums.length);
		
	}

}
