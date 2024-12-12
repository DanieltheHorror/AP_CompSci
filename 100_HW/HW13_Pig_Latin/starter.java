/*
   * Author:
   * Date:
   * Collaborator(s):
*/
	import java.util.Scanner;

class starter {
	public static String[] vowels = {"a", "e", "i", "o", "u"};
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input a sentence");
		String sentence = sc.nextLine();
		
		String[] words = sentence.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			pigLatin(words[i]);
		}	

	}
	
	public static void pigLatin(String word) {
		if (isVowel(word.substring(0,1))) {
			word += "way";
			System.out.print(word + " ");
		} else {
			if (word.length() >= 2) {
				if (!isVowel(word.substring(1,2))) {
					word = word.substring(2) + word.substring(0,2) + "ay";
					System.out.print(word + " ");
				} else {
					word = word.substring(1) + word.substring(0,1) + "ay";
					System.out.print(word + " ");
				}
			}
		}
	}
	
	public static boolean isVowel(String letter) {
		for (int i = 0; i < vowels.length; i++) {
			if (letter.equalsIgnoreCase(vowels[i])) {
				return true;
			}
		}
		return false;
	}
}