package homeworkArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintNameStartWithAlphaReq {

	public static void main(String[] args) {
		/*Write a program to find all the name start with the character 'C' or 'S' or 'N',
		names = Kanin, Jesus, Cesar, Park, Gift, Charlee, Nobel, Beneesh, Sam, Sim, Shawn, 
		Nasir, Syed, Shafkat, Mustakil, Andrew, Nadir, LJ, Ilham*/
		
		String name [] = {"Kanin", "Jesus", "Cesar", "Park", "Gift", "Charlee", "Nobel", "Beneesh", "Sam"
				, "Sim", "Shawn", "Nasir", "Syed" , "Shafkat", "Mustakil", "Andrew", "LJ", "Ilham" };
		
		ArrayList <String> nameList = new ArrayList <String> (Arrays.asList(name));
		
		nameList.removeIf(nL -> !nL.startsWith("C") && !nL.startsWith("S") &&  !nL.startsWith("N"));
		System.out.println(nameList);
		
		// we can use CharAt(0) instead of startsWith
		
//		for (int i = 0; i < nameList.size (); i++) {
//			//System.out.println(nameList.get(i));
//			if (nameList.get(i).startsWith("C")) {
//				System.out.println(nameList.get(i));
//			}
//		}

	}

}

 