/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
	
	int [] nums = new int [20];
	int dupes = 0;
	
	for (int i = 0; i < 20; i++) {
		int a = (int)(Math.random()*10 + 1);
		nums[i] = a;
	}
	int a = (int)(Math.random()*10 + 1);
	for (int i = 0; i < 20; i++) {
		if (nums[i] == a) {
			dupes++;
			System.out.println("Duplicate at index " + i);
		}
	}
	System.out.println("There were " + dupes + " duplicates.");
	
	for (int i = 0; i < 19; i++) {
		if (nums[i] == nums[i + 1]) {
			System.out.println("Index " + i + " and " + (i + 1) + " are the same!");
			System.out.println("The number was " + nums[i] + ".");
			}
		}
	}
}
