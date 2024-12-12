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
		String [] song = new String[10];
		song[0] = "From the top of the night until four AM";
		song[1] = "I'll be bangin' bone music on a garbage can";
		song[2] = "When this cat named pip with a vital tip, said";
		song[3] = "You better watch it jack, cause there's a girl on your back";
		song[4] = "But as a general rule I tend to play things cool";
		song[5] = "So I stroll through the bar to my favorite stool";
		song[6] = "When she approachs me so devilishly and said";
		song[7] = "Your music man, makes me go insane";
		song[8] = "I said oh- yeah, I said oh my my";
		song[9] = "She says your big bad music makes me go insane!";
		
		int count = 0;
		while (count < 10) {
			System.out.println(song[count]);
			count++;
		}
	}
}
