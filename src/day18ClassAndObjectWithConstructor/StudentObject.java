package day18ClassAndObjectWithConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class StudentObject {

	public static void main(String[] args) {
		Student studentA = new Student();
		
		//studentA.getInfo();
		
		
		Student studentB = new Student ("Cavani", "100A",LocalDate.of(1981, 8, 12), 7034546678L, "edicavani@techcircle.com", 'M') ;
		
		
		studentB.getInfo();
		studentB.study();
		System.out.println("*******************************");
		
		Student studentC = new Student ("Marcus", "101B",LocalDate.of(1986, 6, 11), 7035673324L, "mrashford@techcircle.com", 'M') ;
		studentC.getInfo();
		
		Student studentD = new Student ("Ricky", "102B",LocalDate.of(1988, 6, 11), 70389773324L, "pricky@techcircle.com", 'M') ;
		Student studentE = new Student ("Babe", "105B",LocalDate.of(1978, 6, 16), 70389773324L, "babebb@techcircle.com", 'F') ;
		Student studentF = new Student ("Rose", "106B",LocalDate.of(1928, 8, 23), 70389773324L, "rose@techcircle.com", 'F') ;
		
		Student studentL[] = {studentB, studentC,studentD,studentE,studentF};
		
		ArrayList <Student> list = new ArrayList <Student> (Arrays.asList(studentL));
		
		ArrayList <Student> male = new ArrayList <Student> (Arrays.asList(studentL));
		ArrayList <Student> female = new ArrayList <Student> (Arrays.asList(studentL));
		
		System.out.println("*******************************");
		
//		int maxAge = studentL[0].age ;
//		int minAge = studentL[0].age ;
//		for (int i = 0; i < list.size(); i++) {
//			
//			if(studentL[i].age > maxAge) {
//				maxAge = studentL[i].age ;
//				//System.out.println(maxAge);
//			}
//			if(studentL[i].age < minAge) {
//				minAge = studentL[i].age ;
//				
//			}
//		}
//		System.out.println(maxAge);
//		System.out.println(minAge);
//		System.out.println("****************************");
//		
//		for (int i = 0; i < list.size(); i++) {
//			if(studentL[i].age == maxAge ) {
//				studentL[i].getInfo();
//			}
//			if(studentL[i].age == minAge ) {
//				studentL[i].getInfo();
//			}
//		}
//		
		
		for (int i = 0; i < list.size(); i++) {
			if (studentL[i].gender == 'F') {
//			System.out.println(studentL[i].name);
				female.add(list.get(i));
			}
			
//			if (studentL[i].gender == 'M') {
//					male.add(list.get(i));
//				}
			
		}
		
		//System.out.println(male.size());
		System.out.println(female.size());
		
		
	}

}
