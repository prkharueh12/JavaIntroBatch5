package day15MethodContinuedWrapperClassLocalDateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateTimeIntro {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalDate yesterday = LocalDate.now().minusDays(1);
		LocalDate lastMonth = date.minusDays(30);
		LocalDate tmr = date.plusDays(1);
		LocalDate expDate = date.plusDays(7);
		

		System.out.println(date);
		System.out.println(tmr);
		System.out.println(lastMonth);
		System.out.println(expDate);
		 
		LocalDate lastYear = date.minusYears(1);
		System.out.println(lastYear.isLeapYear());
		System.out.println(date.isLeapYear());
		
		
		
		LocalTime time = LocalTime.now();
		
		
		System.out.println(time);

	}

}
