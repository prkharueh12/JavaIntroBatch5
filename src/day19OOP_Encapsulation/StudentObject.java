package day19OOP_Encapsulation;

import java.time.LocalDate;

public class StudentObject {

	public static void main(String[] args) {
		StudentEncap s1 = new StudentEncap(); // create student using default constructor
		
		StudentEncap s2 = new StudentEncap();
		
		StudentEncap s3 = new StudentEncap("Bruno", "887799",LocalDate.of(1981, 8, 12), 7034546678L, "edicavani@techcircle.com", 'M');
		
		// s3.getInfo();
		
		s3.setEmail("Bruno.F@techcircle.com");
		
		s3.getInfo();
		
		// access instance variable
//		System.out.println(s1.age);
//		System.out.println(s1.email);
//		System.out.println(s1.ID);
		//System.out.println(s1.name);
		
		s1.setName("TechCircle");
		System.out.println(s1.getName());
		
		s2.setName("Park");
		System.out.println(s2.getName());
		//call study method of the s1 Object
//		s1.study();
//		s1.getInfo();

	}

}
