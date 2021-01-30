package homeworkIntro;

import java.util.Scanner;

public class MaxOccupant {

	public static void main(String[] args) {
		/*
			Given a house type (String) print out the number of max occupants (int)
			Tree house: 1
			Mobile home: 2
			Apartment: 4
			Town house: 6
			Villa: 8
			Mansion: 10 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter house type: such as Tree House, Mobile Home, Aparment, Town House, Villa, or Mansion ");
		String houseType = input.nextLine();
		
		switch (houseType) {
		case "Tree House":
			System.out.println("The max occupant is 1 person.");
			break;
		case "Mobile Home":
			System.out.println("The max occupant is 2 persons.");
			break;
		case "Apartment":
			System.out.println("The max occupant is 4 persons.");
			break;
		case "Town House":
			System.out.println("The max occupant is 6 persons.");
			break;
		case "Villa":
			System.out.println("The max occupant is 8 persons.");
			break;
		case "Mansion":
			System.out.println("The max occupant is 10 persons.");
			break;

		default:
			System.out.println("Invalid house type!! Re-enter!");
			break;
		}
		 
       input.close();
	}

}
