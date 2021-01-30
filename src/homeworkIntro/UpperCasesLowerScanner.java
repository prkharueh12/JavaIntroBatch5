package homeworkIntro;

import java.util.Scanner;

public class UpperCasesLowerScanner {

	public static void main(String[] args) {
//		char test1 = 65 ; //naturally takes alphabet with single quotation
//		
//		char test2 = 'A';
//		
//		int  test3 = 'B' ;//naturally takes ONLY numbers
//		System.out.println(test1);
//		System.out.println(test2);
//		System.out.println(test3);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter you letter here: ");
		String enterAlpha = input.nextLine() ;
		String upLow = "";
		
		if (enterAlpha.equals("A")){
			upLow ="Uppercase";
		}else if (enterAlpha.equals("B")) {
			upLow ="Uppercase";
		}else if (enterAlpha.equals("C")) {
			upLow ="Uppercase";
		}else if (enterAlpha.equals("D")) {
			upLow ="Uppercase";
		}else if (enterAlpha.equals("E")) {
			upLow ="Uppercase";
		}else if (enterAlpha.equals("F")) {
			upLow ="Uppercase";
		}else if (enterAlpha.equals("G")) {
			upLow ="Uppercase";
		}else if (enterAlpha.equals("H")) {
			upLow ="Uppercase";
		}else if (enterAlpha.equals("I")) {
			upLow ="Uppercase";
		}else if (enterAlpha.equals("J")) {
			upLow ="Uppercase";
		}else if (enterAlpha.equals("K")) {
			upLow ="Uppercase";
		}else if (enterAlpha.equals("L")) {
			upLow ="Uppercase";
		}else if (enterAlpha.equals("M")) {
			upLow ="Uppercase";
		}else if (enterAlpha.equals("N")) {
			upLow ="Uppercase";
		}else if (enterAlpha.equals("O")) {
			upLow ="Uppercase";
		}else if (enterAlpha.equals("P")) {
			upLow ="Uppercase";
		}else if (enterAlpha.equals("Q")) {
			upLow ="Uppercase";
		}else if (enterAlpha.equals("R")) {
			upLow ="Uppercase";
		}else if (enterAlpha.equals("S")) {
			upLow ="Uppercase";
		}else if (enterAlpha.equals("T")) {
			upLow ="Uppercase";
		}else if (enterAlpha.equals("U")) {
			upLow ="Uppercase";
		}else if (enterAlpha.equals("V")) {
			upLow ="Uppercase";
		}else if (enterAlpha.equals("W")) {
			upLow ="Uppercase";
		}else if (enterAlpha.equals("X")) {
			upLow ="Uppercase";
		}else if (enterAlpha.equals("Y")) {
			upLow ="Uppercase";
		}else if (enterAlpha.equals("Z")) {
			upLow ="Uppercase";
		}
		
		else {
			System.out.println("The letter you entered is Lowercase");
		}
		System.out.println(upLow);
		
		input.close();
	}

}
