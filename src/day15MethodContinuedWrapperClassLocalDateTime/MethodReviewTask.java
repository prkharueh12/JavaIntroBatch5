package day15MethodContinuedWrapperClassLocalDateTime;

import java.util.Arrays;

public class MethodReviewTask {

	public static void main(String[] args) {
		
		double arr [] = {0.2, 2.5, 5.25, 1.6, 3.9, 5.5};
		double num = 9.9 ;
		double jusNew [] = addDouble(arr, num);
		System.out.println(Arrays.toString(jusNew));
		
		//////////////////////////////////////////////////////
//		double arr [] = {0.2, 2.5, 5.25, 1.6, 3.9, 5.5};
//		double num = 9.9 ;
//		int index = 0 ;
//
//		double newArr [] = new double [arr.length+1];
//		
//
//		for (double element : arr) {
//			newArr[index] = element;
//			index++;
//			newArr[newArr.length-1] = num ;
//		}
//		
//		System.out.println(Arrays.toString(newArr));
		
		
		
	} // End Main method
	
	public static double [] addDouble (double arr [] , double num){
		
		int index = 0 ;
		double arr1 [] = new double [arr.length+1];

		for (double element : arr) {
			arr1[index] = element;
			index++;
		}
		arr1[arr1.length-1] = num ;
		//System.out.println(Arrays.toString(newArr));
		return arr1;
	}

} // end Class
