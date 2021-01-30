package homeworkIntro;

public class PersonalInfo {

	public static void main(String[] args) {
		/*
		variables: firstName, lastName, fullName, age, gender, phoneNumber, SSN,weight,height
		output:
		full name is: YourFullName
		age is: YourAge years old
		gender is: your gender
		Phone Number is: YourPhoneNumber
		SSN is: YourSSN

		weight is: your weight

		height is: your height */
		
		
		String firstName = "PARK", lastName = "Henderson";
		short age = 77;
		char gender = 'M';
		long number = 7030077707L;
		int ssn = 123456789;
		short weight = 120;
		String height = "5'3";
		String comName = "Capital One";
		String jobTitle = "SDET";
		boolean isFullTime = true;
		boolean isMarried = false;
		double salary = 120000.50 ;
		
		/*System.out.println("My full name is " + firstName + " "+ lastName +"\nMy age is "+
		age + " years olds." + "\nGender is " + gender + "\nPhone Number is "+ number + "\nSSN is " + ssn
		+"\nWeight is "+ weight +" Lbs."+ "\nHeight is "+ height); */
		
		
		/*
		 * firstName, lastName, gender, age, companyName, 
		 * jobTitle, isFullTime, isMarried, salary
		 * Employee' full name is: John Daniel
		 * John Daniel' gender is: M
		 * John Daniel' age is: 25 years old
		 * John Daniel works at: CapitalOne
		 * John Daniel' Job title is: SDET
		 * John Daniel' salary is 120000.5 $
		 * John Daniel is full time employee: true
		 * John Daniel is married: false
		 */
		System.out.println("Employee's full name is:v" + firstName + " "+ lastName);
		System.out.println(firstName + " "+ lastName + "'s gender is: "+ gender);
		System.out.println(firstName + " "+ lastName + "'s age is: "+age + " years old.");
		System.out.println(firstName + " "+ lastName + " works at: "+comName);
		System.out.println(firstName + " "+ lastName + "'s Job title is: "+jobTitle);
		System.out.println(firstName + " "+ lastName + "'s salary is: "+ salary);
		System.out.println(firstName + " "+ lastName + " is full time employee: "+ isFullTime);
		System.out.println(firstName + " "+ lastName + " is married: "+isMarried);
		
		
		
				}

}
