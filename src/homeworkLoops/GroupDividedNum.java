package homeworkLoops;

public class GroupDividedNum {

	public static void main(String[] args) {
		/*
		 * Write a Java program to print numbers between 1 to 100 which are divisible by
		 * 3, 5 and by both. Go to the editor Sample Output: Divided by 3: 3, 6, 9, 12,
		 * 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57 , 60, 63, 66, 69,
		 * 72, 75, 78, 81, 84, 87, 90, 93, 96, 99, Divided by 5: 5, 10, 15, 20, 25, 30,
		 * 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, Divided by 3 & 5: 15, 30,
		 * 45, 60, 75, 90,
		 */
		System.out.println("Divided by 3:");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {

				System.out.print(i + ", ");
				if (i == 57) {
					System.out.println("\n");
				}

			}

		}

		System.out.println("\n\nDivided by 5:");
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {

				System.out.print(i + ", ");
				if (i == 90) {
					System.out.println("\n");
				}

			}
		}

		System.out.println("\n\nDivided by 3 & 5:");
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.print(i + ", ");
			}
		}

	}

}
