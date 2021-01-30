package day10JavaLoops;

public class ForLoopPractice {

	public static void main(String[] args) {
		//String line1= "* * * * * ========================\n * * * *  ========================";
//		String line1= "* * * * * ========================";
//		String line2= " * * * *  ========================";
//		String line3= "==================================";
//		
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(line1 +"\n"+line2);
//		}
//		for (int i = 1; i <= 6; i++) {
//			System.out.println(line3);
//		}
		
		
		/*
		tasks:
		        1. print out the numbers between 0 ~ 100
		        2. print out the numbers between 100 ~ 200
		        3. print out all the odd numbers between 0 ~ 100
		        4. print out all the even numbers between 0 ~ 100
		        5. do 500 push ups
		 */
		
		//int num = 0;
		System.out.println("1. print out the numbers between 0 ~ 100");
		for (int num = 0; num <= 100; num++) {
			System.out.println(num);
		}
		
		System.out.println("2.print out the numbers between 100 ~ 200");
		//num = 100;
		for (int i = 100; i <= 200; i++) {
			System.out.println(i);
		}
		
		System.out.println("3.print out all the odd numbers between 0 ~ 100");
		//num = 100;
		for (int i = 0; i <= 100; i++) {
			if(i %2 ==1)
			System.out.println("This is odd number: "+i);
		}
		
		System.out.println("4. print out all the even numbers between 0 ~ 100");
		//num = 100;
		for (int i = 0; i <= 100; i++) {
			if(i %2 ==0)
			System.out.println("This is even number: "+i);
		}
		
		System.out.println("5. do 500 push ups");
		//num = 100;
		for (int i = 1; i <= 500; i++) {
			
			System.out.println("Push ups: "+i);
		}
	}

}
 