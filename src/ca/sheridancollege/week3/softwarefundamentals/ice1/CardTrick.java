/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier Anmol Nagpal 
 * 991154162
 */

import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int randomNum =  1 + (int)((Math.random()) * 13);
            c.setValue(randomNum);
            int randomSuit = (int)((Math.random()) * 3 + 1);
            c.setSuit(Card.SUITS[randomSuit]);
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        Scanner k = new Scanner(System.in);
        System.out.println("Pick the suit (Hearts, Diamonds, Spades, Clubs): ");
        String suit = k.next();
        System.out.println("Pick the value (1-13)");
        int val = k.nextInt();
        
        boolean found = false;
        for(int i=0; i < magicHand.length; i++){
            if(magicHand[i].getValue() == val && magicHand[i].getSuit() == suit){
                found = true;
            }
        }
        if(found == true){
            System.out.println("Card found");
        }else{
            System.out.println("Card not found");
        }
        
        
    }
    
    
}
