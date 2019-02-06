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
 * @author Gregory Tatel
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            magicHand[i] = c;
            c.setValue((int) (1+Math.random()*12));
            c.setSuit(Card.SUITS[(int)(Math.random()*3)]);
        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit("hearts");
        
        boolean cardFound = false;
        
        for (int i = 0; i<7; i++){
             if(luckyCard.getValue() == magicHand[i].getValue() && luckyCard.getSuit().equalsIgnoreCase(magicHand[i].getSuit())){
                 cardFound = true;
                 break;
             }
        }
        if(cardFound){
            System.out.println("Card found. You Win.");
        }else
            System.out.println("Card not found. You lose");
        
        //Then report the result here
    }
    
}

