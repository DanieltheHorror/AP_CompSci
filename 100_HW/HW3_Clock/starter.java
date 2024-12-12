/*
 *	Author: Daniel Miller
 *  Date: 10/1/24
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter what day it is (0-6): ");
	int day = sc.nextInt();
	
	if ((day >= 1) && (day <= 5)) {
		System.out.println("It's a weekday! Wake up! It's 7AM!");
	} else if ((day == 0) || (day == 6)) {
		System.out.println("It's the weekend! It's 10AM!");
	} else {
		System.out.println("This is not a valid number");
	}

	}
}
