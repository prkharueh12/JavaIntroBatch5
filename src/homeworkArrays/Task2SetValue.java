package homeworkArrays;

import java.util.Arrays;

public class Task2SetValue {

	public static void main(String[] args) {
		/*2.  Given: int[][] values = new int[4][5]
				Write a nested loop to set values as follows:
				
				      [0] [1] [2] [3] [4]
				[0]   0   1   2   3    4
				[1]   1   2   3   4    5
				[2]   2   3   4   5    6
				[3]   3   4   5   6    7   */ 
		
		int[][] values = {
							{0,1,2,3,4},
							{1,2,3,4,5},
							{2,3,4,5,6},
							{3,4,5,6,7}
							};
		for (int i = 0; i < values.length; i++) {
			//System.out.println(Arrays.toString(values[i]));
			for (int j = i; j < values[i].length; j++) {
				
			}
			System.out.println(Arrays.toString(values[i]));
		}
	}

}
