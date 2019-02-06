/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier Anmol Nagpal 
 * 991154162
 */

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
        
            int randomNum =  1 + (int)((Math.random()) * 13);
            c.setValue(randomNum);
            int randomSuit = (int)((Math.random()) * 4);
            c.setSuit(Card.SUITS[randomSuit]);
            magicHand[i] = c;
        }
        
        Card luckyCard = new Card();
        luckyCard.setSuit("Hearts");
        luckyCard.setValue(5);
        int val = luckyCard.getValue();
        String suit = luckyCard.getSuit();
 
        boolean found = false;
        for(int i=0; i < magicHand.length; i++){
            if(magicHand[i].getValue() == val && 
                    magicHand[i].getSuit().equals(suit)){
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
