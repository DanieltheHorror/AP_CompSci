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
    
    int randomnumber = ran.nextInt(1,1000);
    System.out.println("Pick a number! 1-1000: ");
    
    int guess = sc.nextInt();
    if (guess == randomnumber) {
        System.out.println("You got it!");
    } else{
        if (guess != randomnumber) {
            System.out.println("Your number wasn't the random number. The number was " + randomnumber); 
		}
	}
}
}
