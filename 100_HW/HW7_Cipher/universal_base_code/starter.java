/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		Cipher ci = new Cipher();
		System.out.println("Please input your message");
		String message = sc.nextLine();
		
		String decoding = ci.keyedEncode(message, 14);
		System.out.println(decoding);

	}
}
