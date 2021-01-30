package homeworkArrays;

import java.util.Arrays;

public class Task3Dimen {

	public static void main(String[] args) {
		int matrix [][] = new int [5][5];
//		matrix[0][0] = 1 ;
//		matrix[1][1] = 2 ;
//		matrix[2][2] = 3 ;
//		matrix[3][3] = 4 ;
//		matrix[4][4] = 5 ;
		
		for (int row = 0; row < matrix.length; row++) {
				//System.out.println(Arrays.toString(matrix[row]));
				
			for (int col = 0 ; col < matrix[row].length; col ++){
				//System.out.print("Row "+row +" = "+col+ " ");
				if (row == col) {
					matrix[row][col] = row+1;
				}
			}
		
		System.out.println( (matrix[row]));
		}
		
	}
}
