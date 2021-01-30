package day12Arrays;

public class ForEachLoopStrLengthLetter {

	public static void main(String[] args) {
		String name[] = { "Bruno", "Martial", "Greenwood", "Bissaka", "Fred", };
		
		String test = name [2];
		System.out.println(test); // Greenwood
		System.out.println(test.charAt(8)); //d
		System.out.println(test.length()-1);// 9
		System.out.println(test.charAt(test.length()-1)); //d
		
		
		// print only length of 4 in the name
		for (String player : name) {                          // inside the first For Each Loop
//			if (player.length() < 5) {
//				System.out.println("The player that has 4 alphabet: "+player);
//			}
			
			
			// print names that contain 'M' 'G'
//			char charArr[] = player.toCharArray();
//			
//			for (char item : charArr) {
//				if (item == 'M' || item == 'G') {
//					System.out.println(player);
//				}
//			}
			
			
			//print name endwith <M>
			
			if (player.endsWith("l")) {
				System.out.println(player);
			}
			            // could be player.charAt(3) ---> Index
			if(player.charAt(player.length()-1)== 'd') {
				System.out.println(player);
			}
			
		}                                                 // inside the first For Each Loop
		
		

	}
}