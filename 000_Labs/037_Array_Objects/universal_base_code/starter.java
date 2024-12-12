/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// wizardour code goes below here
		Warrior[] warrior = new Warrior[100];
		Wizard[] wizard = new Wizard[100];
		for (int i = 0; i < warrior.length; i++) {
			warrior[i] = new Warrior();
		}
		for (int i = 0; i < wizard.length; i++) {
			wizard[i] = new Wizard();
		}
		
		int currentwizard = 0;
		int currentwarrior = 0;
		
		
		while (true) {
			
			wizard[currentwizard].attack(warrior[currentwarrior]);
			if (warrior[currentwarrior].isDead()) {
				currentwarrior++;
				if (currentwarrior == 100) {
					break;
				}
			}
			
			warrior[currentwarrior].attack(wizard[currentwizard]);
			if (wizard[currentwizard].isDead()) {
				currentwizard++;
				if (currentwizard == 100) {
					break;
				}
			}
			
		}
		
		if (currentwizard < currentwarrior) {
			System.out.println("The wizards won! There are " + (100-currentwizard) + " left!");
		} else {
			System.out.println("The warriors won! There are " + (100-currentwarrior) + " left!");
		}
		
	}
}
