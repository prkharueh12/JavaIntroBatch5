package day14CallMethod;

import java.util.Arrays;

public class Utils {

	public static void main(String[] args) {
		// Reverse
//		StringBuilder sb = new StringBuilder(); //declare
//		sb.append("ABC");                       // assign value
//		sb.reverse();                           // reverse method in SB
//		System.out.println(sb.toString());
		
		//System.out.println(revStr("Park"));
		
		
		
		String[] myArr = {"apple", "pear", "orange", "mango", "apple", "kiwi", "grape"};
		
		String newArr[] = sortArrays(myArr);
		 System.out.println(Arrays.toString(newArr));
	}
	
	public static String revStr(String input) {
		StringBuilder sb = new StringBuilder(); //declare
		sb.append(input);                       // assign value
		sb.reverse();   
		
		return sb.toString () ; 
	}
	
	
	
	public static String [] sortArrays(String arr[]) {
		Arrays.sort(arr);
		return arr;
	}

}//end class
