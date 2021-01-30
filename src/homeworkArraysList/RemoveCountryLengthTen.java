package homeworkArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCountryLengthTen {

	public static void main(String[] args) {
		/*
		 * 1. create an Array of string called country names
		   2. write a program that can remove all the country names that have length of 10 or greater*/
		
		String cName [] = {"Thailand", "United States of America", "Japan"};
		
	/*	Method#1
		ArrayList <String> NewList = new ArrayList <String> (Arrays.asList(cName)) ; // bring all the list from String cName!!
		
		NewList.removeIf(c -> c.length() >=10);  // Lamda 
		System.out.println(NewList);
	*/	
		
		//Method#2
		ArrayList <String> newList = new ArrayList <String> ();
		
		for (int i = 0; i < cName.length; i++) {
			if (cName[i].length()<10) {
				newList.add(cName[i]);
			}
		}
		System.out.println(newList);
	}

}
