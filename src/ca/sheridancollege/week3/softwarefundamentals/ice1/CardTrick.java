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
 * @modifier Anh Phan 991 489 221 Feb 5
 */
public class CardTrick {
    private static final Scanner s = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int) Math.round(Math.random()*12) + 1);
            c.setSuit(Card.SUITS[(int)Math.round(Math.random()*3)]);
            
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
        System.out.println("Enter a card\'s value: (1-13) ");
        int value = s.nextInt();
        System.out.println("Enter a card\'s suit: (0-3) ");
        int suit = s.nextInt();
        
        Card aCard = new Card();
        
        aCard.setValue(value);
        aCard.setSuit(Card.SUITS[suit]);
        boolean isFound = false;
        for(Card card : magicHand){
            if (card.getSuit().equals(aCard.getSuit()) && card.getValue() == card.getValue()){
                isFound = true;
            }
        }
        
        System.out.printf("Your card is %d of %s, and it has%sbeen found in the magic hand",
                aCard.getValue(), aCard.getSuit(), isFound?" ":" not ");
        
    }
    
    
}
