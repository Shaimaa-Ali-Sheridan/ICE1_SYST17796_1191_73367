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
 * @modifier 
 * Name: Nitee Sharma
 * Student-Id: 991511406
 */

import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        // to ask user to eneter values
      //  Scanner inputs = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        // randomly pick the cards
        for (int i=0; i< magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)Math.floor(Math.random()*13)+1);
            c.setSuit(Card.SUITS[(int)Math.floor(Math.random()*3)]);
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
      //  System.out.println("Please pick a suite");
      //  int suit = inputs.nextInt();
        
     //   System.out.println("Please pick a card");
     //   int card = inputs.nextInt();
        
        // adding a hard-coded object
        Card luckyCard = new Card();
        
        // setting values for suite and card
        luckyCard.setSuit(luckyCard.SUITS[1]);
        String suit = luckyCard.getSuit();
        
        luckyCard.setValue(3);
        int card = luckyCard.getValue();
        
        boolean isValid = false;
        
        // and search magicHand here
        for(int i =0; i < magicHand.length;i++){
          /* if(suit >= 0 && suit <=  3){
              if(card >=1 && card <=13)
                System.out.println("suit:"+suit);
                System.out.println("card:"+ card);
            */
          if((magicHand[i].getValue() == card)
             &&(magicHand[i].getSuit().equals(suit))){
              
            isValid = true;
            }
           else{
                System.out.println("Invalid Card and Suite!");
            }
        }
    
        if(isValid){// if card is found then throw this
            System.out.println("Congradulations! You win that game.");
        //System.out.println("Card is: "+ card+"Suite is: "+Card.SUITS[suit]);
        }
        else
        {
            System.out.println("Sorry! You card is not found. Please try again.");
      //   System.out.println("Invalid!");
        }
        
    }
}
    
