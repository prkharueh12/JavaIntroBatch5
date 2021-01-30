package homeworkIntro;
//Subject: Create Division Calculator
//Author: PARK
//Date: 10/12/2020
import javax.swing.JOptionPane;
public class DivisionCalculator {

	public static void main(String[] args) {
		
		String numOne = JOptionPane.showInputDialog("Please Enter the first number: ");
		String numTwo = JOptionPane.showInputDialog("Please Enter the second number: ");

		int num1 = Integer.parseInt(numOne);
		int num2 = Integer.parseInt(numTwo);
		
		int sumDivison = num1 / num2;
		int sumModulus = num1 % num2;
		
		JOptionPane.showMessageDialog(null, num1 + " divide by " + num2 + " equals to "+ sumDivison + " with a remainder of " + sumModulus
				,"Divison Calculator Tool", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
		
	}

}
