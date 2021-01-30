package homeworkLocalTimeDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task2ArraysLocalDateTime {

	public static void main(String[] args) {
		/*2. create an array of LocalDate and store the next 10 day's dates, 
		 * use for each loop to print each Date in the following format:
		 * MonthName/Day, Name
 			ex: November/25, Wednesday
		 * */ 
		
		
		
		LocalDate date = LocalDate.now();
//		LocalDate nextDate = date.plusDays(1);
//		DateTimeFormatter monDd = DateTimeFormatter.ofPattern(" MMMM/dd/yyyy, EEEE");
//		System.out.println(date.format(monDd));
//		System.out.println(nextDate.format(monDd));
		
		LocalDate nextTen[] = new LocalDate[10];
		
		int countDay = 0;
//		for (int i = 0; i < nextTen.length; i++) {
//			LocalDate nextDate = date.plusDays(countDay);
//			countDay++;
//			DateTimeFormatter monDd = DateTimeFormatter.ofPattern(" MMMM/dd/yyyy, EEEE");
//			System.out.println(nextDate.format(monDd));
//		}
		
		
		for (LocalDate arrDat : nextTen) {
			LocalDate nextDate = date.plusDays(countDay);
			countDay++;
			DateTimeFormatter monDd = DateTimeFormatter.ofPattern(" MMMM/dd/yyyy, EEEE");
			System.out.println(nextDate.format(monDd));
		}
		
		
		
	}

}
