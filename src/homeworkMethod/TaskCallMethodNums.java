package homeworkMethod;

import java.util.Arrays;

public class TaskCallMethodNums {

	public static void main(String[] args) {
	/*	task:
			1. create a method that can print out the maximum number from any given integer array
			2. create a method that can print out the minimum number from any given integer array
			3. create a method that can print the unique elements from the given array
		 */
		
		int oriNums[]= {1,2,4,6,7,8,9,65,4,32,2,3,2,3};

		
		
//		sortArrays (oriNums);
//		maxNum(oriNums);
//		minNum(oriNums);
		findDup(oriNums);
	
		
		
		
		
		
		
		
//		int sortMaxNum = oriNums[0];           // will compare max num without using Arrays.sort
//		for (int i = 0; i < oriNums.length; i++) {
//			if (oriNums[i] > sortMaxNum) {
//				sortMaxNum = oriNums[i];
//			}
//		}
//System.out.println(sortMaxNum);
		
		
		
		
		
		
	}
        //sort method
	public static void sortArrays (int sort[]) {
	  Arrays.sort(sort);
	  System.out.println(Arrays.toString(sort));
	}
	   // find max method
	public static void maxNum(int num[]) {
		for (int i = 0; i < num.length; i++) {
			
		}
		System.out.println("The maximum number is "+num[num.length-1]);
	}
	  // find min method
	public static void minNum(int num[]) {
		for (int i = 0; i < num.length; i++) {
			
		}
		System.out.println("The minimum number is "+num[0]);
	}
	
	
	public static void uniNum (int num) {
		
		
	}
	
	public static void findDup (int numDup[]) {
		for (int i = 0; i < numDup.length; i++) {
			for (int j = i+1; j < numDup.length; j++) {
				if (numDup[i] == numDup[j] ) {
					
					System.out.println(numDup[j]);
				}
			
			}
			
		}
		
	}
  
	
	
}// end of class
