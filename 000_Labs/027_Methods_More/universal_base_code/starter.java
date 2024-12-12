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
		BaseClass test = new BaseClass();
		myCharacter c = new myCharacter();
		
		c.setRole();
		
		c.setStrength(2);
		c.setDexterity(2);
		c.setIntelligence(2);
		c.setConstitution(2);
		c.setCharisma(2);
		
		c.setAll("Rogue", 3, 3, 3, 3, 3);

		
	}
}
