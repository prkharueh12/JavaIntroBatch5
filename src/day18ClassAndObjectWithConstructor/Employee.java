package day18ClassAndObjectWithConstructor;

import java.time.LocalDate;

public class Employee {
	
	String name;
	Double salary;
	char gender;
	LocalDate hireDate;
	String title;
	
	
	public Employee () {} // default contructor
	
	// template
	public Employee (String name,String title,Double salary,char gender, LocalDate hireDate ) {
		
		this.name = name ;
		this.salary = salary;
		this.gender = gender; 
		this.hireDate = hireDate;
		this.title = title;
	}
	 // method
	public void working () {
		System.out.println(name + " is working.");
		}
	
	public void meeting () {
		System.out.println(name + " is on meeting.");
		}
	
	public void coding () {
		System.out.println(name + " is coding.");
		}
	
	public void getInfo () {
		System.out.println("Name: "+ name); 
		System.out.println("Salary: "+salary); 
		System.out.println("Gender: "+gender); 
		System.out.println("Hire starts: "+hireDate); 
		System.out.println("Title: "+title); 
		}
	
	

}
