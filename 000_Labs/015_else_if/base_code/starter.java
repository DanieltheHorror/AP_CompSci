/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Random ran = new Random(/*System.in*/);
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		boolean guessloop = true;
		int guesses = 0;
		int highscore = 1001;
		
		while (loop == true) {
		
		int randomnumber = ran.nextInt(1,1000);
		System.out.println("Guess the number! 1-1000: ");
		
		while (guessloop == true) {
		int guess = sc.nextInt();
		if (guess == randomnumber) {
			System.out.println("You got it!");
			System.out.println("Number of guesses: " + guesses);
			if (guesses < highscore) {
				highscore = guesses;
		    }
				System.out.println("Your highscore is " + highscore);
				guesses = 0;
				break;
		    
		} else if (guess > randomnumber) {
			System.out.println("The number is lower than that!");
			guesses = guesses + 1;
		    
		} else if (guess < randomnumber) {
			System.out.print ("The number is higher than that!");
			guesses = guesses + 1;
		    }
		}
		}

	}
}
