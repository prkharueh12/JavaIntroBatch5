package day19OOP_Inheritance;

public class Book {
	//Instance variable
	String title = "SiamSport";
	String author = "Buranavichain";
	double price = 50.0;
	
	
	//Instance method
	public String toString () {
		return "Title: "+ title+ " Author: "+ author+ "Price: $"+ price;
	} 
	
	//default constructor ---> to initialize from instance variables
	
	public Book () {}

	public Book(String title, String author, double price) {
		
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	
}
