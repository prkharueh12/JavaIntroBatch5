package homeworkArraysList;

import java.util.ArrayList;

public class Task1CreateArraysList {

	public static void main(String[] args) {
		/*1. write a program that can set the last element of the Integer arraylist to zero
				ex:
				list = [1,2,3,4,5];
				output: [1,2,3,4,0];*/
		
		ArrayList <Integer> listNum = new ArrayList <Integer>();
		
		listNum.add(1);
		listNum.add(2);
		listNum.add(3);
		listNum.add(4);
		listNum.add(5);
		System.out.println("Before repalcement: " + listNum);
		
		//listNum.set(listNum.size()-1, 0);
		listNum.set(4, 0);
		System.out.println("After repalcement: " + listNum);

	}

}
