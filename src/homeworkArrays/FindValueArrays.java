package homeworkArrays;

import java.util.Arrays;

public class FindValueArrays {

	public static void main(String[] args) {
		/*Write a Java program to test if an array contains a certain value
			int[] my_array1 = {
			1789, 2035, 1899, 1456, 2013,
			1458, 2458, 1254, 1472, 2365,
			1456, 2265, 1457, 2456};
			Check if 2019 and 2013 are contains in above array.
		 * */
		
		int num [] = {1789, 2035, 1899, 1456, 2013,1458, 2458, 1254, 1472, 2365,1456, 2265, 1457, 2456};
		
		System.out.println(Arrays.toString(num));
		
		for (int i = 0; i < num.length; i++) {

			switch (num [i]) {
			case 2019:
				System.out.println("We found: " + num [i]);
				break;
			case 2013:
				System.out.println("We found: " + num [i]);
				break;
			default:
				break;
			}
		}

	}

}
