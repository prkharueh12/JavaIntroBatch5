package day18ClassAndObjectWithConstructor;

import java.time.LocalDate;

public class Student {
	//Instance Variables
	String name ;
	String ID ; 
	LocalDate DOB ;
	Long phone;
	String email ; 
	char gender ;
	int age ; 
	


	
	// Create default constructor  it will always be called first // if you don't create, java will create for you.
	
	public Student () {
		System.out.println("Calling default constructor");
		}
	
	public Student ( String name,String ID, LocalDate DOB,Long phone, String email,char gender) {
		// this can call other method in this class.
		this.name = name ;
		this.ID = ID;
		this.DOB = DOB;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.age = LocalDate.now().getYear() - DOB.getYear();
			
		
	}
	
//Instance Method
	public void getInfo () {
		System.out.println("name : " + name + "\nId : " + ID
							+"\nDate of birth : " + DOB
							+"\nPhone : " + phone
							+ "\nEmail : " + email
							+ "\nGender : " + gender
							+ "\nAge : " + age);
	}
	
	public void study () {
		System.out.println(name + " is learning JAVA.");
	}
}