package homeworkIntro;
//Subject: Create Converter From GallonToLitters
//Author: PARK
//Date: 10/12/2020
import javax.swing.JOptionPane;


public class GallonToLiters {

	public static void main(String[] args) {
		
		String enterGallon = JOptionPane.showInputDialog("Please Enter the volume in gallon: ");
		

		double usGallon = Double.parseDouble(enterGallon);
		
		Double sumGallonToLiter = usGallon*3.78541;

				
		JOptionPane.showMessageDialog(null, usGallon + " gallons equal " + sumGallonToLiter + " liters." 
				,"Gallons Converter Tool", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);

	}

}
