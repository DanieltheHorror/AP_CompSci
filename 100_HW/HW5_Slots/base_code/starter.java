/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
    Random ran = new Random();
    Scanner sc = new Scanner(System.in);
    int money = 100;
    boolean dead = false;
    while (true) {
        if (dead == true) {
            break;
        }
        System.out.println("Welcome to the Casino! Press 1 for slots, press 2 for roulette, and press 3 for russian roulette!");
        int game = sc.nextInt();
        if (game == 1) {
            slots(money);
        } else if (game == 2) {
            roulette(money);
     } else if (game == 3) {
            russia(money, dead);
        }
    }
    
    if (dead == false) {
        System.out.println("You ran out of money! Go back to your nine to five!");
    } else if (dead == true) {
        System.out.println("Mortis");
    }
	}
	
    public static int slots(int money) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Slot Machine Rules:");
    System.out.println("1. Each player starts with $100");
    System.out.println("2. Input a wager less than your total amount of money");
    System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
    System.out.println("    a. If two numbers match, you double your money.");
    System.out.println("    b. If three numbers match, you triple your money.");
    System.out.println("    c. If none match, you lose your money.");
    System.out.println("-----------------------------------------------------------");
    System.out.println("    ");
    while (true) {
        System.out.println("Would you like to play the slots? (Yes/yes/Y/y) : ");
        String play = sc.nextLine();
        
        if ((play.equals("y")) || (play.equals("Y")) || (play.equals("yes")) || (play.equals("Yes"))) {
            System.out.println("You have $" + money + ". How much would you like to wager?");
            int wager = sc.nextInt();
            sc.nextLine();
            if ((wager >= 0) && (wager <= money)) {
                int a = (int)(Math.random()*10 + 1);
                int b = (int)(Math.random()*10 + 1);
                int c = (int)(Math.random()*10 + 1);
                
                System.out.println("Great! Let's play!!!");
                System.out.println("Your rolls are: ");
                money = money - wager;
                System.out.println("_________________________");
                System.out.println("  | " + a + " | " + b + " | " + c + " |");
                System.out.println("_________________________");
                
                if ((a == b) || (a == c) || (b == c)) {
                    if ((a == b) && (b == c)) {
                        wager = wager * 3;
                        money = money + wager;
                        System.out.println("You won! Your wager has now been tripled!");
                        System.out.println("You now have $" + money + ".");
                    } else {
                        wager = wager * 2;
                        money = money + wager;
                        System.out.println("You won! Your wager has now been doubled!");
                        System.out.println("You now have $" + money + ".");
                    }
                } else {
                    System.out.println("Didn't win this time, better luck next time!");
                    System.out.println("You now have $" + money);
                }
            } else {
                System.out.println("Please choose a valid wager!");
            }
            if (money <= 0) {
                break;
            }
        } else if ((play.equals("n")) || (play.equals("N")) || (play.equals("No")) || (play.equals("no"))) {
            System.out.println("Ok, see you soon!");
            return money;
        }
    
	}
	return money;
}

    public static int roulette(int money) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            boolean red = false;
            boolean black = false;
            boolean numbers = false;
            int guess = 0;
            
            System.out.println("Welcome to Simple Roulette!");
            System.out.println("You have $" + money + " to spend!");
            System.out.println("Double your money with red or back or payout 35 to 1 with a single number!");
            System.out.println("If you would like to leave, press 1");
            System.out.println("Would you like to bed on a color or a number? (Color, Number): ");
            String bet1 = sc.nextLine();
            if (bet1.equals("1")) {
                return money;
            }
            
            if (bet1.equals("color") || (bet1.equals("Color"))) {
                System.out.println("What color would you like to bet on? ");
                String bet2 = sc.nextLine();
                
                if (bet2.equals("Red") || (bet2.equals("red"))) {
                red = true;
                }
            
                if (bet2.equals("Black") || (bet2.equals("black"))) {
                black = true;
                }
            }
            
            if ((bet1.equals("number")) || (bet1.equals("Number"))) {
                System.out.println("What number would you like to bet on? (0-36): ");
                int bet3 = sc.nextInt();
                
                guess = bet3;
                numbers = true;
            }
            
            System.out.println("How much would you like to wager?");
            int betmoney = sc.nextInt();
            
            money = money - betmoney;
            
            int wheel = (int)(Math.random()*37);
            
            if (numbers == true) {
                if (guess == wheel) {
                    betmoney = betmoney * 35;
                    money = money + betmoney;
                    System.out.println("You won!");
                    System.out.println("The number was " + wheel + ".");
                } else {
                    System.out.println("You lose!");
                    System.out.println("The number was " + wheel + ".");
                }
            }
            
            if (red == true) {
                if ((wheel >= 1) && (wheel <= 10)) {
                    if (wheel % 2 == 1) {
                        money = money + betmoney * 2;
                        System.out.println("You won!");
                        System.out.println("The number was " + wheel + ".");
                    } else {
                        System.out.println("You lose!");
                        System.out.println("The number was " + wheel + ".");
                    }
                    
                }
            
            if ((wheel >= 19) && (wheel <= 28)) {
                if (wheel % 2 == 1) {
                    money = money + betmoney * 2;
                    System.out.println("You win!");
                    System.out.println("The number was " + wheel + ".");
                } else {
                    System.out.println("You lose!");
                    System.out.println("The number was " + wheel + ".");
                }
            }
    
            if ((wheel >= 11) && (wheel <= 18)) {
                if (wheel % 2 == 0) {
                    money = money + betmoney * 2;
                    System.out.println("You win!");
                    System.out.println("The number was " + wheel + ".");
                } else {
                    System.out.println("You lose!");
                    System.out.println("The number was " + wheel + ".");
                }
            }
    
            if ((wheel >= 29) && (wheel <= 36)) {
                if (wheel % 2 == 0) {
                    money = money + betmoney * 2;
                    System.out.println("You win!");
                    System.out.println("The number was " + wheel + ".");
                } else {
                    System.out.println("You lose!");
                    System.out.println("The number was " + wheel + ".");
                }
            }
            }
        
        if (black == true) {
            
            if ((wheel >= 19) && (wheel <= 28)) {
                if (wheel % 2 == 0) {
                    money = money + betmoney * 2;
                    System.out.println("You win!");
                    System.out.println("The number was " + wheel + ".");
                } else {
                    System.out.println("You lose!");
                    System.out.println("The number was " + wheel + ".");
                }
            }
            
            if ((wheel >= 1) && (wheel <= 10)) {
                if (wheel % 2 == 0) {
                    money = money + betmoney * 2;
                    System.out.println("You win!");
                    System.out.println("The number was " + wheel + ".");
                } else {
                    System.out.println("You lose!");
                    System.out.println("The number was " + wheel + ".");
                }
            }
    
            if ((wheel >= 11) && (wheel <= 18)) {
                if (wheel % 2 == 1) {
                    money = money + betmoney * 2;
                    System.out.println("You win!");
                    System.out.println("The number was " + wheel + ".");
                } else {
                    System.out.println("You lose!");
                    System.out.println("The number was " + wheel + ".");
                }
            }
    
            if ((wheel >= 29) && (wheel <= 36)) {
                if (wheel % 2 == 1) {
                    money = money + betmoney * 2;
                    System.out.println("You win!");
                    System.out.println("The number was " + wheel + ".");
                } else {
                    System.out.println("You lose!");
                    System.out.println("The number was " + wheel + ".");
                }
            }
            
        }
        if (money == 0) {
            return money;
        }
        }
        
    }
    
    public static boolean russia(int money, boolean death) {
        Scanner sc = new Scanner(System.in);
        int blanks = 6;
        
        boolean dead = death;
        
        System.out.println("Welcome to Russian Roulette!");
        System.out.println("The game with the highest stakes!");
        System.out.println("How many opponents would you like? (1-5) ");
        int bullets = sc.nextInt();
        int rounds = bullets + blanks;
        
        blanks = blanks - bullets;
        
        System.out.println("How much money would you like to wager?");
        int wager = sc.nextInt();
        sc.nextLine();
        money = money - wager;
        
        wager = wager * bullets + wager;
        System.out.println("There is $" + wager + " on the table!");
        
        while (true) {
            
            System.out.println("Would you like to continue?");
            String chicken = sc.nextLine();
         
                if (chicken.equals("yes") || chicken.equals("Yes") || chicken.equals("Y") || chicken.equals("y")) {
        
                System.out.println("The gun has been loaded! There are " + bullets + " bullets and " + blanks + " blanks.");
                
                int spin = (int)(Math.random()*6 + 1);
                
                if (spin == 1) {
                    System.out.println("It pointed at you! Would you like to shoot yourself (1)? or shoot another player (2)? ");
                    int decision = sc.nextInt();
                    
                    if (decision == 1) {
                        int suicide = (int)(Math.random()*rounds + 1);
                        if (suicide <= bullets) {
                            bullets = bullets - 1;
                            return true;
                        } else {
                        blanks = blanks - 1;
                        if (blanks <= 0) {
                            return true;
                        }
                        System.out.println("A blank was fired!");
                        }
                    } 
                    
                    if (decision == 2) {
                        System.out.println("Who would you like to shoot? (1-" + bullets + "): ");
                        int victim = sc.nextInt();
                        int suicide = (int)(Math.random()*rounds + 1);
                        if (suicide <= bullets) {
                            bullets = bullets - 1;
                            System.out.println("You shot them! There are " + bullets + " bullets left, " + blanks + " blanks left, and " + bullets + " opponents left.");
                        } else {
                            blanks = blanks - 1;
                            System.out.println("A blank went off! There are " + blanks + " blanks left and " + bullets + " bullets left.");
                        }
                        
                    }
                    
                }
                
                if (spin != 1) {
                    System.out.println("The gun pointed at another player!");
                    int players = bullets + 1;
                    int themself = (int)(Math.random()*2 + 1);
                    if (themself == 1) {
                        int suicide2 = (int)(Math.random()*rounds + 1);
                    }
                    int shooter = (int)(Math.random()*players + 1);
                    
                    if (shooter == 1) {
                        System.out.println("They decided to shoot you!");
                            int shoot = (int)(Math.random()*rounds + 1);
                            if (shoot <= bullets) {
                                bullets = bullets - 1;
                                System.out.println("Get fucked");
                                return true;
                            } else {
                                blanks = blanks - 1;
                                System.out.println("It was a blank! There are " + bullets + " bullets, " + blanks + " blanks, and " + bullets + " opponents left!");
                            }
                    } else {
                        System.out.println("They decided to shoot someone else!");
                        int shoot = (int)(Math.random()*2 + 1);
                            if (shoot <= bullets) {
                                bullets = bullets - 1;
                                System.out.println("It was a real bullet! There are " + bullets + " bullets, " + blanks + " blanks, and " + bullets + " oppenents left!");
                            } else {
                                blanks = blanks - 1;
                                System.out.println("It was a blank! There are " + bullets + " bullets, " + blanks + " blanks, and " + bullets + " opponents left!");
                        }
                    }
                }
            }
            if (bullets == 0) {
                return false;
            }
        }
    }
}