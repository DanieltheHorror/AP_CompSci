/*
 *	Author:  Daniel Miller
 *  Date: 9/19/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner scan = new Scanner(System.in);
    System.out.println("What is your first name?");
    String name = scan.nextLine();
    
    System.out.println("How old are you?");
    String age = scan.nextLine();
    
    System.out.println("What month were you born?");
    String month = scan.nextLine();
    
	System.out.println("What day were you born? (__(th)(nd)(st))");
    String day = scan.nextLine();
    
    System.out.println("What year were you born?");
    String year = scan.nextLine();
    
    System.out.println("How much is a buck fifty?");
    String buck = scan.nextLine();
    
    System.out.println("So let me get this straight. Your name is " + name + ", you are " + age + " years old, you were born on " + month + " " + day + ", " + year + ", and you think that a buck fifty is " + buck + "? Wow.");
	}
}
