/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		Employee thebestone = new Employee(1800, "VERY PRIVILEGED", "\"Worker\"", 2250);
		
		michael.raiseSalary(5);
		dwight.raiseSalary(2);
		jim.raiseSalary(10);
		pam.raiseSalary(5);
		thebestone.raiseSalary(-5);
		
		michael.employeeToString();
		System.out.println(michael.getAnnualSalary());
		dwight.employeeToString();
		System.out.println(dwight.getAnnualSalary());
		jim.employeeToString();
		System.out.println(jim.getAnnualSalary());
		pam.employeeToString();
		System.out.println(pam.getAnnualSalary());
		thebestone.employeeToString();
		System.out.println(thebestone.getAnnualSalary());
		
	}
}
