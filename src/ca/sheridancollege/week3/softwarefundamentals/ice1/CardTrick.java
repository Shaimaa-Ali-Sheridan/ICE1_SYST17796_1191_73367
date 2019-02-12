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
 * @modifier Ajay Desai
 * @StudentNo 991515463
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Scanner sc = new Scanner(System.in);
        
        Card luckyCard=new Card();
        luckyCard.setValue(1);
        luckyCard.setSuit("Spades");
        
        Card c = new Card();
        
        for (int i = 0; i < magicHand.length; i++) {
            c.setValue((int) (Math.random() * 13 + 1));
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = new Card();
            magicHand[i].setSuit(c.getSuit());
            magicHand[i].setValue(c.getValue());
        }
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter Suit (clubs, spades, diamonds, hearts)");
        c.setSuit(sc.nextLine());

        System.out.println("Enter Card Value (1-13)");
        c.setValue(sc.nextInt());

        // and search magicHand here
        for (int i = 0; i < magicHand.length; i++) {
            //System.out.println(magicHand[i].getValue() + magicHand[i].getSuit()); // display 7 cards
            if (magicHand[i].getValue() == c.getValue() && magicHand[i].getSuit().equalsIgnoreCase(c.getSuit())) {
                //Then report the result here
                System.out.println("Card Found");
                break;
            }
            if (i == magicHand.length - 1) {
                System.out.println("Not Found");
            }

        }

    }

}
