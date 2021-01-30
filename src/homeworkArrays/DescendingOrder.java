package homeworkArrays;

import java.util.Arrays;

public class DescendingOrder {

	public static void main(String[] args) {
		/*Write a program to print below array descending order int[] arr = {5, 1, 2, 6, 7, 0};
		 */ 
		int num [] = {5, 1, 2, 6, 7, 0};
		
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		for (int i = num.length-1; i >= 0; i--) {
			System.out.print(num[i]+ ", ");
		}

	}

}
