package day18ClassAndObjectWithConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class EmployeeObject {

	public static void main(String[] args) {
		
		
		Employee emplA = new Employee ("Bruno", "SEDT", 120000D, 'M', LocalDate.of(2021, 4, 15));
		Employee emplB = new Employee ("Cavani", "QA", 110000D, 'M', LocalDate.of(2020, 2, 1));
		Employee emplC = new Employee ("Kane", "ADMIN", 90000D, 'M', LocalDate.of(2009, 6, 30));
		Employee emplD = new Employee ("Erin", "SECURITY", 80000D, 'F', LocalDate.of(2002, 2, 15));
		Employee emplE = new Employee ("Donny", "SCRUM", 75000D, 'M', LocalDate.of(2007, 4, 5));
		Employee emplF = new Employee ("Lukie", "HELPDESK", 65000D, 'F', LocalDate.of(2013, 7, 2));
		Employee emplG = new Employee ("Juan", "MANAGER", 200000D, 'M', LocalDate.of(2019, 3, 31));
		
		Employee arrEmpName [] = {emplA,emplB,emplC,emplD,emplE,emplF,emplG}; 
		ArrayList <Employee> empList = new ArrayList <Employee> (Arrays.asList(arrEmpName));
		
		// Find the highest salary
		Double maxSalary = 0D ;
		for (int i = 0; i < empList.size(); i++) {
			 maxSalary = arrEmpName[0].salary ;
			//System.out.println(arrEmpName[i].salary);
			if(arrEmpName[i].salary > maxSalary ) {
				maxSalary = arrEmpName[i].salary;
				System.out.println("The highest salary is : "+ maxSalary);
			}
			
		} // end loop#1
		
		for (int j = 0; j < empList.size(); j++) {
				if (maxSalary == arrEmpName[j].salary ) {
					arrEmpName[j].getInfo();
				}
			}// end loop#2
			
	}

} //end class
