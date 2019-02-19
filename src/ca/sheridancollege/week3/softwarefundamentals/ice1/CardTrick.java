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
 * @modifier Aman Jasani
 * @ Student no: 991516032
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        Card one = new Card();
        one.setValue(1);
        one.setSuit("Hearts");
        boolean match = false;
        int select = 0;

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) ((Math.random() * 12) + 1));
            c.setSuit(Card.SUITS[(int) (Math.random() * 3)]);
            magicHand[i] = c;
        }

        System.out.println("Enter the card value : ");
        int value = sc.nextInt();
        System.out.println("Enetr Suit : ");
        String suits = sc.next();

        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == one.getValue()) {
                match = true;
                select = i;
                break;
            }
        }

        if (match == true) {
            System.out.println("" + magicHand[select].getValue() + magicHand[select].getSuit());
        } else {
            System.out.println("Card doesn't match !!!");
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
}
