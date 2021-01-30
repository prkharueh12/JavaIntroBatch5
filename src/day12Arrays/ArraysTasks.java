package day12Arrays;

import java.util.Arrays;

public class ArraysTasks {

	public static void main(String[] args) {
		
		int nums [] = {3,8,1,6,7,8,454,6,48,45};
		
		//Task1- find the largest element.
		System.out.println("Task1- find the largest element");
		Arrays.sort(nums);
		
		System.out.println(nums[nums.length-1]);
		System.out.println("The smallest number is "+nums[0]);
		System.out.println();
		
		
		//Task2 - find sum of all the element
		System.out.println("Task2- find sum of all the element");
		
		int sumArrays = 0;
		for (int i = 0; i < nums.length; i++) {
			sumArrays = sumArrays+ nums[i];
		}
		System.out.println("Sum of all the element is : "+sumArrays);
		System.out.println();
		
		
		//Task3 find the average of all the number.
		System.out.println("Task3- find the average of all the number.");
		
		int average = sumArrays/nums.length;
		System.out.println("The average of all the number is " + average);
		

		
	}

}
