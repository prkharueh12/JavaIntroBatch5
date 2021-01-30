package homeworkArrays;

import java.util.Arrays;

public class MoveAllZero {

	public static void main(String[] args) {
		/*Write a Java program to move all 0's to the end of an array. 
		 * Maintain the relative order of the other (non-zero) array elements.
			int[] array_nums = {0,0,1,0,3,0,5,0,6};
			
			Original array:                                                        
			0  0  1  0  3  0  5  0  6                                              
			After moving 0's to the end of the array:                              
			1  3  5  6  0  0  0  0  0 
			*/
		int[] orginNum = {0,0,1,0,3,0,5,0,6};
		
		Arrays.sort(orginNum);
		
		System.out.println(Arrays.toString(orginNum));
		//create empty arrays with same length.
		int newArr [] = new int [orginNum.length];
		
		int index = 0; // use it to increment each value in originNum [] from the first index to the last.
		for (int i = 0; i < orginNum.length; i++) {
			if (orginNum[i] != 0) {
				// Array []: nameOfArray [what index] = originArrays (added dynamic)
				newArr[index]= orginNum[i]; // same as line 38
				index ++;
			}
		}
		
		System.out.println(Arrays.toString(newArr));
		
		// to assign a value to a new arrays
		String strArray[] = new String [4];
		 strArray[2] = "Bird";
		
		System.out.println(Arrays.toString(strArray));
	}

}
