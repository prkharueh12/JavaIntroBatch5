package homeworkArrays;

import java.util.Arrays;

public class ReverseArraysNum {

	public static void main(String[] args) {
		
		int[] my_array1 = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
		
		System.out.println(Arrays.toString(my_array1));
		
		for (int i = my_array1.length-1; i >= 0; i--) {
			System.out.print(my_array1[i]+ ", ");
		}
		
	}

}
