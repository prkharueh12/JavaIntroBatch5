package homeworkIntro;

// Subject : Salary Calculation with JOtionPane
// Author: PARK
// Date : 10/12/2020

import javax.swing.JOptionPane;
public class NewSalaryCalculation {

	public static void main(String[] args) {
		
		String incomeYearly = JOptionPane.showInputDialog("Please Enter your income : ");
		String stateTax = JOptionPane.showInputDialog("Please Enter your State tax rate (use decimal) : ");
		String federalTax = JOptionPane.showInputDialog("Please Enter your Federal tax rate (use decimal) : ");
		
		double income = Double.parseDouble(incomeYearly);
		double stateTaxRate = Double.parseDouble(stateTax);
		double federalTaxRate = Double.parseDouble(federalTax);

		double sumTaxPaid = (stateTaxRate + federalTaxRate) * income;
		double salaryAfterTax = income - sumTaxPaid;
		
		
	
		JOptionPane.showMessageDialog(null, "You have earned: $"+ income + "\nYour State Tax is: "+ stateTaxRate + "\nYour Federal Tax is: " + federalTaxRate+ "\nYour total income after tax is: $"+salaryAfterTax 
		, "Salary Calculator Tool", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}
