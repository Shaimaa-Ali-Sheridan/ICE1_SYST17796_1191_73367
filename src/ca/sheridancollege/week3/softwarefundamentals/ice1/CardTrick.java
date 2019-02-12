package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @ Jonathan Sriskandarajah, Feb 08 2019
 */

import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (Math.random() * 14 * 1) - 1);
            c.setSuit(Card.SUITS[(int) (Math.random() * 3)]);
        }

        Scanner pick = new Scanner(System.in);
        System.out.println("What card value do you choose, (1 - 7)");
        int value = pick.nextInt();
        if (value < 1 && value > 7) {
            System.out.println("Pick a nubmer between 1 - 7");
        } else {
            System.out.println("Choose a suit Hearts, Diamonds, Spades, Clubs");
            String suit = pick.nextLine();
        }
       

        for(int sub = 0; sub < magicHand.length; sub++) 
            if (value == magicHand.length) 
            System.out.println("The Card Is Found At" + magicHand);
        else 
            System.out.println("The Card Is Not Found.");
        
         
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

}
