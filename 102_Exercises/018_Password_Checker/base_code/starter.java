import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
            i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		
		int level1 = 0;
		int level2 = 0;
		int level3 = 0;
		
        for (int k = 0; k < (passwords.length - 1); k++) {
            boolean flag1 = false;
            boolean flag2 = false;
            if (passwords[k].length() >= 8) {
                level1++;
                flag1 = true;
            }
            if (passwords[k].indexOf("!") != -1 || passwords[k].indexOf("@") != -1 || passwords[k].indexOf("#") != -1 || passwords[k].indexOf("$") != -1 || passwords[k].indexOf("%") != -1 || passwords[k].indexOf("^") != -1 || passwords[k].indexOf("&") != -1 || passwords[k].indexOf("*") != -1) {
                level2++;
                flag2 = true;
            }
            if (flag1 == true && flag2 == true) {
                level3++;
            }
        }
        System.out.println("There are " + level1 + " level 1 passwords");
        System.out.println("There are " + level2 + " level 2 passwords");
        System.out.println("There are " + level3 + " level 3 passwords");
		
	}
}
