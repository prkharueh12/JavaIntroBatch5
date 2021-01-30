package homeworkLocalTimeDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Task1LocalDateTime {

	public static void main(String[] args) {
		/*Task :
		 * 	1. use the LocalDate & Time get the date and time in the following format:
				Tue, 01:00 pm, November/24/2020 */
		
		LocalDate date = LocalDate.now();
		LocalDate specDate = LocalDate.of(2020, 11, 24);
		
		LocalTime time = LocalTime.now();
		LocalTime specTime = LocalTime.of(13, 00);
		
		LocalDateTime ldt = LocalDateTime.of(specDate, specTime);
		
		DateTimeFormatter ldtform = DateTimeFormatter.ofPattern("EEE, hh:mm a, MMMM/dd/yyyy");
		System.out.println("Date Time Format with EEE, hh:mm a, MMMM/dd/yyyy \n"+ldt.format(ldtform));
		
		
	}

}
