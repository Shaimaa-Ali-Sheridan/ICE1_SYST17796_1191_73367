/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @modifire Breshna rahimzy Date: 2019/02/05
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        Card luckyCard = new Card();
        luckyCard.setSuit(Card.SUIT[1]);
        luckyCard.setValue(1);
        

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) Math.round(Math.random() * 12) + 1);
            c.setSuit(Card.SUITS[(int) Math.round(Math.random() * 3)]);

            magicHand[1] = c;

            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        System.out.println("Enter a card value: (1 to 13)");
        int value = k.nextInt();
        System.out.println("Enter a card suit: (0-3) ");
        int suit = k.nextInt();

        Card a = new Card();
        a.setValue(value);
        a.setSuit(Card.SUITS[suit]);
        boolean isFound = false;
        for (Card card : magicHand) {
            if (card.getSuit().equals(a.getSuit())
                 && card.getValue() == card.getValue()){
                isFound = true;
            }
            
                
    
        }
        System.out.println("your card " + (isFound? "has":" has not") + " been found in the magic hand");

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

}
