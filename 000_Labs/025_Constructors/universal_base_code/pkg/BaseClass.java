/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int example = 0;
	
	String answer = "No Role";
	int str;
	int dex;
	int intel;
	int cha;
	int con;

	public BaseClass() {
		answer = "No Role";
		/*
		str = 0;
		dex = 0;
		intel = 0;
		cha = 0;
		con = 0;
		*/
	}
	
	public BaseClass(String c, int str, int dex, int intel, int cha, int con) {
		answer = c;
		this.str = str;
		this.dex = dex;
		this.intel = intel;
		this.cha = cha;
		this.con = con;
	}

	public void classToString() {
		System.out.println("Your role is " + answer);
		System.out.println("Your stregnth trait is " + str);
		System.out.println("Your dexterity trait is " + dex);
		System.out.println("Your intelligence trait is " + intel);
		System.out.println("Your constitution trait is " + con);
		System.out.println("Your charisma trait is " + cha);
		System.out.println("------------------------------------------------");
	}
	
	
}
