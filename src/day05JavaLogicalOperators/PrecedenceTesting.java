package day05JavaLogicalOperators;

public class PrecedenceTesting {

	public static void main(String[] args) {
		// () []
		
		// left to Right
		int num = 10 + 20 -5;
		
		num = 10 + 20/5; // 14
		
		// division goes first!
		num = (10+20) /5 ; // 6
		
		int i = 6+3*10/6;
		// i = 6+5

	}

}
