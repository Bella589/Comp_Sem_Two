package pkg;
import java.util.Scanner;
import java.util.Random;


public class UnoCard {
	 String color;
     int value;
     String face;
 //   ArrayList<Integer> arr = new ArrayList<Integer>();

    public void UnoCard() {
      Random rand = new Random();
    
        value = rand.nextInt(28); 
        if (value >= 14){
            value -= 14;
        rand = new Random();
         switch(rand.nextInt(4)){
        
            case 1: color = "Red"; 
                break;
            case 2: color = "Green"; 
                break;
            case 3: color = "Blue"; 
                break;
            case 4: color = "Yellow"; 
                break;
                
        }
        }

        if (value >= 13){
            color = "none";
    }
        }
    
//  public UnoCard(int cards, ArrayList<Integer> deck)
//     {
//         for (int i = 0; i < cards; i++)
//             deck.add(UnoCard);
//     }
    public String getFace(String a)
    {
        
        face = "[";
        if (color != "none")
        {
            face += this.color + " ";
        }

        switch(this.value)
        {
            default: face += String.valueOf(this.value); 
                break;
            case 10: face += "Skip"; 
                break;
            case 11: face += "Reverse"; 
                break;
            case 12: face += "Draw 2"; 
                break;
            case 13: face += "Wild"; 
                break;
            case 14: face += "Wild Draw 4"; 
                break;
        }
        face += "]";
        return face;
    }

    public boolean canPlace(UnoCard x, String y)
    {
        if (this.color == y)
            return true;
        else if (this.value == x.value)
            return true;
        else if (this.color == "none") 
            return true;
        return false;
    }

	    
	

}