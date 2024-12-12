/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 
		 int [] first = new int [1001];
		 int i = 0;
		 /*
		 int count = 3;
		 while (i < first.length) {
		 	
			first[i] = count;
			count += 3;
			System.out.println(first[i]);
			i++;
		 	
		 }
		 */
		 
		 int count = 1000;
		 while (i < 1001) {
		 	first[i] = count;
		 	count -= 1;
		 	System.out.println(first[i]);
		 	i++;
		 }
		 
	}
}
