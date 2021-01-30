package homeworkArrays;

import java.util.Arrays;

public class FindSecondSmallestNum {

	public static void main(String[] args) {
		int[] my_array = {-1, 4, 0, 2, 7, -3};
		
		Arrays.sort(my_array);
		
		System.out.println(Arrays.toString(my_array));
		System.out.println("The second smallest number is: "+ my_array[1]);

	}

}
