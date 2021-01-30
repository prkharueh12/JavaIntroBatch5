package day13ArraysContinued;

public class ScrumTeamCount {

	public static void main(String[] args) {
		// find the longest name and the shortest name
		
		String devTeam[] = { "David", "Mike", "Phalgun", "vijaya" };
		String devTester[] = { "Joe", "Olivia" };
		String uatTester[] = { "Tom", "Shawn" };
		String scrumMaster[] = { "Renee" };
		String ba[] = { "Angie", "Mathew" };
		String po[] = { "Franciss", "Ananya" };

		String scrumTeam[][] = { devTeam, devTester, uatTester, scrumMaster, ba, po };
		
		
		int max = 0;
		
		String name = "";
            // outer loop
		for (int i = 0; i < scrumTeam.length; i++) {
			// System.out.println(Arrays.toString(scrumTeam[i]));
			for (int j = 0; j < scrumTeam[i].length; j++) {
				
				//System.out.println("ScrumTeam[" + i + "]" + "[" + j + "]" + " = " + scrumTeam[i][j].length());
				
				if(scrumTeam[i][j].length() > max) {
					max = scrumTeam[i][j].length();
					name = scrumTeam[i][j];
					//System.out.println(max);
				}
				
				
			}
		}
		System.out.println("The longest name is: " + name + max);
	
		
		
		
		
	}

}
