package day13ArraysContinued;

import java.util.Arrays;

public class twoDimenArrays {

	public static void main(String[] args) {
		String devTeam [] = {"David","Mike","Phalgun","vijaya"};
		String devTester [] = {"Joe","Olivia"};
		String uatTester [] = {"Tom","Shawn"};
		String scrumMaster [] = {"Renee"};
		String ba [] = {"Angie","Mathew"};
		String po [] = {"Francis","Ananya"};
	
		String scrumTeam [][] = {devTeam,devTester,uatTester,scrumMaster,ba,po};
		
	int teamTotal = 0;
	
        //System.out.println(Arrays.toString(scrumTeam));
        
		for (int i = 0; i < scrumTeam.length; i++) {
			System.out.println(Arrays.toString(scrumTeam[i]));
			teamTotal += scrumTeam[i].length;
		}
		
		System.out.print("Total of the team is: "+teamTotal);
	}
}
