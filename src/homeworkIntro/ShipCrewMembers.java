package homeworkIntro;

import java.util.Scanner;

public class ShipCrewMembers {

	public static void main(String[] args) {
		/*1) Given a number of people on the ship determine how many need to be crew members and how many can be passengers. 
		 * Print how many of each type there should be.
		Total: 50 | 20 crew, 30 passengers
		Total: 75 | 25 crew, 50 passengers
		Total: 100 | 30 crew, 70 passengers
		Any other number of people on the ship is not valid
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("How many people will be on the ship? ");
		int numPple = input.nextInt() ;
		
		if (numPple >= 50 && numPple <=100) {
		
		switch (numPple) {
		case 50:
			System.out.println("There should be 20 crew and 30 passengers for total of "+ numPple);
			break;
		case 75:
			System.out.println("There should be 25 crew and 50 passengers for total of "+ numPple);
			break;
		case 100:
			System.out.println("There should be 30 crew and 70 passengers for total of "+ numPple);
			break;

		default:
			System.out.println("Invalid number! (inside Swtich)");
			break;
		}
		}
		else {
			System.out.println("Invalid number! (for If-else)");
		}
		input.close();
	}

}
