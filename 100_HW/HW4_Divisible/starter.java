/*
 *	Author: Daniel Miller
 *  Date: 10/3/24
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	int firstcounter = 0;
	int secondcounter = 0;
	
	System.out.println("Please input an integer");
	int first = sc.nextInt();
	
	System.out.println("Please input a second integer");
	int second = sc.nextInt();
	
	System.out.println("   ");
	
	if (first % 2 == 0) {
		System.out.println(first + " is divisible by 2!");
	} else if (first % 2 != 0) {
		System.out.println(first + " is not divisible by 2");
	} 
	if (first % 3 == 0) {
		System.out.println(first + " is divisible by 3!");
		firstcounter = firstcounter + 1;
	}
	if (first % 4 == 0) {
		System.out.println(first + " is divisible by 4!");
		firstcounter = firstcounter + 1;
	}
	if (first % 5 == 0) {
		System.out.println(first + " is divisible by 5!");
		firstcounter = firstcounter + 1;
	}
	if (firstcounter == 0) {
		System.out.println(first + " is not divisible by 3, 4, or 5");
	}

	System.out.println("   ");
	
	if (second % 2 == 0) {
		System.out.println(second + " is divisible by 2!");
	} else if (second % 2 != 0) {
		System.out.println(second + " is not divisible by 2");
	} 
	if (second % 3 == 0) {
		System.out.println(second + " is divisible by 3!");
		secondcounter = secondcounter + 1;
	}
	if (second % 4 == 0) {
		System.out.println(second + " is divisible by 4!");
		secondcounter = secondcounter + 1;
	}
	if (second % 5 == 0) {
		System.out.println(second + " is divisible by 5!");
		secondcounter = secondcounter + 1;
	}
	if (secondcounter == 0) {
		System.out.println(second + " is not divisible by 3, 4, or 5");
	}
	
	
	
	}
}
