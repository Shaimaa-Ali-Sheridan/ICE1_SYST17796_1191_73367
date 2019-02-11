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
 * Name: Dien Nguyen
 * Student ID: 991501600
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
                c.setValue((int)Math.floor(Math.random()*13)+1);
                c.setSuit(c.SUITS[(int)Math.floor(Math.random()*3)]);
                magicHand[i]=c;
            //c.setValue(insert call to random number generator here 1-13)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        System.out.println("Please pick a suit from(0 to 3)");
        int suit = s.nextInt();
        System.out.println("Please pick a card value from (1 to 13)");
        int card = s.nextInt();
        boolean isFound = false;
        
        for(int i=0; i<magicHand.length; i++){
            if(suit>=0 && suit <=3){
             if(card >= 1 && card <= 13)
                isFound =true;
            }
        }
        
        if(isFound)
            System.out.println("The card you picked is "+card+" "+Card.SUITS[suit]);
        else 
            System.out.println("Not found");
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
    
}
