package homeworkIntro;
//Subject: Create Converter From Kilo to Pounds 
//Author: PARK
//Date: 10/12/2020
import javax.swing.JOptionPane;

public class KgToPounds {

	public static void main(String[] args) {
        
		String enterKilo = JOptionPane.showInputDialog("Please Enter the mass value in kilogram: ");
		

		double kilogram = Double.parseDouble(enterKilo);
		
		Double sumKilotoPounds = kilogram*2.20462;

				
		JOptionPane.showMessageDialog(null, kilogram + " kilogram equal " + sumKilotoPounds + " pounds." 
				,"Kilo to Pounds Converter Tool", JOptionPane.PLAIN_MESSAGE);
		System.exit(0);
	}

}
