package day12Arrays;

import java.util.Arrays;

public class ArraysIntro {

	public static void main(String[] args) {
		
		// same data type
		// declare size
		// index always start w/ 0
		int [] nums = {5,8,10,};
		System.out.println(nums[0]); //5
		
		// added nums
		nums[2] = nums[0]+nums[1];
		System.out.println(nums[2]); //13
		
		String [] name = new String [2];
		name [0]= "Bruno";
		name [1]= "Beek"; 
		
		System.out.println(name[0]);
		System.out.println(Arrays.toString(name));

		// use for loop to run array 
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		// task create an array with 5 short value
		short age [] = new short [5];
		age [0] = 12;
		age [1] = 22;
		age [2] = 32;
		age [3] = 42;
		age [4] = 52;
		
		System.out.println(Arrays.toString(age));
		for (int i = 0; i < age.length; i++) {
						
			if (i != age.length-1)
				System.out.print(age [i] + ", ");
			else 
				System.out.println(age[i]);
				
		}
		// To update index [2 ]
		String cars []= {"BMW", "Porch", "Honda", "Tesla"};
		cars[2]= "\nFerrari";
		System.out.println(cars[2]);
		
		
	}

}
