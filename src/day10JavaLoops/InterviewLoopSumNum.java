package day10JavaLoops;

public class InterviewLoopSumNum {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 5; i < 9; i++) {
			//System.out.println(i);
			//sum = sum+i;
			sum += i;
		}
		for (int j = 9; j >= 6; j--) {
			//System.out.println(j);
			//sum = sum+j;
			sum += j;
		}
		
		System.out.println(sum);
	}

}
