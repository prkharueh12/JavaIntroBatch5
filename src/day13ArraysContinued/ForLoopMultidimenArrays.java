package day13ArraysContinued;

import java.util.Arrays;

public class ForLoopMultidimenArrays {

	public static void main(String[] args) {
		String devTeam[] = { "David", "Mike", "Phalgun", "vijaya" };
		String devTester[] = { "Joe", "Olivia" };
		String uatTester[] = { "Tom", "Shawn" };
		String scrumMaster[] = { "Renee" };
		String ba[] = { "Angie", "Mathew" };
		String po[] = { "Francis", "Ananya" };

		String scrumTeam[][] = { devTeam, devTester, uatTester, scrumMaster, ba, po };
            // outer loop
		for (int i = 0; i < scrumTeam.length; i++) {
			// System.out.println(Arrays.toString(scrumTeam[i]));
			for (int j = 0; j < scrumTeam[i].length; j++) {
				System.out.println("ScrumTeam[" + i + "]" + "[" + j + "]" + " = " + scrumTeam[i][j]);
			}
		}

		
//		for (int i = 1; i < 6; i++) {
//			//System.out.println(i);
//			for (int j = 1; j < 6; j++) {
//				System.out.print(j+ ",");
//			}
//			System.out.println();
//		}
		
		
		
		
		
	}

}
