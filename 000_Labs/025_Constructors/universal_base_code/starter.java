/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass bc = new BaseClass();
		Scanner sc = new Scanner(System.in);
		
		bc.classToString();
		
		System.out.println("What class would you like to be?");
		String answer = sc.nextLine();
		
		if (answer.equals("Wizard") || (answer.equals("wizard"))) {
			System.out.println("You've chosen the wizard! Excelsior!");
		} else if (answer.equals("Warrior") || answer.equals("warrior")) {
			System.out.println("You've chosen the Warrior! For honor!");
		} else if (answer.equals("Rogue") || answer.equals("rogue")) {
			System.out.println("You've chosen the Rogue! How cunning!");
		} else {
			System.out.println("You've decided to not choose a role. Rerun program.");
			System.exit(0);
		}
	
		BaseClass bcs = new BaseClass(answer, 0, 0, 0, 0, 0);
		
		bcs.classToString();
		
	}
}
