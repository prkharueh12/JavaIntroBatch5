package day14CallMethod;

public class calculator {

	public static void main(String[] args) {
		add2Numbers(1, 3);
		add2Numbers(20, 68);
		add2Numbers(-30, 40);
		sub2Number (1 , 0.5);
		div2Num (100, 5, 2);
	}
	public static void add2Numbers(int a, int b) {
		
//		int a = 5;
//		int b = 5;
		System.out.println(a+b);
	}
	
	public static void sub2Number (double num1, double num2) {
		
		System.out.println(num1 - num2);
	}
	
	public static void div2Num (int a , long b, double c) {
		System.out.println((a/b)*c);
	}
}
