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
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input a sentence");
		String sentence = sc.nextLine();
		String reverse = "";
		
		while (true) {
			if (sentence.indexOf(" ") == -1) {
				System.out.print(sentence + " ");
				System.out.print(reverse);
				break;
		}
		
		int space = sentence.indexOf(" ");
		String word = sentence.substring(0, space);
		reverse = word + " " + reverse;
		sentence = sentence.substring(space + 1);
		}
	}
}
