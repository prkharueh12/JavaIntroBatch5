package day19OOP_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

import day18ClassAndObjectWithConstructor.Student;

public class ShoppingList {

	public static void main(String[] args) {
		Item prod1 = new Item ("Chocolate", 15, 1);
		Item prod2 = new Item ("Lotion", 21, 2);
		Item prod3 = new Item ("Toothbrush", 5, 14);
		Item prod4 = new Item ("Beer", 30, 1);
		Item prod5 = new Item ("iPhone", 600, 1);
		
		
		Item itemList[] = {prod1, prod2,prod3,prod4,prod5};
		
		ArrayList <Item> myList = new ArrayList <Item> (Arrays.asList(itemList));
		
		double total = 0;
		
		for (int i = 0; i < myList.size(); i++) {
			total += myList.get(i).calCost();
			
		}
		
		System.out.println("Total is: $"+total);
	}

}
