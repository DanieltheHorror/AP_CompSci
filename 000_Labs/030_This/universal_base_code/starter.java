/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test = new PooleDwarf();
		int dupes = 0;
		
		PooleDwarf a = new PooleDwarf(randName(), 1);
		PooleDwarf b = new PooleDwarf(randName(), 2);
		PooleDwarf c = new PooleDwarf(randName(), 3);
		PooleDwarf d = new PooleDwarf(randName(), 4);
		PooleDwarf e = new PooleDwarf(randName(), 5);
		PooleDwarf f = new PooleDwarf(randName(), 6);
		PooleDwarf g = new PooleDwarf(randName(), 7);
		
		if (a.isSameName(b.getName())) {
			dupes++;
		}
		
		if (a.isSameName(c.getName())) {
			dupes++;
		}
		
		if (a.isSameName(d.getName())) {
			dupes++;
		}
		
		if (a.isSameName(e.getName())) {
			dupes++;
		}
		
		if (a.isSameName(f.getName())) {
			dupes++;
		}
		
		if (a.isSameName(g.getName())) {
			dupes++;
		}
		
		System.out.println("There were " + dupes + " duplicates. The name was " + a.getName() + ".");

	}
}
