/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Would you like to be a Wizard, Warrior, or Rogue");
	String answer = sc.nextLine();
	
	if (answer.equals("Wizard") || (answer.equals("wizard"))) {
		System.out.println("You've chosen the wizard! Excelsior!");
	} else if (answer.equals("Warrior") || answer.equals("warrior")) {
		System.out.println("You've chosen the Warrior! For honor!");
	} else if (answer.equals("Rogue") || answer.equals("")) {
		System.out.println("You've chosen the Rogue! How cunning!");
	} else {
		System.out.println("You've decided to not choose a role. Rerun program.");
	}
	
	}
}
