package day12Arrays;

import java.util.Arrays;
import java.util.Random;

public class RandomIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums [] = new int[10];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i+1;
			System.out.println(nums[i]);
		}
		// use Random
		Random random = new Random();
		for (int i = 0; i < nums.length; i++) {
			nums[i]= random.nextInt(1000);
		}
		System.out.print(Arrays.toString(nums));
		
		System.out.println();
		
		// print numbers from random arrays that can be divided by 5
		for(int newNum : nums) 
		{
			if (newNum %5 ==0) {
				System.out.print(newNum+  ", ");
			}
		}
		
		
	}

}
