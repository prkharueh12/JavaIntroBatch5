package day16ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArraysToArraysList {

	public static void main(String[] args) {
		
		int arr [] = {9,8,7,6,5,4,3,2,1};
		ArrayList<Integer> newArrList = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			newArrList.add(arr[i]);
			
		}
		System.out.println(newArrList.size());
		System.out.println(newArrList.get(8));
		
		List<int[]> newArrList2 = Arrays.asList(arr);
		
		System.out.println(newArrList2.get(0)[0]);
	}

}
