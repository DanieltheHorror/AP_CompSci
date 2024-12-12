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
		int a = (int)(Math.random()*150 + 51);
		int [] nums = new int[a];
		int minimum = 101;
		int maximum = 0;
		int sum = 0;
		
		for (int i = 0; i < a; i++) {
			nums[i] = (int)(Math.random()*100 + 1);
		}
		
		for (int i = 0; i < a; i++) {
			if (nums[i] < minimum) {
				minimum = nums[i];
			}
		}
		
		for (int i = 0; i < a; i++) {
			if (nums[i] > maximum) {
				maximum = nums[i];
			}
		}
		
		for (int i = 0; i < a; i++) {
			sum += nums[i];
		}
		sum /= nums.length;
		
		
		System.out.println("There are " + a + " numbers.");
		System.out.println("The minimum is " + minimum + ".");
		System.out.println("The maximum is " + maximum + ".");
		System.out.println("The average of all of the numbers is " + sum + ".");
	
	
	}
}
