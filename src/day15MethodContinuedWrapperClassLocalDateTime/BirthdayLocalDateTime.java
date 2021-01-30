package day15MethodContinuedWrapperClassLocalDateTime;

import java.time.LocalDate;
import java.time.Month;

public class BirthdayLocalDateTime {

	public static void main(String[] args) {
		String names[] = { "Bruno", "Telles", "Henderson", "Donny" };

		LocalDate bd[] = new LocalDate[names.length]; // needs to be imported

		bd[0] = LocalDate.of(1988, 5, 24);
		bd[1] = LocalDate.of(1984, 3, 24);
		bd[2] = LocalDate.of(1987, 5, 24);
		bd[3] = LocalDate.of(1985, 12, 2);

		for (int i = 0; i < bd.length; i++) {
			Month month = bd[i].getMonth(); // Month needs to be imported

			int day = bd[i].getDayOfMonth();

			if (LocalDate.now().getMonth().equals(month) && LocalDate.now().getDayOfMonth() == day) {
				System.out.println("Today is your birthday. Happy Birthday !!!! " + names[i]);
				// it will not print if the new day starts, because of Donny's birthday is not match with today!

			} 

		}

	}
	
}
