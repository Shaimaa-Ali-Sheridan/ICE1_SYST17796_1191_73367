/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @Author Tim Donald-Davis
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        Scanner k = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
      
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            c.setValue((int)(1+ Math.random()*12));
            c.setSuit(Card.SUITS[(int)(1 + Math.random()* 2)]);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        int userCard = 0;
        String UserSuit = "";
        System.out.println("Pick a card value: ");
          userCard = k.nextInt();
          
          System.out.println("Pick a suit: ");
          UserSuit = k.nextLine().trim();
          
          Arrays.sort(magicHand);
          
          
          
    }
    
    
}

