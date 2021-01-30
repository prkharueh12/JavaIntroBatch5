package homeworkLoops;

public class InterviewQuestion {

	public static void main(String[] args) {
		/*
		 * That, given positive Integer N, Points the consecutive numbers from 1 to N,
		 * each on a separate line, However, and number divisible by 2, 3, 5, should be
		 * replaced by the word Codility, Test, Coders respectively. If the number
		 * divisible by more than one if the numbers: 2,3 or 5, it should be replaced by
		 * a concatenation of the respective words Codility, Test, and Coders in the
		 * given order. For example, numbers divisible by both 2 and 3 should be
		 * replaced by CodilityTest and numbers divisible by all three numbers: 2,3, and
		 * 5, should be replaced by CodilityTestCoders. For example, here is the output
		 * for 24: 1 Codility Test Codility Coders CodilityTest 7 Codility Test
		 * CodilityCoders 11 CodilityTest 13 Codility TestCoders Codility 17
		 * CodilityTest 19 CodilityCoders Test Codility 23 CodilityTest
		 *
		 *
		 */

		int num = 1;
		String name = "";

		while (num <= 10) {
			if (num % 2 == 0) {
				name = "Codility";
			}
			if (num % 3 == 0) {
				name = name.concat("Test");
			}
			if (num % 5 == 0) {
				name = name.concat("Coders");
			}

			if (name.equals("")) {
				System.out.println(num);
			} else {
				System.out.println(name);
			}
			name = "";
			num++;

		}
 
	}

}
