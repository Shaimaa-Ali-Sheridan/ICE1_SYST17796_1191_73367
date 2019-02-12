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
 * @modifier Samandeep Singh Student Number - 991500155
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue();
            c.setSuit();
            magicHand[i] = c;
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter your guess card!");
        System.out.println("Enter Card's Number and Suit separated by tab or space");
        int cNum = input.nextInt();
        String cSuit = input.nextLine();
        boolean matchFound = false;
      
        // and search magicHand here
        for (int i=0; i<magicHand.length; i++){
            if(magicHand[i].getSuit().equalsIgnoreCase(cSuit) && magicHand[i].getValue() == cNum){
              matchFound = true;  
            }
        }
        //Then report the result here
        if(matchFound == true) System.out.println("Your Card is in Magic Hand!");
        else System.out.println("Your card is not in magic hand");
    }
    
    
}
