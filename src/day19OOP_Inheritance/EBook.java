package day19OOP_Inheritance;

public class EBook extends Book {
	// **from book class**
//	String title;
//	String author;
//	Double price ;
	
	String size;
	int page;
	
	public void readbook () {
		System.out.println("Reading from EBook "+ title);
	}
	
	public EBook () {}
	
	public EBook(String title, String author, double price) {
		super(title,author,price);
		
	}
	
	public EBook(String title, String author, double price,String size, int page) {
		super(title,author,price);
		this.size = size;
		this.page = page;
	}
}
