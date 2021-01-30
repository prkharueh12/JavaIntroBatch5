package day17ClassAndObject;

import java.time.LocalDate;

public class Dog {
	
	//Instance Variables
	String nickName;
	String bread ;
	String size ;
	char gender;
	String color;
	LocalDate DOB;
	int age ;
	
	

	//Instance Method
	
	public void setInfo (String dogName,
						 String dogBread, 
						 String dogSize,
						 char dogGender, 
						 String dogColor,
						 LocalDate dogDOB) {
		
		nickName = dogName;
		bread = dogBread;
		size = dogSize;
		gender = dogGender;
		color = dogColor;
		DOB = dogDOB;
		age = LocalDate.now().getYear()- dogDOB.getYear();
		
	}
	
	public void getInfo () {
		
		System.out.println("Nick name : " + nickName);
		System.out.println("Bread : " + bread);
		System.out.println("Size : " + size);
		System.out.println("Gender : " + gender);
		System.out.println("Color : " + color);
		System.out.println("Date of Birth : " + DOB);
		System.out.println("Age: " + age);
	}
	
	public void eat() {
		System.out.println(nickName+ " is eating food.");
	}
	public void eat(String food) {
		System.out.println(nickName+ " is eating" + food);
	}
	
	public void drink() {
		System.out.println(nickName+ " is driking water.");
	}
	
	
	
	
}
