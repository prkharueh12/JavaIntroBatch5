package homeworkArrays;

import java.util.Arrays;

public class TestEquality {

	public static void main(String[] args) {
		int[] array1 =  {2, 5, 7, 9, 11};
		int[] array2 =  {2, 5, 7, 8, 11};
		int[] array3 =  {2, 5, 7, 9, 11};
		
		System.out.println("Array1 is equal to Array2: "+Arrays.equals(array1, array2));
		System.out.println("Array1 is equal to Array3: "+Arrays.equals(array1, array3));
		System.out.println("Array2 is equal to Array3: "+Arrays.equals(array2, array3));

	}

}
