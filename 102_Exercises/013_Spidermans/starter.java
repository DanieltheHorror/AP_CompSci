/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman x = new Spiderman();
		x.setActor("Tom Holland");
		x.setAge(24);
		x.setVillain("Venom");
		
		Spiderman y = new Spiderman("Tobey Maguire", 45, "Electro");

		Spiderman z = new Spiderman("Andrew Garfield");
		z.setAge(28);
		z.setVillain("Green Goblin");
		
		Spiderman tikimasala = new Spiderman("Jay Randeria", 14, "Jackson Chung");
	}
}
