package homeworkArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnUniqueelement {

	public static void main(String[] args) {
		/*write a program that can return the unique objects from arraylist of characters
			'A', 'A', 'B', 'C', 'D', 'D'

			output:
			A,B,D*/
		
		Character list [] = {'A', 'A', 'B', 'C', 'D', 'D'};
 
		ArrayList <Character> myList = new ArrayList <Character> (Arrays.asList(list));
		ArrayList <Character> uni = new ArrayList <Character> ();
		
		for (int i = 0; i < myList.size(); i++) {
			//System.out.println(myList.get(i));
			if (!uni.contains(myList.get(i)) ) {
				uni.add(myList.get(i));
			}
		}
		System.out.println(uni);
	}

}
