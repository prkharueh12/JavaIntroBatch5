package homeworkLoops;

public class WhileLoopTask {

	public static void main(String[] args) {
		/*
		tasks:
		        1. print out the numbers between 0 ~ 100
		        2. print out the numbers between 100 ~ 200
		        3. print out all the odd numbers between 0 ~ 100
		        4. print out all the even numbers between 0 ~ 100
		        5. do 500 push ups
		 */
		
		// 1. print out the numbers between 0 ~ 100
				int num = 0;
				if (num <= 100) {
					System.out.println(num);
				}
				while (num <= 100) {
					System.out.println(num);
					num++;
//					num = num +1;
				}
				// 2. print out the numbers between 100 ~ 200
				int num1 = 100;
				int num2 = 200;
//			if (num1 <= num2) {
//				System.out.println(num1);
//			}
				while (num1 <= num2) {
					System.out.println(num1);
					num1++;
				}
				
				/// print out all the odd numbers between 0 ~ 100
				
				
				
				System.out.println("print out all the odd numbers between 0 ~ 100");
				
				int number = 0;
				
				while(number <= 100) {
//					System.out.println(number);
					
					if(number%2 == 1) {
						System.out.println(number);
					}
					number++;
				}
				
				
			System.out.println("4. print out all the even numbers between 0 ~ 100 ");
			int number1 = 0;
			
			while(number1 <= 100) {
//				System.out.println(number);
				
				if(number1%2 == 0) {
					System.out.println(number1);
				}
				number1++;
			}
				
			
			 number1 = 0;
			
			while(number1 <= 100) {
//				System.out.println(number);
				
				if(number1%5 == 0) {
					System.out.println(number1);
				}
				number1++;
			}
			
			
			int counter = 1;
			
			while(counter <= 500) {
				System.out.println("Push up "+counter);
				counter++;
			}
			
	
	
}
}