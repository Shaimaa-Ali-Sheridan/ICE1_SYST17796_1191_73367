
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Arrays;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * 
 * @Author Tim Donald-Davis
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        Scanner k = new Scanner(System.in);
        Card[] magicHand = new Card[7];     
        
        card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Hearts");
        
      
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            magicHand[i] = c;
            c.setValue((int)(Math.random()*13 +1));
            c.setSuit(Card.SUITS[(int)(Math.random()* 4)]);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        int userCard = 0;
        String UserSuit = "";
        System.out.print("Pick a card value (1-13) : ");
          userCard = k.nextInt();
          k.nextLine();
          System.out.print("Pick a suit: ");
          UserSuit = k.nextLine().trim();
        
          int cardFound = 0;
          String SuitFound = "";
          
         
             
         for (int i = 0; i < magicHand.length; i++){
          
          if (magicHand[i].getValue() == userCard && UserSuit.equalsIgnoreCase(magicHand[i].getSuit())){ 
              System.out.println("WINNER! Card was found");
              break;
        
          }
           
         }
      
}


          
          
    
    
    


           
    }
