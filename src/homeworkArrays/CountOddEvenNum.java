package homeworkArrays;

public class CountOddEvenNum {

	public static void main(String[] args) {
		/*Write a Java program to find the number of even and odd integers in a given array of integers.

		int[] array_nums = {5, 7, 2, 4, 9};

		Output:
		Original Array: [5, 7, 2, 4, 9]                                        
		Number of even numbers: 2                                             
		Number of odd numbers : 3 

		*/
		
		int[] num = {5, 7, 2, 4, 9};
		int countEven = 0;
		int countOdd = 0;
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] %2 == 0) {
				countEven++;
			}
			if (num[i] %2 == 1) {
				countOdd++;
			}
		}
		System.out.println("There are: " + countEven + " of even numbers\nand only "+ countOdd+" for Odd numbers.");

	}

}
