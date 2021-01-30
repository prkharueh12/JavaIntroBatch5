package homeworkIntro;
//Subject : Create Currency Converter for EURO, LIRA, and RMB
//Author : PARK
//Date : 10/12/2020

import javax.swing.JOptionPane;

public class CurrencyConverter {

	public static void main(String[] args) {
		
		String enterUS = JOptionPane.showInputDialog("How much money do you want to convert? \nEnter in US dollars: $$$");
		
		double usDollars = Double.parseDouble(enterUS);
		
		double usToEuro = usDollars * 0.85 ;
		double usToLira = usDollars * 7.89 ;
		double usToRmb = usDollars * 6.75 ;
		
		JOptionPane.showMessageDialog(null, "You have entered: $ "+ usDollars , "Message", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Your money in US dollars: $"+ usDollars + " equals to € " + usToEuro + " EURO." 
		                                 +"\nYour money in US dollars: $"+ usDollars + " equals to  " + usToLira + " Turkish lira."
		                                 +"\nYour money in US dollars: $"+ usDollars + " equals to ¥ " + usToRmb + " Chinese Yuan."
				
		, "Currency Converter Tool", JOptionPane.WARNING_MESSAGE);
	
		System.exit(0);
	}

}
