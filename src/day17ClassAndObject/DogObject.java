package day17ClassAndObject;

import java.time.LocalDate;

public class DogObject {

	public static void main(String[] args) {
		Dog dogA = new Dog();
		
		dogA.setInfo("Bruno", "Mustiff", "Large", 'M', "Brown", LocalDate.of(2017, 4, 1));
		dogA.getInfo();
		dogA.eat();
		dogA.drink();
		System.out.println("===================================");
		Dog dogB = new Dog();
		dogB.setInfo("Wyane", "Chochow", "Small", 'F', "Red", LocalDate.of(2008, 2, 1));
		dogB.getInfo();
		dogB.eat();
		dogB.drink();
		System.out.println("===================================");
		Dog dogC = new Dog();
		dogC.setInfo("Kevin", "Bulldog", "Large", 'M', "Golden", LocalDate.of(2009, 5, 1));
		dogC.getInfo();
		dogC.eat(" Chicken.");
		dogC.drink();
		
		System.out.println();
		// create the array to run list of dog using list.nickname, list.age--->>>>
		Dog dogs[] = {dogA, dogB, dogC};
		
//		for (Dog list : dogs) {
//			System.out.println(list.nickName);
//			System.out.println(list.age);
//			
//			list.eat(" Vegetables.");
//			}
		
			int oldAge= 0 ;
			for (int i = 0; i < dogs.length; i++) {
				if (dogs[i].age > oldAge) {
				oldAge = dogs[i].age ;
				
			}
			
			}
			
		System.out.println(oldAge);
		
		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i].age == oldAge) {
				dogs[i].getInfo();
			}
		}
		
	}

}
