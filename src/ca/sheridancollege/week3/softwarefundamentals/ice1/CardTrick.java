package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @modifier Zahra Arshad, 05/02/2019
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card();
        luckyCard.setValue(1);
        luckyCard.setSuit("hearts");

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) Math.round(Math.random() * 13) + 1); //random int btwn from 1 to 13
            c.setSuit(Card.SUITS[(int) Math.round(Math.random() * 3)]);

            magicHand[i] = c;
        }
        Card newCard = new Card();

        //7.Safely merge the code into your NetBeans project,
        //replacing the code that was asking the user to create a
        //card with your new (hard-coded) luckyCard Object. The code 
        //should now search the randomly generated array of 7 cards for
        //the hard-coded lucky card. If it is there, report a wining message
        //to the user. Otherwise, report a losing message.
        
        
        //insert code to ask the user for Card value and suit, create their card
//        Scanner s = new Scanner(System.in);
        //value form user
//        System.out.print("please enter a card value (Ace = 1, Jack -11, Queen =12, King = 13): \n--->");
//        newCard.setValue(s.nextInt());
        //suit from user
//        System.out.print("please enter a card suit (clubs = 1, hearts = 2, spades 3, diamonds = 4): \n--->");
//        newCard.setSuit(Card.SUITS[s.nextInt()]);



        // and search magicHand here
        boolean isFound = false;
        for (Card card : magicHand) {
            if (card.getSuit().equals(newCard.getSuit()) && card.getValue() == newCard.getValue()) {
                isFound = true;
            }
        }
        
             
        // compare luckyCard with magicHand
         for (Card card : magicHand) {
            if (card.getSuit().equals(luckyCard.getSuit()) && card.getValue() == luckyCard.getValue()) {
                isFound = true;
            }
        }
        //Then report the result here

        if (isFound == true) {
            System.out.println("user card found");
        } else {
            System.out.println("user card not found");
        }

    }

}
