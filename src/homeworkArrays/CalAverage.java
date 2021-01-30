package homeworkArrays;

public class CalAverage {

	public static void main(String[] args) {
		/*Write a Java program to calculate the average value of array elements.
			int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
		 */ 
		int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			
		}
		System.out.println("The average value is: "+sum/numbers.length);
	}

}
