import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	    UnoCard x = new UnoCard();
	    
	    x.getFace();
	    x.canPlace();
	    
	    ArrayList<String> arr = new ArrayList<String>();
        int win;
        Scanner input;
        UnoCard topCard; 
        int choiceIndex;
        String currentColor; 
        while (true)
        {
            deck.clear();
            compdeck.clear();
            win = 0;
            topCard = new UnoCard();
            currentColor = topCard.color;

            System.out.println("Welcome to Uno! Initialising decks...");
            draw(7, playerdeck);
            draw(7, compdeck);

            for (boolean playersTurn = true; win == 0; playersTurn ^= true)
            {
                choiceIndex = 0;
                System.out.println("\nThe top card is: " + topCard.getFace());

                if (playersTurn) 
                {
                    System.out.println("Your turn! Your choices:");              
                    for (int i = 0; i < playerdeck.size(); i++)
                    {
                        System.out.print(String.valueOf(i + 1) + ". " + 
                        ((UnoCard) playerdeck.get(i) ).getFace());
                    }
                    System.out.println(String.valueOf(playerdeck.size() + 1 ) + ". " + "Draw card" + "\n" + 
                                       String.valueOf(playerdeck.size() + 2) + ". " + "Quit");
                    
                    {
                        System.out.print("\nPlaease input the number of your choice: ");
                        input = new Scanner(System.in);
                    } 
                    while (!input.hasNextInt() );

                    choiceIndex = input.nextInt() - 1;

                    if (choiceIndex == playerdeck.size() )
                        draw(1, playerdeck);
                    else if (choiceIndex == playerdeck.size() + 1)
                        break gameLoop;
                    else if ( ((UnoCard) playerdeck.get(choiceIndex)).canPlace(topCard, currentColor) )
                    {
                        topCard = (UnoCard) playerdeck.get(choiceIndex);
                        playerdeck.remove(choiceIndex);
                        currentColor = topCard.color;
                        if (topCard.value >= 10)
                        {
                            playersTurn = false; 
                            switch (topCard.value)
                            {
                                case 12: 
                                System.out.println("Drawing 2 cards...");
                                draw(2,compdeck);
                                break;

                                case 13: case 14: 
                                {
                                    System.out.print("\nEnter the color you want: ");
                                    input = new Scanner(System.in);
                                } while (!input.hasNext("R..|r..|G....|g....|B...|b...|Y.....|y.....") ); 
                                if (input.hasNext("R..|r..") )
                                    currentColor = "Red";
                                else if (input.hasNext("G....|g....") )
                                    currentColor = "Green";
                                else if (input.hasNext("B...|b...") )
                                    currentColor = "Blue";
                                else if (input.hasNext("Y.....|y.....") )
                                    currentColor = "Yellow";

                                System.out.println("You chose " + currentColor);
                                if (topCard.value == 14) 
                                {
                                    System.out.println("Drawing 4 cards...");
                                    draw(4,compdeck);
                                }
                                break;
                            }
                        }
                    } else 
                    System.out.println("Invalid choice. Turn skipped.");


                } 
                else 
                {
                    System.out.println("My turn! I have " + String.valueOf(compdeck.size() ) 
                                        + " cards left!" + ((compdeck.size() == 1) ? "...Uno!":"") );
                    for (choiceIndex = 0; choiceIndex < compdeck.size(); choiceIndex++)
                    {
                        if ( ((UnoCard) compdeck.get(choiceIndex)).canPlace(topCard, currentColor) ) 
                            break; 
                    }

                    if (choiceIndex == compdeck.size() )
                    {
                         System.out.println("I've got nothing! Drawing cards...");
                         draw(1,compdeck);
                    } else 
                    {
                         topCard = (UnoCard) compdeck.get(choiceIndex);
                         compdeck.remove(choiceIndex);
                         currentColor = topCard.color;
                         System.out.println("I choose " + topCard.getFace() + " !");

                         // Must do as part of each turn because topCard can stay the same through a round
                         if (topCard.value >= 10)
                         {
                             playersTurn = true; // Skipping turn

                             switch (topCard.value)
                             {
                                 case 12: // Draw 2
                                 System.out.println("Drawing 2 cards for you...");
                                 draw(2,playerdeck);
                                 break;

                                 case 13: case 14: // Wild cards                         
                                 do // Picking a random color that's not none
                                 {
                                     currentColor = new UnoCard().color;
                                 } while (currentColor == "none");

                                 System.out.println("New color is " + currentColor);
                                 if (topCard.value == 14) 
                                 {
                                     System.out.println("Drawing 4 cards for you...");
                                     draw(4,deck);
                                 }
                                 break;
                             }
                         }
                    }

                    if (deck.size() == 0)
                        win = 1;
                    else if (compdeck.size() == 0)
                        win = -1;
                }

            } 

         
            if (win == 1)
                System.out.println("You win :)");
            else 
                System.out.println("You lose :(");

            System.out.print("\nPlay again? ");
            input = new Scanner(System.in);

            if (input.next().toLowerCase().contains("n") )
                break;
        } 

        System.out.println("Bye bye");
    }

}
