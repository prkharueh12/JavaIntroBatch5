package homeworkLoops;

public class ForLoopTechCirCle {

	public static void main(String[] args) {
		/*
		 * 5. Write a method which prints out the numbers from 1 to 50 but for numbers
		 * which are a Divisible both 3 and 5, print "TechCircle" instead of the number,
		 * for numbers which are a Divisible of 3, print "Tech" instead of the number
		 * and for numbers which are a Divisible of 5, print "Circle" instead of the
		 * number.
		 */
		String print = "";

		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				print = "Tech";
			}
			if (i % 5 == 0) {
				print = "Circle";
			}
			if (i % 5 == 0 && i % 3 == 0) {
				print = "TechCircle";
			}
			if (print.equals("")) {
				System.out.println(i);
			} else {
				System.out.println(print);
			}
			print = "";
		}

	}

}
