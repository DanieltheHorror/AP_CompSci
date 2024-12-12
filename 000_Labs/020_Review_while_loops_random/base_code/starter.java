/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
	int num = (int)(Math.random()*1000 + 1);
	System.out.println("Please guess a number 1-1000");
	
	while (true) {
		int guess = sc.nextInt();
		if (guess == num) {
			System.out.println("You got it!");
			break;
		} else {
			System.out.println("Incorrect! Try again!");
		}
	}


		
	}
}
