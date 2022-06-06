package pkg;
import java.util.Scanner;
import java.util.Random;

public class Ducks {
      Scanner sc = new Scanner(System.in);
    
    String name;
    String player_class;
    String Warrior;
    String Rogue;
    String Wizard;
    String warrior;
    String rogue;
    String wizard;
    String tresure;
    
    String Staff;
    String staff;
    
    String Catalyst;
    String catalyst;
    
    String Sword;
    String sword;
    
    String Bow_and_Arrow;
    String bow_and_arrow;
    
    String Dagger;
    String dagger;
    ////////////////////////////////////////////////////////////////////////////
    String chicken;
    String apple;
    String beans;
    String beef;
    String congee;
    ////////////////////////////////////////////////////////////////////////////
    
    String Boss;
    int Attack_Physical;
    int Attack_Magiacal;
    //////////////////////////////////////////////////////////////////////////// 
    
    String mini;
    int physical;
    int magical;
    ////////////////////////////////////////////////////////////////////////////
    
    
	 int experience;
     int level;
     int gold;
     int hp;
     int mp;
     int strength;
     int agility;
     int resilience;
     int deftness;
     int charm;
     int magical_mending;
     int magical_might;
    ///////////////////////////////////////////////////////////////////////////
    
	public Ducks() {
	}
	public Ducks(String name, String player_class) {
      
      int  experience = 0;
      int  level = 0;
   //    int gold = 0;
    }
    public void levelUp() {
         agility += level + 2;
        magical_might += level * 2;
        level += 1;
    }
 
    public boolean isDead() {
        return this.hp <= 0;
    }

    
    public int getLevel() {
        return this.level;
    }
  
    public void CharacterDevel(){
       
        System.out.println("What's your name Traveler?");
        String name = sc.nextLine();
        
        System.out.println("Which do you want to be? Wizard, Warrior, Rogue");
   String ans = sc.nextLine();
   /////////////////////////////////////////////////////////////////////////////
   /////////////////////////////////////////////////////////////////////////////
    
 if(ans.equals("Warrior")| (ans.equals("warrior"))) { 
          System.out.println("Congradulations, " + name + ", you chose warrior!");
           System.out.println("");
          System.out.println("");

            hp = 26;
            mp = 4;
            strength = 18;
            agility = 4;
    System.out.println("Your hp is " + hp);
    System.out.println("Your magic ability (mp) is " + mp);
    System.out.println("Your strength is " + strength);
    System.out.println("Your agility is "+ agility);
    System.out.println("");

    System.out.println("Now to build your character.");
    
    System.out.println("Which weapon do you want? Bow and arrow, Sword?");
    String weapon3 = sc.nextLine();
    
    if(weapon3.equals("Boss")|| weapon3.equals("bow_and_arrow")){
        System.out.println("You chose catalyst!");
    }
    if(weapon3.equals("Sword")|| weapon3.equals("sword")){
        System.out.println("You chose staff!");
    } 
 

}
///////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////

 if(ans.equals("Rogue")||(ans.equals("rogue"))) { 
     
         System.out.println("Congradulations, " + name + ", you Chose rouge");
         System.out.println("");
        //  System.out.println("You will go against Warrior.");
         System.out.println("");
            hp = 19;
            mp = 2;
            strength = 9;
            agility = 14;
    System.out.println("Your hp is " + hp);
    System.out.println("Your magic ability (mp) is " + mp);
    System.out.println("Your strength is " + strength);
    System.out.println("Your agility is "+ agility);
   System.out.println("");

    System.out.println("Now to build your character.");
    
    System.out.println("Which weapon do you want? Sword, Dagger?");
    String weapon3 = sc.nextLine();
    
    if(weapon3.equals("dagger")|| weapon3.equals("Dagger")){
        System.out.println("You chose catalyst!");
    }
    if(weapon3.equals("Sword")|| weapon3.equals("sword")){
        System.out.println("You chose sword!");
    }
    
    }

    
     
        
       /////////////////////////////////////////////////////////////////////////
       /////////////////////////////////////////////////////////////////////////
        
   if((ans.equals("Wizard"))||(ans.equals("wizard"))) { 
          System.out.println("Congradulations, " + name + ", ya chose Wizard");
            hp = 30;
            mp = 16;
            strength = 9;
            agility = 14;
            magical_might = 20;
        System.out.println("");
        
    System.out.println("Your hp is " + hp);
    System.out.println("Your magic ability (mp) is " + mp);
    System.out.println("Your strength is " + strength);
    System.out.println("Your agility is "+ agility);    
    System.out.println("Your magic might is " + magical_might);
    System.out.println("");
   

    System.out.println("Now to build your character.[PRESS ENTER]");
       String e = sc.nextLine();

    System.out.println("Which weapon do you want? Catalyst, Staff?");
    String weapon3 = sc.nextLine();
    
    if((weapon3.equals("Catalyst"))|| (weapon3.equals("catalyst"))){
        System.out.println("You chose catalyst!");
    }
    if((weapon3.equals("Staff"))|| (weapon3.equals("staff"))){
        System.out.println("You chose staff!");
    }
    
   
}

          
    }


}


