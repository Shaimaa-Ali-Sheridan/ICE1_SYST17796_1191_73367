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
        Card [] magicHand = new Card[7];

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
        
        System.out.println("Type in your Suit Out of (Hearts, Diamonds, Spades, Clubs");
        Scanner k = new Scanner(System.in);
        String ks = k.nextLine();
        System.out.println("Type in a number out of 1 - 13");
        Scanner y = new Scanner(System.in);
        int ys = y.nextInt();
        
        

        Card luckyCard = new Card();
        luckyCard.setSuit(ks);
        luckyCard.setValue(ys);
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

       
    }

}
