/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number and we'll print out every prime before that number: ");
		int num = sc.nextInt();
		printPrimes(num);
		
	}
		
	public static boolean checkPrime(int i) {
		int count = (i - 1);
		while (count > 1) {
			if (i % count == 0) {
				return false;
			} else {
				count--;
			}
		}
	return true;
		
	}
	
	public static void printPrimes(int num) {
		int count = (num - 1);
		while (count > 1) {
			if (checkPrime(count)) {
				System.out.println(count);
			}
			count--;
		}
		
	}
	
}
