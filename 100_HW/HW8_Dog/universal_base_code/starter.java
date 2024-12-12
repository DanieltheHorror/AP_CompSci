/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
//		BaseClass test = new BaseClass();
		Dog bob = new Dog("Bob", 4, "");
		Dog dave = new Dog("Dave", 0, "Lab");
		if (bob.isSleeping()) {
			System.out.println("Bob is asleep!");
		} else {
			System.out.println("Bob is awake!");
		}
		if (dave.isSleeping()) {
			bob.bark();
			dave.bark();
		} else {
			bob.bark();
			dave.bark();
		}
	}
}
