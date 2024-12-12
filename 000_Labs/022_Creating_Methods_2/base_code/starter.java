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
		System.out.println("Please input your integer: ");
		int integer = sc.nextInt();
		
		System.out.println("Please inout your exponent: ");
		int exponent = sc.nextInt();
		
		int answer = integer;
		
		while (exponent > 1) {
			answer = answer * integer;
			exponent --;
		}
		System.out.println("Your number is " + answer + ".");

		
	}
}
