package homeworkArrays;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		/*Write a Java program to find the maximum and minimum value of an array.
			int[] my_array1 = {
			1789, 2035, 1899, 1456, 2013,
			1458, 2458, 1254, 1472, 2365,
			1456, 2265, 1457, 2456};
		 * */ 
		
		int num [] = {1789, 2035, 1899, 1456, 2013,1458, 2458, 1254, 1472, 2365,1456, 2265, 1457, 2456};
		
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		System.out.println("The maximum element is: " + num[num.length-1]);
		System.out.println("The second largest element is :"+ num[num.length-2]);
		System.out.println("The minimum element is : "+ num[0]);
		

	}

}
