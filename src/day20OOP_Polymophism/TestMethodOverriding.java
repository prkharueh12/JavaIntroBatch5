 package day20OOP_Polymophism;

public class TestMethodOverriding {

	public static void main(String[] args) {
		Parent obj1 = new Parent ();
		
		obj1.show();
		
		// it will override Parent method to Child method
		 
		Parent obj2 = new Child ();
		obj2.show();
		
		

	}

}
