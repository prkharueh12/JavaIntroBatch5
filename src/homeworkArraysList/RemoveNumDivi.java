package homeworkArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveNumDivi {

	public static void main(String[] args) {
		/*
		 * write a program that can remove all the numbers that can divisible by 3 or 5 in ArrayList,

			1,2,3,4,5,6,7,8,9,10,15*/ 
		
		Integer num [] = {1,2,3,4,5,6,7,8,9,10,15};
		
		ArrayList <Integer> numList = new ArrayList <Integer> (Arrays.asList(num));
		
		Iterator <Integer> itr = numList.iterator();
			while (itr.hasNext()) {
				int val = itr.next();
				if (val %3 == 0 || val %5 == 0) {
					itr.remove ();
				}
			} 
			System.out.println(numList);
		}
		
//		numList.removeIf(number -> number %3 ==0 || number %5 == 0 );
//		System.out.println(numList);
		
		}

