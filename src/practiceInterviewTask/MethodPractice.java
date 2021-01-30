package practiceInterviewTask;

public class MethodPractice {

	public static void main(String[] args) {
		String nameTest = "PARk";
		System.out.println(bringName("My name is "+nameTest));
		System.out.println(bringName("TechCircle"));
		
		
		
		printHello();
		printName("Park");
      //  System.out.println(printName("Park"));
        printHello();
        printName("TechCircle ");
     //   System.out.println("school name is : " + printName());
        printHello();
        
        
        int sumOf = sum(1,2,3);
        System.out.println(sumOf);
        
        checkNum(200,200);
        
	}
	public static String bringName (String input) {
		
		return (input);
	}
	
	public static void printName (String input) {
		
		System.out.println(input);
	}
	
	public static void printHello () {
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("Hello");
		}
	}

	
	
    public static int sum(int a, int b, int c) {
		
		return a+b+c ;
			
	} 
    
    
public static void checkNum (int a, int b) {
		
		if (a > b) {
			System.out.println(a+" is greater than "+ b);
		}if (a < b) {
			System.out.println(a+" is less than to "+ b);
		}
		
		if (a == b){
			System.out.println(a+ " is equal to "+ b);
			
	} 
	
	}
	
	
	
	
} //end class
