package practiceInterviewTask;

public class withMainCallUtil {

	
	public void myfirstStatement () {
		System.out.println("Hello");
		
	}
	
	
	public void maxNumArr (int num []) {
		int max = num[0] ;

		for (int i = 0; i < num.length; i++) {
			
//			System.out.println(num[i]);
			if (num[i] > max) {
				 max = num[i]  ;
				
			}
			
		}
		System.out.println(max);
	}


	
	

	

}
