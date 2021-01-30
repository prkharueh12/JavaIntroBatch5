package day15MethodContinuedWrapperClassLocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeForm {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.now();
		
//		System.out.println(date);
//		System.out.println(time);
//		System.out.println(ldt);
		
		
		 DateTimeFormatter dt = DateTimeFormatter.ofPattern("M/dd/yyyy, EEEE");
		 DateTimeFormatter tm = DateTimeFormatter.ofPattern("hh:mm:ss");
	     DateTimeFormatter ldtt = DateTimeFormatter.ofPattern("EEE, hh:mm a, MMMM/dd/yyyy");
		
	     System.out.println("Date with M/dd/yyyy, EEEE \n"+date.format(dt));
	     System.out.println("Time with hh:mm:ss \n"+time.format(tm));
	     System.out.println("Date Time Format with EEE, hh:mm a, MMMM/dd/yyyy \n"+ldt.format(ldtt));
		

	}

}
