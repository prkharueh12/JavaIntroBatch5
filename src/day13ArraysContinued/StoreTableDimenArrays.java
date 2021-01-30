package day13ArraysContinued;

import java.util.Arrays;

public class StoreTableDimenArrays {

	public static void main(String[] args) {
		int rating[][] = { 
						{ 4, 6, 2, 5 }, 
						{ 7, 9, 4, 8 }, 
						{ 6, 9, 3, 7 } 
						};

		int max = rating[0][0];
		int min = rating[0][0];

		for (int i = 0; i < rating.length; i++) {
			// System.out.println(Arrays.toString(rating[i]));
			for (int j = 0; j < rating[i].length; j++) {
				// System.out.println(rating[i][j]);
				if (rating[i][j] > max) { // if the number > max 4 , then max  number will become that number
					
					max = rating[i][j];

				}
				// find the smallest
				if (rating[i][j] < min) {
					min = rating[i][j];

				}
			}

		}

		System.out.println("The largest number is: " + max);
		System.out.println("The smallest number is: " + min);
	}

}
