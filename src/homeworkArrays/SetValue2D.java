package homeworkArrays;

import java.util.Arrays;

public class SetValue2D {

	public static void main(String[] args) {
		/* 1.  Given: int[][] values = new int[4][5]
		 * Write a nested loop to set values as follows:

	       [0] [1] [2] [3] [4]
	    [0] 1   2   3   4    5
	    [1] 1   2   3   4    5
	    [2] 1   2   3   4    5
	    [3] 1   2   3   4    5

	*/
		int [][] value = new int[4][5];
        
		for (int i = 0 ; i < value.length; i++) {
			for (int j = 0; j < value[i].length; j++) {
				value[i][j] = j+1;				
			}
			System.out.println(Arrays.toString(value[i]));
		}
	}

}
