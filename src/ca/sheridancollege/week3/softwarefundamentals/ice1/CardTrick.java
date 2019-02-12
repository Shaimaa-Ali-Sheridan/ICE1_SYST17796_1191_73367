/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @modifier Harshit_Kohli, feb/05/2018
 */
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            int random = (int) (Math.random() * 13 + 1);
            c.setValue(random);
            int randoms = (int) (Math.random() * 4);
            c.setSuit(Card.SUITS[randoms]);
            magicHand[i] = c;

            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }

        Card luckyCard = new Card();
        luckyCard.setSuit("Hearts");
        luckyCard.setValue(5);
        int value = luckyCard.getValue();
        String s = luckyCard.getSuit();
 
        boolean found = false;
        for(int i=0; i < magicHand.length; i++){
            if(magicHand[i].getValue() == value && 
                    magicHand[i].getSuit().equals(s)){
                found = true;
            }
        }
        if(found == true){
            System.out.println("Card found. You Win!");
        }else{
            System.out.println("Card not found. You Lose");
        }      

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        //if (magicHand[sub].getValue() == userInput && magicHand[sub].getSuit() == userSuit)
    }

}
