package day12Arrays;

import java.util.Arrays;

public class EqualArrays {

	public static void main(String[] args) {
		int num1 [] = {1,3,7,2,5,74,48,64,8};
		
		int num2 [] = {1,3,7,2,5,74,48,64,8};
		
		int num3 [] = {1,66,1,23,642,80};
		
		int num4 [] = {1,3,5,2,7,74,48,64,8};
		
		// in order to be true: same size and same value each index
		System.out.println(Arrays.equals(num1, num2)); //true
		System.out.println(Arrays.equals(num1, num3)); // false
		
		Arrays.sort(num2);
		Arrays.sort(num4);
		
		System.out.println(Arrays.equals(num2, num4)); //true

	}

}
