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
 * @author modifier junior ntongwe, february 5 2019, 991493305
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner clientInput = new Scanner(System.in);
        int numCheck = 0;
        int suitCheck = 0;
        
        for (int i=0; i<magicHand.length; i++)
        {
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
       //     Card c = new Card();
            magicHand[i] = new Card();
            int trackNum = (int)(Math.random() * 13) + 1;
            magicHand[i].setValue(trackNum);
            int trackSuitNum = (int)(Math.random() * 3);
            magicHand[i].setSuit(Card.SUITS[trackSuitNum]);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        System.out.println("Pick A Number");
        System.out.println("Enter A Card Suit: (Diamond, Spades, Hearts, Clubs)");
        String suit = clientInput.nextLine();
        System.out.println("Enter A Card Value: (1-13)");
        int clientValue = clientInput.nextInt(); 
        
        for (int i = 0; i <magicHand.length; i++) {
            
            if (clientValue == magicHand[i].getValue() && suit.equals(magicHand[i].getSuit())) { 
                numCheck = 1;
                suitCheck = 1;
                break;
            }
        }
    
    
        if (numCheck == 1 && suitCheck ==1)
            System.out.println("You WIN"); 
            else 
            System.out.println("You LOST");
    
}
}