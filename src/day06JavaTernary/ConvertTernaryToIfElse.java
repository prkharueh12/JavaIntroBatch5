package day06JavaTernary;

public class ConvertTernaryToIfElse {

	public static void main(String[] args) {
		
//		String name = "Park";
//		int age = 19;
//		System.out.println(name+" is eligible to buy alcohol? ");
//		if (age >=21)
//			System.out.println(true);
//		else
//			System.out.println(false);
		
		
		int current = 1;
		String amPm ;
		
		if (current >= 1 && current <=24) {
			
				if (current >12) {
				amPm = "PM";
				}else
				amPm = "AM";
			
				if(current >12) {
				current -=12;
				}
				
				System.out.println("Current time is "+current+ " "+amPm);	
			}else {
			System.out.println("Invalid Time!!!");
		}
		

	
	}

}
