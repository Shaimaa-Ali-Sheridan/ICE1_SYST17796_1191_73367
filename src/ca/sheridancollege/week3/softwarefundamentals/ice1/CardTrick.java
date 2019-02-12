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
 * @modifier Harman Bath
 * Due Date: Feb 12th, 2019
 * 991540198
 */
import java.util.Scanner; 
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int sub=0; sub<magicHand.length; sub++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int randomNum = 1+(int)(Math.random()*13); 
            c.setValue(randomNum);
            int randomSuit = (int)(Math.random()*3 + 1); 
            c.setSuit(Card.SUITS[randomSuit]); 
            magicHand[sub] = c; 
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
        Card luckyCard = new Card(); 
        luckyCard.setSuit("Spades"); 
        luckyCard.setValue(10); 
        
        Scanner k = new Scanner(System.in); 
        System.out.println("Pick any suit (Hearts, Diamonds, Clubs, Spades): ");
        String suit = k.next(); 
        System.out.println("Pick the card number (1-13): ");
        int value = k.nextInt(); 
        
        int val = luckyCard.getValue();
        String psuit = luckyCard.getSuit(); 
        
        boolean found = false; 
        for(int sub = 0; sub < magicHand.length; sub++){
            if(magicHand[sub].getValue() == value && magicHand[sub].getSuit().equals(suit)){
                found = true; 
            }
        }
        
        if(found == true)
            System.out.println("Card Found");
        else
            System.out.println("Card not found"); 
                
        
    }
    
    
}
