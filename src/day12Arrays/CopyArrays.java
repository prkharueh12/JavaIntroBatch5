package day12Arrays;

import java.util.Arrays;

public class CopyArrays {

	public static void main(String[] args) {
		int a [] = {1,3,8};
		
		int b [] = new int[a.length]; //Declare new arrays same size as a[]
		
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]); // will print actual values!
//		}
//		
//		for (int i = 0; i < b.length; i++) {
//			System.out.println(b[i]); // will print  0 0 0 because values have not been called yet
//		}
		
		// copy from a[] and get 2 elements.
		// if the length (2) is larger than the original, Arrays.copyOf will add more size for you and give value of 0. 
		
	//	int c [] = Arrays.copyOf(a, 5);
		
		int c [] = Arrays.copyOf(a, 2);
		System.out.println(Arrays.toString(c));
		

	}

}
