package pkg;
import java.util.Scanner;
import java.util.Random;

public class two extends Event {
      Scanner sc = new Scanner(System.in);
     
    
    public void Direc2(){
    if((direction.equals("down")||direction.equals("Down"))){
        System.out.println("You are at [[0],[1]]");
        System.out.println("Omg there is literally nothing here. Just teez");
        System.out.println("");
        ////////////////////////////////3
        ///////////////////////////////
        ///////////////////////////////////
        
        System.out.println("Whats the next move?  [FORWARD] [DOWN] [DIAGONAL]");
        String direction4 = sc.nextLine();
        ;
        if((direction4.equals("down")||direction4.equals("Down"))){
            System.out.println("Boss fight lets go! PRESS [ENTER] TO START!");
            System.out.println("You prolly will die but here we go,");
            System.out.println("You can: [physical] [THROW A PICE OF CHICKEN] OR [FLATTER HIM] type in all lowercase");
            System.out.println(""); 
            System.out.println("If yu want to throw a pice of chicken at hm type in r");
            String az = sc.nextLine();
        
        if((az.equals("r")||az.equals("r"))){
            System.out.println("THe boss has fallen since he's allergi to chicken");
            System.out.println("Good job, good job.");
        }
        if((az.equals("physical"))){
            while(true){
                System.out.println("You yeeted your weapon at his leg and it bounces back");
                System.out.println("Rip");
                break;
            }
        }
        if(az.equals("flatter")){
            System.out.print("You killed it with your flattery");
            System.out.print("Heres a buff cat for your keepings");
            System.out.println("       /\\_/\\");
            System.out.println("      / 0 0 \\  ");
            System.out.println("     (    *  )");
            System.out.println("      \\~()()~/  ");
            System.out.println("       //()() \\\\");
        }
        //
        System.out.println("what is youre next move? Forward, down diagonal?");
        //
        }
        //
        
        
       
        //
        if((direction4.equals("Forward")|| direction4.equals("forward"))){
            System.out.println("You are at [[1],[2]]");
            System.out.println("You got an apple");
            System.out.println("");
            System.out.println("Whats the next move?  [FORWARD] [DOWN] [DIAGONAL]");
            String direction9 = sc.nextLine();
            if((direction9.equals("Forward")||(direction9.equals("forward")))){
                System.out.println("You got chest! Click [ENTER] TO OPEN!");
                String t = sc.nextLine();
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
        }
         if((direction9.equals("Down")||(direction9.equals("down")))){
              if((direction4.equals("Diagonal")||(direction4.equals("diagonal")))){
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
        ////////////////////////////////////////////
        /////////finish this tus is mini fight /////////////////////////
        ///////////
      
        }
        
        
        
        }
        System.out.println("[Forward] [Down] or [Diagonal]");
        String i = sc.nextLine();
      
        if((i.equals("Forward"))||(i.equals("forward"))){
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
        if((i.equals("Down")||(i.equals("down")))){
            System.out.println("you found a princess");
            System.out.println("You can leave her be or kidnap her");
            System.out.println("");
            System.out.println("Type in [Leave] or [Kidnap]");
            String ong = sc.nextLine();
            if((ong.equals("Leave")||(ong.equals("leave")))){
                System.out.println("Good choice.. great choice.");
            }
            if((ong.equals("Kidnap")||(ong.equals("kidnap")))){
                System.out.println("You are about to kidnap her,");
                System.out.println("but...");
                System.out.println("You notie theres something wrong..");
                System.out.println("Its not even a human...");
                System.out.println("Press Enter to see what happens");
                String enter = sc.nextLine();
                System.out.println("Its a demon spawn and you need to fight to the death.");
                System.out.println("Or.. you can bolt and speed run");
                System.out.println("Type Fight or Bolt");
                String dol = sc.nextLine();
                if((dol.equals("Bolt")||dol.equals("Bolt"))){
                    System.out.println("She caught you goodbye:)");
                }
                if((dol.equals("Fight")||(dol.equals("fight")))){
                    System.out.println("WEllP SHe runs");
                }
            }
        }
        
        }
        
        
    
      
}
}
}