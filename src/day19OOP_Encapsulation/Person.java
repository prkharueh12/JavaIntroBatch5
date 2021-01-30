package day19OOP_Encapsulation;

import java.time.LocalDate;

public class Person {
	private String name ;
	private LocalDate DOB ;
	private char gender ;
	private int age;
	
	
	// constructor
	public Person () { // this is default, if you have parameters below, it will need the default.
		
	}
	
	public Person(String name, LocalDate dOB, char gender) {
		super();
		this.name = name;
		DOB = dOB;
		this.gender = gender;
		
	}
	
	//Getter Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return LocalDate.now().getYear()- this.DOB.getYear();
	}
	
	
	
	
}
