package homeworkLoops;

public class DoWhileLoop {

	public static void main(String[] args) {
		/*
		tasks:
		        1. print out the numbers between 0 ~ 100
		        2. print out the numbers between 100 ~ 200
		        3. print out all the odd numbers between 0 ~ 100
		        4. print out all the even numbers between 0 ~ 100
		        5. do 500 push ups
		 */
		System.out.println("1. print out the numbers between 0 ~ 100");
		int num = 0 ;
	do {
		System.out.println("The value is " + num);
		num++;
	} while (num<=100);

	
	System.out.println("2. print out the numbers between 100 ~ 200");
	num = 100 ;
	do {
	System.out.println("The value is " + num);
	num++;
	} while (num<=200);
	
	System.out.println("3. print out all the odd numbers between 0 ~ 100");
	num = 0 ;
	do {
		if (num % 2 == 1) {
	System.out.println("The odd value is " + num);
		}
	num++;
	} while (num<=100);
	
	
	System.out.println("4. print out all the even numbers between 0 ~ 100");
	num = 0 ;
	do {
		if (num % 2 == 0) {
	System.out.println("The even value is " + num);
		}
	num++;
	} while (num<=100);
	System.out.println("5. do 500 push ups");
	int counter = 0;
	do {
		System.out.println("Push ups: "+counter);
		counter++;
	} while (counter <=500);
	
	}

}
