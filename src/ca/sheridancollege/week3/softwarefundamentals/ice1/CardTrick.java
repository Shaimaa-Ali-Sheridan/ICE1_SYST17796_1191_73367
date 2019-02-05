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
 * @modifier JESWIN K JESSOR
 * 991498429
 */

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
      
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int randomNumber = 1 + (int)((Math.random()) * 13 + 1);
            c.setValue(randomNumber);
            int randomSuit = (int) ((Math.random()) * 3 + 1);
            c.setSuit(Card.SUITS[randomSuit]);
            magicHand[i] = c;
                    
            
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
        for(int j=0; j<100; j++)
        {
        Scanner k = new Scanner(System.in);
        System.out.println("pick the suit (Hearts, Diamonds, Spades, Clubs)");
        String suit = k.next();
        System.out.println("Pick the value (1 to 13)");
        int val = k.nextInt();
        
         boolean found = false;
        for(int i=0; i<magicHand.length; i++)
        {
            if(magicHand[i].getValue() == val &&
                    magicHand[i].getSuit().equals(suit))
            {
                found =true;
            }
                
        }
        
        if(found == true)
        {
            System.out.println("card found");
        }
        else
        {
            System.out.println("Card not found");
        }
        
        }
        
    }
    
    
}
