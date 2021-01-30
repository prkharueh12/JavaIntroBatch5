package day19OOP_Encapsulation;

import java.time.LocalDate;

public class StudentEncap {
	//Instance Variables
		private String name ;
		private String ID ; 
		private LocalDate DOB ;
		private Long phone;
		private String email ; 
		private char gender ;
		private int age ; 
		
		
		// getter and setter (update) to all the instance variables
		
		public String getName() {
			return this.name.toUpperCase();
		}
		public void setName (String str) {
			this.name = str;
		}

		// Create default constructor  it will always be called first // if you don't create, java will create for you.
		
		public String getID() {
			return ID;
		}
		public void setID(String iD) {
			ID = iD;
		}
		public LocalDate getDOB() {
			return DOB;
		}
		public void setDOB(LocalDate dOB) {
			DOB = dOB;
		}
		public Long getPhone() {
			return phone;
		}
		public void setPhone(Long phone) {
			this.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		
		
		public StudentEncap () {
			System.out.println("Calling default constructor");
			}
		
		public StudentEncap ( String name,String ID, LocalDate DOB,Long phone, String email,char gender) {
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
