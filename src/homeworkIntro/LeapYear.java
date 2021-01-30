package homeworkIntro;

public class LeapYear {

	public static void main(String[] args) {
		/*
		1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, 
		print true if it's a leap year, otherwise print false
		
		Ex:
		year = 2020
		output:
		2020 is a leap year: true
		Hint: if the number of year can be evenly divisible by 4, it's known as a leap year
		*/

		int year = 2018;
		int checkYear = year%4;
		boolean leap = (checkYear == 0) ;
		String leapCheck = (checkYear == 0) ? " is a leap year" : " is not a leap year";
		
		System.out.println(year + leapCheck + ": "+ leap);
		
		
		/*write a program that can check if the person is eligible to vote for Donald Trump or Joe Biden
		 * Ex:name = "John"
		 * citizenShip = "USA"
		 * output:John is eligible to vote for Donald Trump or Joe Biden?true
		*/
		
		
		String name = "John" ;
		String enterCitizenship = "USA";
		boolean check = (enterCitizenship == "USA" );
		
		System.out.println(name + " is eligible to vote for Donald Trump or Joe Biden?" +"\n"+ check);
	}

}
