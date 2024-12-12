package pkg;
import java.util.Scanner;

public class myCharacter {
    
    Scanner sc = new Scanner(System.in);
    
	String role = "No Role";
	int str;
	int dex;
	int intel;
	int cha;
	int con;
    
    
    public myCharacter() {
		
		role = "No Role";
		str = 0;
		dex = 0;
		intel = 0;
		cha = 0;
		con = 0;
		}
    
    public void setRole(/*String role*/) {
		System.out.println("What class would you like to be?");
		String answer = sc.nextLine();
        
        if (answer.equals("Wizard") || (answer.equals("wizard"))) {
			System.out.println("You've chosen the wizard! Excelsior!");
			role = answer;
		} else if (answer.equals("Warrior") || answer.equals("warrior")) {
			System.out.println("You've chosen the Warrior! For honor!");
			role = answer;
		} else if (answer.equals("Rogue") || answer.equals("rogue")) {
			System.out.println("You've chosen the Rogue! How cunning!");
			role = answer;
		} else {
			System.out.println("You've decided to not choose a role. Rerun program.");
			role = "No role";
        }
        
    }
    
    public void setStrength(int add) {
        if (add <= 0) {
            str = 0;
        } else {
            str = add;
        }
    }
    
    public void setDexterity(int add) {
        if (add <= 0) {
            dex = 0;
        } else {
            dex = add;
        }
    }
    
    public void setIntelligence(int add) {
        if (add <= 0) {
            intel = 0;
        } else {
            intel = add;
        }
    }
    
    public void setCharisma(int add) {
        if (add <= 0) {
            cha = 0;
        } else {
            cha = add;
        }
    }
    
    public void setConstitution(int add) {
        if (add <= 0) {
            con = 0;
        } else {
            con = add;
        }
    }
    
    public boolean setAll(String r, int s, int d, int intel, int c, int cha) {
        role = r;
        setStrength(s);
        setDexterity(d);
        setIntelligence(intel);
        setConstitution(c);
        setCharisma(cha);
        
		System.out.println("Your role is " + role);
		System.out.println("Your stregnth trait is " + str);
		System.out.println("Your dexterity trait is " + dex);
		System.out.println("Your intelligence trait is " + intel);
		System.out.println("Your constitution trait is " + con);
		System.out.println("Your charisma trait is " + cha);
		System.out.println("------------------------------------------------");
        
        if (s >= 0 && d >= 0 && intel >= 0 && c >= 0 && cha >= 0) {
            return true;
        } else {
            return false;
        }
    }
    
    
    
}