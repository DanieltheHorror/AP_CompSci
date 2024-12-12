/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
      	Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input your first number: ");
		int firstnumber = sc.nextInt();
		
		System.out.println("Please input your second number: ");
		int secondnumber = sc.nextInt();
		
		if (firstnumber != secondnumber) {
			System.out.println("Your numbers are different!");
		} else {
			System.out.println("Your numbers are the same!");
		}
		
		
	}
}
