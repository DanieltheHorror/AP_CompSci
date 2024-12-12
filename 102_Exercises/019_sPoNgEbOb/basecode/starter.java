/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Give me a word");
		String word = sc.nextLine();
		
		for (int i = 0; i < word.length(); i++) {
			if (i % 2 == 1) {
				System.out.print(word.substring(i,(i + 1)).toLowerCase());
			} else {
				System.out.print(word.substring(i, (i + 1)).toUpperCase());
			}
		}
	}
}
