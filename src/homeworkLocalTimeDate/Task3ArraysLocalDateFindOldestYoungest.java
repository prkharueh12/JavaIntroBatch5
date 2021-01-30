package homeworkLocalTimeDate;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class Task3ArraysLocalDateFindOldestYoungest {

	public static void main(String[] args) {
		/*//    3. create an array of string and store 5 of your friends' names
		//       create an array of LocalDate and store their DofB
		//       find out who is youngest and oldest
		 * */ 

		String names[] = { "Bruno", "Telles", "Henderson", "Donny", "Fred" };

		LocalDate bd[] = new LocalDate[names.length]; // needs to be imported --->> this is empty

		bd[0] = LocalDate.of(2022, 12, 7);
		bd[1] = LocalDate.of(1981, 3, 24);
		bd[2] = LocalDate.of(1982, 5, 24);
		bd[3] = LocalDate.of(1978, 12, 2);
		bd[4] = LocalDate.of(1978, 5, 2);
		
		LocalDate smallest = bd[0] ; 
		LocalDate largest = bd[0] ; 
		
		for (int i = 0; i < bd.length; i++) {
			if (bd[i].isAfter(smallest) ) {
				smallest = bd[i];
			}
			
				if (bd[i].isBefore(largest) ) {
					largest = bd[i];
				}
		}
			System.out.println("The youngest person is "+ smallest);
			System.out.println("The oldest person is "+ largest);

					for (int j = 0; j < bd.length; j++) {
						if (bd[j].equals(smallest) ) {
							System.out.println("The youngest person is "+ names[j] + " who was born on: "+ smallest);
						}
						if (bd[j].equals(largest) ) {
							System.out.println("The youngest person is "+ names[j]+" who was born on: "+ largest);
						}
	
}

  }
} //end class
