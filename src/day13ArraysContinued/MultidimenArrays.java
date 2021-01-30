package day13ArraysContinued;

import java.util.Arrays;

public class MultidimenArrays {

	public static void main(String[] args) {
		int num1 [] = {1,3,5,7,8,9};
		int num2 [] = {1,3,5,7,8,9,121};
		int num3 [] = {1,3,};
		
		int arr [][] = {num1,num2,num3};
		System.out.println(arr.length);
		// how to get number 1 line 8 
		// The first[] is the index at arr[][]
		// The second[] is the index inside num1[]
		System.out.println(arr[0][0]); // 1
		
		System.out.println(arr[0][3]); // 7
		System.out.println(arr[2][1]); // 3
		
		
		 
		
		
		
		
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(Arrays.toString(arr[i]));
//			
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.println(arr[i][j]);
//			}
//		}

		
		
	}

}
