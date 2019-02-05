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
 * @author Gregory Tatel
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        Scanner k = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            magicHand[i] = c;
            c.setValue((int) (1+Math.random()*12));
            c.setSuit(Card.SUITS[(int)(Math.random()*3)]);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.print("Pick a card number(1-13):");
        int choice = k.nextInt();
        
        System.out.print("Pick a suit(hearts, spades, diamonds and clubs):");
        String suit = k.next();
       
        // and search magicHand here
        
        for(int i = 0; i<7; i++){
            System.out.println(i+" "+magicHand[i].getValue()+ " suit:" + magicHand[i].getSuit());
            
        }
        
        boolean cardFound = false;
        for (int i = 0; i<7; i++){
             if(choice == magicHand[i].getValue() && suit.equalsIgnoreCase(magicHand[i].getSuit())){
                 cardFound = true;
                 break;
             }
        }
        if(cardFound){
            System.out.println("Card Found");
        }else
            System.out.println("Not Found");
        
        //Then report the result here
    }
    
}

