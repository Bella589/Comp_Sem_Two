package pkg;
import java.util.Scanner;
import java.util.Random;

public class one extends Event{
    
    public void Direc1(){
        
     if((direction.equals("forward"))||(direction.equals("Forward"))){ 
            System.out.println("You are at [[0],[1]]");
            System.out.println("You steped into a fire pit");
            System.out.println("RIP you die");
            
            System.out.println("Click [ENTER]");
            String lol = sc.nextLine();
            
            System.out.println("Just kidding, lol...");
            System.out.println("You survied it cause you're awesome.");
            System.out.println("");
            
            System.out.println("Whats the next move? [FORWARD] [DOWN] [DIAGONAL]");
            String direction2 = sc.nextLine();
            
        /// rute 1 pt 2///
        if((direction2.equals("diagonal")||(direction2.equals("Diagonal")))){
            System.out.println("You got chest! Click [ENTER] TO OPEN!");
            String w = sc.nextLine();
            System.out.println("You get to choose one of the following:");
            
            System.out.println("Gold, beef, book");
            String chose = sc.nextLine();
        
        
        if((chose.equals("gold"))||(chose.equals("Gold"))){
            int[] gold = new int[5];
            for (int i = 4; i < gold.length; i++) {
            gold[i] = rand.nextInt(); 
            System.out.println("You recived " + i + " pices of gold.");
        }
        if((chose.equals("beef")||(chose.equals("Beef")))){
            System.out.println("You chose beef, this can give you 5-10 pts for HP");
            System.out.println("You can't use it if you have full hp.");
        }
        if((chose.equals("book")||(chose.equals("Book")))){
            System.out.println("You have  knowledge!!");
            System.out.println("Remember to use this if needed, it has a special power.");
        }
        }
        }
        if((direction2.equals("Down")||direction2.equals("down"))){
            System.out.println("U recivd le apple");
            System.out.println("Whats the next move? [FORWARD] [DOWN] [DIAGONAL]");
            String a = sc.nextLine();
        
        
        
        if((a.equals("Down")||(a.equals("down")))){
            System.out.println("Mini fight with blood sucking leamurs");
            System.out.println("");
            
            System.out.println("You can: [physical] [THROW A PICE OF CHICKEN] OR [FLATTER HIM] ");
            System.out.println("Pleasae type in lowercase, for chicken, type in 'chicken");
            String f = sc.nextLine();
            if((f.equals("chicken"))){
            System.out.println("They let you pass");
        }
        
        if((f.equals("flatter"))){
            System.out.print("You killed all the lemurs with your flattery");
            System.out.print("Heres a buff cat for your keepings");
            System.out.println("       /\\_/\\");
            System.out.println("      / 0 0 \\  ");
            System.out.println("     (    *  )");
            System.out.println("      \\~()()~/  ");
            System.out.println("       //()() \\\\");
        }
        if((f.equals("physical"))){
            System.out.println("You kicked a lemur across the feild. You anger them");
            System.out.println("");
            System.out.println("彡໒(⊙ᴗ⊙)७彡");
            System.out.println("");
            
            System.out.println("A lemur bites ur leg.");
            System.out.println("You either A) shakt it off or B) use a flame thrower in ur pocket (Please use A or B)");
            String p = sc.nextLine();
        
        if((p.equals("a"))||(p.equals("A"))){
            System.out.println("You poor traveler...");
            System.out.println("The lemur has held on for deer life and used a mini pitch fork to kill you");
            System.out.print("GAME OVER");
        }
        if((p.equals("b")||(p.equals("B")))){
            System.out.print("Good job traveler, you burnt them to a crispy critter, would you like to convert them to chicken for HP? Y (yes) or N(No) " );
            String conv = sc.nextLine();
        
        if((conv.equals("Y"))||(conv.equals("y"))){
            System.out.println("Your hp is " + hp +2 + ".");
        }
        if((conv.equals("N")||(conv.equals("n")))){
            System.out.println("OH WELLLL ");
        }
        }
            }
            System.out.println("[FORWARD] [DOWN] OR [DIAGONAL]");
            String ans = sc.nextLine();
        if((ans.equals("Forward"))||(ans.equals("forward"))){
            System.out.println("Chose your drink, both are red wine. which do you want? LEFT| RIGHT");
            String wine = sc.nextLine();
            
        if((wine.equals("Left")||(wine.equals("left")))){
            System.out.println("ur done. your doneeeeeee");
            System.out.println("Please rerun the game ;)");
        }
        if((wine.equals("Right")||(wine.equals("right")))){
           System.out.println("You survie th poisin");
        }
        }
        }
        }
        if((direction2.equals("forward"))||(direction2.equals("Forward"))){ 
            System.out.print("MINI FIGHTTTTTTTTTT");
            System.out.print("Press [ENTER] twice");
            String chose1 = sc.nextLine();
            String t = sc.nextLine();
            
            System.out.println("You have to fight 9.3 gembins");
            System.out.println("Press [ENTER to start.]");
            String enter = sc.nextLine();
            System.out.println("Which attack are you going to use? [FLATTER] [DODGE] [PHYSICAL] (PLEASE TYPE IN ALL LOWER CASE)");
            String atck = sc.nextLine();
            
        if((atck.equals("flatter"))){
            System.out.println("You killed all the gremblins with your flattery");
            System.out.println("Heres a buff cat for your keepings");
            System.out.println("");
            System.out.println("       /\\_/\\");
            System.out.println("      / 0 0 \\  ");
            System.out.println("     (    *  )");
            System.out.println("      \\~()()~/  ");
            System.out.println("       //()() \\\\");
        }
        if((atck.equals("physical"))){
            System.out.println("You kicked a gremblin across the feild. You anger them");
            System.out.println("");
            System.out.println("彡໒(⊙ᴗ⊙)७彡");
            System.out.println("");
            System.out.println("A Gremblin bites ur leg");
            System.out.println("You either A) shakt it off or B) use a flame thrower in ur pocket (Please use A or B)");
            String p = sc.nextLine();
            
        if((p.equals("a"))||(p.equals("A"))){
            System.out.println("You poor traveler...");
            System.out.println("The gremblin has held on for deer life and used a mini pitch fork to kill you");
            System.out.print("GAME OVER");
        }
        if((p.equals("b")||(p.equals("B")))){
            System.out.print("Good job traveler, you burnt them to a crispy critter, would you like to convert them to chicken for HP? Y (yes) or N(No) " );
            String conv = sc.nextLine();
        
        if((conv.equals("Y"))||(conv.equals("y"))){
          System.out.println("Your hp is " + hp +2 + ".");
        }
        if((conv.equals("N")||(conv.equals("n")))){
          System.out.println("OH WELLLL ");
        }
        }
        }
        if((atck.equals("dodge"))){
            System.out.println("You doged a gemblin's poisin arrow, he looks angry...");
            System.out.println("⁀⊙෴☉⁀");
            
            System.out.println("What will be your next attack? [FLATTER] {PHYSCICAL] (YOU CANNOT DOGE AGAIN)");
            String atck1 = sc.nextLine();
            
            if((atck1.equals("flatter"))){
                System.out.print("You killed all the gremblins with your flattery");
                System.out.print("Heres a buff cat for your keepings");
                System.out.println("       /\\_/\\");
                System.out.println("      / 0 0 \\  ");
                System.out.println("     (    *  )");
                System.out.println("      \\~()()~/  ");
                System.out.println("       //()() \\\\");
            }
            if((atck1.equals("physical"))){
                System.out.println("You kicked a gremblin across the feild. You anger them");
                System.out.println("");
                System.out.println("彡໒(⊙ᴗ⊙)७彡");
                System.out.println("");
                
                System.out.println("A Gremblin bites ur leg");
                System.out.println("You either A) shakt it off or B) use a flame thrower in ur pocket (Please use A or B)");
                String p = sc.nextLine();
            
            if((p.equals("a"))||(p.equals("A"))){
                System.out.println("You poor traveler...");
                System.out.println("The gremblin has held on for deer life and used a mini pitch fork to kill you");
                System.out.print("GAME OVER");
            }
            if((p.equals("b")||(p.equals("B")))){
                System.out.print("Good job traveler, you burnt them to a crispy critter, would you like to convert them to chicken for HP? Y (yes) or N(No) " );
                String conv = sc.nextLine();
            
            if((conv.equals("Y"))||(conv.equals("y"))){
                System.out.println("Your hp is " + hp +2 + ".");
            }
            if((conv.equals("N")||(conv.equals("n")))){
                System.out.println("OH WELLLL ");
            }
            }
            }
        }
            System.out.print("Do you want to g Forward, Diagonal, or Down?");
            String e = sc.nextLine();
        if((e.equals("Down")||(e.equals("Down")))){
            System.out.println("You got chest! Click [ENTER] TO OPEN!");
            String w = sc.nextLine();
            System.out.println("You get to choose one of the following:");
            
            System.out.println("Gold, beef, book");
            String chose = sc.nextLine();
            
        
        if((chose.equals("gold"))||(chose.equals("Gold"))){
            int[] gold = new int[5];
            for (int i = 4; i < gold.length; i++) {
            gold[i] = rand.nextInt(); 
            System.out.println("You recived " + i + " pices of gold.");
        }
        if((chose.equals("beef")||(chose.equals("Beef")))){
            System.out.println("You chose beef, this can give you 5-10 pts for HP");
            System.out.println("You can't use it if you have full hp.");
        }
        if((chose.equals("book")||(chose.equals("Book")))){
            System.out.println("You have  knowledge!!");
            System.out.println("Remember to use this if needed, it has a special power.");
        }
        }
        
        }
        System.out.println("What is your next move? [FOWARD][DIAGONAL][DOWN]");
        String direction6 = sc.nextLine();
        
        if((direction6.equals("down"))||direction6.equals("down")){
            System.out.println("Chose your drink, both are red wine. which do you want? LEFT| RIGHT");
            String wine = sc.nextLine();
            
        if((wine.equals("Left")||(wine.equals("left")))){
            System.out.println("ur done. your doneeeeeee");
            System.out.println("Please rerun the game ;)");
            
        }
        
        if((wine.equals("Right")||(wine.equals("right")))){
            System.out.println("U shall live");
        }
        }
        
        
        
        
        if((direction6.equals("down")||(direction6.equals("Down")))){
            System.out.println("Mini fight with blood sucking leamurs");                
            System.out.println("");
            System.out.println("You can: [physical] Or [FLATTER HIM] ");
            System.out.println("Pleasae type in lowercase, for chicken, type in 'chicken");
            
        String f = sc.nextLine();
        if((f.equals("chicken"))){
        System.out.println("They let you pass");
        }
        
        if((f.equals("flatter"))){
            System.out.print("You killed all the lemurs with your flattery");
            System.out.print("Heres a buff cat for your keepings");
            System.out.println("       /\\_/\\");
            System.out.println("      / 0 0 \\  ");
            System.out.println("     (    *  )");
            System.out.println("      \\~()()~/  ");
            System.out.println("       //()() \\\\");
            }
            if((f.equals("physical"))){
                System.out.println("You kicked a lemur across the feild. You anger them");
                System.out.println("");
                System.out.println("彡໒(⊙ᴗ⊙)७彡");
                System.out.println("");
                
                System.out.println("A lemur bites ur leg.");
                System.out.println("You either A) shakt it off or B) use a flame thrower in ur pocket (Please use A or B)");
                String p = sc.nextLine();
            
            if((p.equals("a"))||(p.equals("A"))){
                System.out.println("You poor traveler...");
                System.out.println("The lemur has held on for deer life and used a mini pitch fork to kill you");
                System.out.print("GAME OVER");
            }
            if((p.equals("b")||(p.equals("B")))){
                System.out.print("Good job traveler, you burnt them to a crispy critter, would you like to convert them to chicken for HP? Y (yes) or N(No) " );
                String conv = sc.nextLine();
            
            if((conv.equals("Y"))||(conv.equals("y"))){
                 System.out.println("Your hp is " + hp +2 + ".");
            }
            if((conv.equals("N")||(conv.equals("n")))){
                  System.out.println("OH WELLLL ");
            }
            }
            }
            System.out.println("Whats the next move? [FORWARD] [DOWN] [DIAGONAL]");
            String direction3 = sc.nextLine();
            
            if((direction3.equals("down")||direction3.equals("Down"))){
                System.out.println("You got chest! Click [ENTER] TO OPEN!");
                String r = sc.nextLine();
                System.out.println("You get to choose one of the following:");
                System.out.println("Gold, beef, book");
                String chose = sc.nextLine();
            if((chose.equals("gold"))||(chose.equals("Gold"))){
                int[] gold = new int[5];
                for (int i = 4; i < gold.length; i++) {
                gold[i] = rand.nextInt(); 
                System.out.println("You recived " + i + " pices of gold.");
            }
            
            }
            
            if((chose.equals("beef")||(chose.equals("Beef")))){
                System.out.println("You chose beef, this can give you 5-10 pts for HP");
                System.out.println("You can't use it if you have full hp.");
            }
            if((chose.equals("book")||(chose.equals("Book")))){
                System.out.println("You have  knowledge!!");
                System.out.println("Remember to use this if needed, it has a special power.");
            }
            }
            
        }  
        }

    }
    
    
}
}
