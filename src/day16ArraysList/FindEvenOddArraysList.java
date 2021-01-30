package day16ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindEvenOddArraysList {

	public static void main(String[] args) {
		Integer numbers [] = {1,2,3,4,5,6,7,8,9,1,2,3,4}; 
		
		ArrayList <Integer> oriNum = new ArrayList <Integer> (Arrays.asList(numbers));
		ArrayList <Integer> oddNum = new ArrayList <Integer> ();
		ArrayList <Integer> evenNum = new ArrayList <Integer> ();
		
		for (int i = 0; i < oriNum.size(); i++) {
			if (oriNum.get(i) % 2 == 1 ) {
				oddNum.add(oriNum.get(i)); // meaning oddNum adding ---> numbers from oriNum.get(i)
			}
			
			if (oriNum.get(i) % 2 == 0 ) {
				evenNum.add(oriNum.get(i));
				
			}
		}

			System.out.println("The odd numbers are: " + oddNum);
			System.out.println("The even numbers are: " + evenNum);
			
			System.out.println(Collections.max(oddNum)); // oringinal max num
			
			oddNum.remove(Collections.max(oddNum)); // remove max num
			
			System.out.println(Collections.max(oddNum)); //find the largest max num
			
			//System.out.println(Collections.min(oddNum));
			
			
			
			System.out.println("The max of even number is: "+ Collections.max(evenNum));
			 evenNum.remove(Collections.max(evenNum));
			System.out.println("The second max of even number is: "+ Collections.max(evenNum));
			
			// Go find unique element!
			ArrayList<Integer> nonDup = new ArrayList<Integer> ();
			ArrayList<Integer> uni = new ArrayList<>();
			System.out.println(Collections.frequency(evenNum, 2)); // collections give frequency (whereArrayList,what#)
			
			for (Integer un : evenNum) {
				int count = Collections.frequency(evenNum, un);
				
				if(count == 1) {
					nonDup.add(un); // find a number not duplicated
				}
				
				if(!uni.contains(un)) { // find
					uni.add(un);
				}
				
			}
			System.out.println("*********************");
			System.out.println(evenNum);
			System.out.println("The only number exist is: "+nonDup);
			System.out.println(uni);
	}

}
