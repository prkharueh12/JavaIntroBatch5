package day19OOP_Encapsulation;

import java.time.LocalDate;

public class PersonObject {

	public static void main(String[] args) {
		Person pp1 = new Person ("Donny", LocalDate.of(1980, 6, 4), 'M');
		
//		System.out.println(pp1.getAge());
//		System.out.println(pp1.getGender());
//		System.out.println(pp1.getName());
		
		pp1.setDOB(LocalDate.of(1999, 7, 17));
		
		System.out.println(pp1.getAge());
		
		pp1.setName("Tom"); // using set for updating
		System.out.println(pp1.getName());

	}

}
