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
	
	System.out.println("What is your name?");
	String name = sc.nextLine();
	
	System.out.println("How many times do you want this to repeat?");
	int num = sc.nextInt();
	
	while (num > 0) {
		System.out.println(name);
		num --;
	}
		
	}
}
