/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	
	boolean rogue = false;
	boolean wizard = false;
	
	int points = 20;
	
	System.out.println("What is the name of your character?");
	String name = sc.nextLine();
	
	System.out.println("What is your character's title?");
	String title = sc.nextLine();
	
	System.out.println("Would you like to be a Wizard, Warrior, or Rogue");
	String answer = sc.nextLine();
	
	if (answer.equals("Wizard") || (answer.equals("wizard"))) {
		System.out.println("You've chosen the wizard! Excelsior!");
		wizard = true;
	} else if (answer.equals("Warrior") || answer.equals("warrior")) {
		System.out.println("You've chosen the Warrior! For honor!");
	} else if (answer.equals("Rogue") || answer.equals("rogue")) {
		System.out.println("You've chosen the Rogue! How cunning!");
		rogue = true;
	} else {
		System.out.println("You've decided to not choose a role. Rerun program.");
		System.exit(0);
	}
	System.out.println("It's time to choose your points!");
	System.out.println("    ");
	System.out.println("You get 20 points, and each trait can hold 10 points");
	System.out.println("---------------------------------------------------------");
	//System.out.println("    ");
	System.out.println("Strength: ");
	System.out.println("Dexterity: ");
	System.out.println("Intelligence: ");
	System.out.println("Charisma: ");
	//System.out.println("    ");
	System.out.println("---------------------------------------------------------");
	//System.out.println("    ");
	System.out.println("You have " + points + " points left");
	System.out.println("How many points do you want in strength?");
	int str = sc.nextInt();
	if ((str >= 0) && (str <= 10) && (points > 0)){
		points = points - str;
	} else {
		System.out.println("Please input a valid number next time!");
		str = 0;
	}
	System.out.println("   ");
	System.out.println("You have " + points + " points left");
	System.out.println("How many points do you want in dexterity");
	int dex = sc.nextInt();
	if ((dex >= 0) && (dex <= 10) && (points > 0)) {
		points = points - dex;
	} else {
		System.out.println("Please input a valid number next time!");
		dex = 0;
	}
	System.out.println("   ");
	System.out.println("You have " + points + " points left");
	System.out.println("How many points do you want in intelligence?");
	int intel = sc.nextInt();
	if ((intel >= 0) && (intel <= 10) && (points > 0)) {
		points = points - intel;
	} else {
		System.out.println("Please input a valid number next time!");
		intel = 0;
	}
	System.out.println("    ");
	System.out.println("You have " + points + " points left");
	System.out.println("How many points do you want in charisma?");
	int cha = sc.nextInt();
	if ((cha >= 0) && (cha <= 10) && (points > 0)) {
			points = points - cha;
	} else {
		System.out.println("Please input a valid number next time!");
		cha = 0;
		}
	
	System.out.println("---------------------------------------------------");
	System.out.println("You are " + name + ", the " + title + " of CVHS.");
	System.out.println("You're a " + answer + " with the following stats!");
	System.out.println("Strength - " + str);
	System.out.println("Dexterity - " + dex);
	System.out.println("Intelligence - " + intel);
	System.out.println("Charisma - " + cha);
	System.out.println("   ");
	System.out.println("Good luck on your quest " + name + "!");
	
	}	
}
