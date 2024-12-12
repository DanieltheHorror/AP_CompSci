/*
 *	Author:  Daniel Miller
 *  Date: 9/19/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

    double num1 = Math.max(13-6*11,30%7*-2);
    double num2 = Math.sqrt(3*8+31%7);
    double num3 = Math.pow(37/3,35%21);
    double num4 = Math.max(Math.pow(2,14%3),Math.sqrt(2*6));
    
    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);
    System.out.println(num4);
    
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your first number?");
    double firstnum = scan.nextDouble();
    
    System.out.println("What is your second number?");
    double secondnum = scan.nextDouble();
    
    double max = Math.max(firstnum,secondnum);
    double square = Math.sqrt(firstnum*secondnum);
    double pow = Math.pow(firstnum,secondnum);
    
    System.out.println(max);
    System.out.println(square);
    System.out.println(pow);
	}
}
