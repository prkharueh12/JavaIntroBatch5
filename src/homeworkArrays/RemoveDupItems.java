 package homeworkArrays;

import java.util.Arrays;

public class RemoveDupItems {

	public static void main(String[] args) {
		/*Write a Java program to find the duplicate values of an array of integer values.
			int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
			
			String[] my_array = {"apple", "pear", "orange", "mango", "apple", "Kiwi", "grape"};*/ 
		
		int originNum [] = {1, 2, 5, 5, 6, 6, 7, 2};
	
		
		String originStr [] = {"apple", "pear", "orange", "mango", "apple", "Kiwi", "grape"};
		
		for (int i = 0; i < originNum.length; i++) {
			int count = 0;
			for (int j = i+1 ; j < originNum.length; j++) {
				//System.out.println(originNum [i] +" : "+originNum[j]);
				if (originNum [i] == originNum[j]) {
				System.out.println(originNum[j]);
				}	
				
			}
			
		}
		
		for (int i = 0; i < originStr.length; i++) {
			//System.out.println(Arrays.toString(originStr));
			//System.out.println();
			for (int j = i+1; j < originStr.length; j++) {
				//System.out.println("[i] "+originStr [i] +" : [j] "+originStr[j]);
				if (originStr[i].equals(originStr[j])) {
					System.out.println(originStr[j]);
				}
			}
		}
	}

}
