package day15MethodContinuedWrapperClassLocalDateTime;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import day10JavaLoops.ForLoop;

public class RemoveDateBeforeAug {

	public static void main(String[] args) {
	/*1. create an Array of LocalDate
			(2010, 11, 23,
			2011, 11, 23,
			2012, 11, 23
			,2013, 11, 23
			,2014, 11, 23
			2015 11, 23
			2016, 11, 23,
			2017, 11, 23,
			2018, 11, 23,
			2019, 11, 23,
			2020, 11, 23,
2. write a program that can remove all the dates before August-15-2016
	 * */
		
		LocalDate date[] = new LocalDate[11]; // needs to be imported

		date[0] = LocalDate.of(2010, 11, 23);
		date[1] = LocalDate.of(2011, 11, 23);
		date[2] = LocalDate.of(2012, 11, 23);
		date[3] = LocalDate.of(2013, 11, 23);
		date[4] = LocalDate.of(2014, 11, 23);
		date[5] = LocalDate.of(2015, 11, 23);
		date[6] = LocalDate.of(2016, 11, 23);
		date[7] = LocalDate.of(2017, 11, 23);
		date[8] = LocalDate.of(2018, 11, 23);
		date[9] = LocalDate.of(2019, 11, 23);
		date[10] = LocalDate.of(2020, 11, 23);
		
		ArrayList <LocalDate> dateList = new ArrayList <LocalDate> (Arrays.asList(date));
		
		LocalDate chek = LocalDate.of(2016, 8, 15);
		
		
//		for (int i = 0; i < dateList.size(); i++) { 
//
//			if (dateList.get(i).isBefore(chek)) {
//		
//				dateList.remove(i);
//		}
//			else
//			System.out.println(dateList.get(i));
				
//	} // end for loop
		//***********************************************************
		
		
		// method 2: to store date after (2016, 8, 15)
		ArrayList <LocalDate> updateList = new ArrayList <LocalDate> ();
		
		
		for (int i=0; i<dateList.size(); i++ ) {
			if (dateList.get(i).isAfter(chek)) {
				updateList.addAll(dateList);
				System.out.println(updateList.get(i));
			}
		}
	

} //end Main method


}