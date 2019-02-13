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
 * @modifier Jonathan Thamilselvan Sriskandarajah, Feb 08 2019 991531114
 */

public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (Math.random() * 14) - 1);
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = c;
        }

        Card t = new Card();
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Choose a Value Between (1 - 13)");
        int value = inputValue.nextInt();
        t.setValue(value);
        while (value < 0 || value > 13) {
            System.out.println("Enter a Value Between (1 - 13)");
            value = inputValue.nextInt();
            t.setValue(value);
        }
        Scanner inputSuit = new Scanner(System.in);
        System.out.println("Choose a Suit From: ( Hearts, Diamonds, Spades, Clubs )");
        String suit = inputSuit.nextLine();
        t.setSuit(suit);

        int find = t.getValue();

        boolean found = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == find && magicHand[i].getSuit().equals(suit)) {
                found = true;
            }
        }
        if (found == true) {
            System.out.println("Card Is Found!");
        } else {
            System.out.println("Card Is Not Found!");
        }
    }
}
