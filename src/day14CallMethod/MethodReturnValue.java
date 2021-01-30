package day14CallMethod;

public class MethodReturnValue {

	public static void main(String[] args) {
		
			return10();
			int newNum = return5();
			System.out.println(newNum);
			
			double result = sum(5, 2.5);
			System.out.println(result);
			
			
			float resMul = sumMul(55533434.42f, 1.44f);
			System.out.println(resMul);
			float resDiv = sumDiv(25, 5);
			System.out.println(resDiv);
			System.out.println(sumDiv(15,5));  // same process
	}
	
	
	public static int return5() {
		int num = 5 ;
		return num ;
	}
	
	public static double sum(int a, double b) {
		
		return a+b ;
			
	}
	
	
	public static void return10() {
		
		System.out.println(10);
	}
	
	public static float sumMul(float a, float b) {
		
		return a*b;
	}

	public static float sumDiv(float a, float b) {
	
		return a/b;
}
	

}// end class
