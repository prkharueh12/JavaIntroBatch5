package practiceInterviewTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class DulicatedElement {

	public static void main(String[] args) {

		String names[] = {"Orange","Apple","Pear","Melon","Banana","Orange","Apple"};
		
		
		ArrayList <String> aList = new ArrayList <String> (Arrays.asList(names));
		ArrayList <String> empList = new ArrayList <String> ();
		
		
		for (int i = 0; i < aList.size(); i++) {
			if(Collections.frequency(aList, aList.get(i))>1) {
				System.out.println(aList.get(i));
			}
		}
		
//		for (int i = 0; i < aList.size(); i++) {
//			if (!empList.contains(aList.get(i))) {
//				empList.add(aList.get(i));
//			}
//			
//		}
//			System.out.println(empList);
	}

}// end class
