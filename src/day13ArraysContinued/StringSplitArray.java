package day13ArraysContinued;

import java.util.Arrays;

public class StringSplitArray {

	public static void main(String[] args) {
		// to split the string; 
		
		String actual = "Buy USD SELL RMB";
		String expected = "Buy RMB SELL USD";
		
		String str = "Hello:Irfan:Nobel:Kanin";
		// .split will make array[] set
		String arr [] = str.split(":"); // will take only :
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(Arrays.toString(arr));
		
		String str2 [] = actual.split(" ");
		for (int i = 0; i < str2.length; i++) {
			System.out.print(str2[i]+ " ");
		}

		String expectedStr = 
				str2[0].concat(" ")
				.concat(str2[3])
				.concat(" ")
				.concat(str2[2])
				.concat(" ")
				.concat(str2 [1]);
				
		System.out.println(expectedStr);
		
				
		
		if (expectedStr.equals(expected)) {
			System.out.println("I found my row");
		}
				
		
		String email = "irfan@techcircle.com";
		
		String parts[] = email.split("@");
		
		System.out.println("name = " + parts[0]);
		
		String domainName = parts[1];
		
		System.out.println(domainName.length());
		
		String domains[] =  domainName.split("\\.");
		
		System.out.println("domainName : "+domains[0]);
	}

}
