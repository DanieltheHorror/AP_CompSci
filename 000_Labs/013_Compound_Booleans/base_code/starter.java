/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	
        
        System.out.println("What is the first integer?");
        int first = sc.nextInt();
    
        System.out.println("What is your second integer?");
        int second = sc.nextInt();
        
        System.out.println("What is your third integer?");
        int third = sc.nextInt();
        
        if ((first > second) && (first > third)) {
         System.out.println("Your first number is the largest of the three!");
         System.out.print("The number was " + first);
        } else if ((second > first) && (second > third)) {
            System.out.println("Your second number was the largest of the three!");
            System.out.println("The number was " + second);
        } else if ((third > first) && (third > second)) {
            System.out.println("The third number was the largest of the three");
            System.out.println("The number was " + third);
        }
        
        if ((first < second) && (first < third)) {
            System.out.println("Your first number was the smallest of the three!");
            System.out.println("The number was " + first);
        } else if ((second < first) && (second < third)) {
            System.out.println("The second number was the smallest of the three!");
            System.out.println("The number was " + second);
        } else if ((third < first) && (third < second)) {
            System.out.println("The third number was the smallest of the three!");
            System.out.println("The number was " + third);
        }
        
	}
}