package homeworkArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4CollectEvenNum {

	public static void main(String[] args) {
		/*
		 * Write a program to collect all even number from below list.
		 * ArrayList<Integer> scores = new ArrayList<>(); scores.addAll(
		 * Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18, 19, 20) );
		 * 
		 */
		ArrayList<Integer> scores = new ArrayList<Integer>();
		scores.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

		for (int i = 0; i < scores.size(); i++) {
			if (scores.get(i) % 2 == 0) {
				System.out.println(scores.get(i));
			}
		}

	}

}
