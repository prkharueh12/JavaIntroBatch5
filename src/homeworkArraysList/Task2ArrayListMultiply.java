package homeworkArraysList;

import java.util.ArrayList;

public class Task2ArrayListMultiply {

	public static void main(String[] args) {
		/*2. write a program that can multiply each odd number by 2
			ex:
			list = [1,2,3,4,5];
			output: [2,2,6,4,10]*/
		
		ArrayList <Integer> listNum = new ArrayList <Integer>();
		
		listNum.add(1);
		listNum.add(2);
		listNum.add(3);
		listNum.add(4);
		listNum.add(5);

//		for (Integer list : listNum) {
//			
//			System.out.println(list);
//		}
		
		for (int i = 0; i < listNum.size(); i++) {
			
			if (listNum.get(i) % 2 ==1) {
				listNum.set(i, listNum.get(i)*2); // replace at [i] and i *2
			}
			
		}
		System.out.println(listNum);
	}

}
