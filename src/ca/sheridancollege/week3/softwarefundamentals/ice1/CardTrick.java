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
 * @modifier Deep Navadiya
 * @StudentNo 991550374
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Card luckyCard=new Card();
        luckyCard.setSuit("hearts");
        luckyCard.setValue(1);
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) ((Math.random() * 12) + 1));
            c.setSuit(Card.SUITS[(int) (Math.random() * 3)]);
            magicHand[i] = c;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick any Card(Hearts, Diamonds, Spades, Clubs): ");
        String string = scanner.next();
        System.out.println("Pick any value(1-13): ");
        int value = scanner.nextInt();
        boolean cardFound = false;
        int index = 0;
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == luckyCard.getValue() && magicHand[i].getSuit().equalsIgnoreCase(luckyCard.getSuit())){
                cardFound = true;
                index = i;
                break;
            }
        }

        if (cardFound == true) {
            System.out.println("congratulations! You Won.");
        } else {
            System.out.println("opps! You Lost.");
        }
    }

}
