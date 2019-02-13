/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import static ca.sheridancollege.week3.softwarefundamentals.ice1.Card.SUITS;
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
            c.setValue((int)(Math.random() * 12 + 1));
            c.setSuit(SUITS[(int)(Math.random() * 3)]);
            magicHand[i] = c;
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        //insert code to ask the user for Card value and suit, create their 
        //*----------------Editing from Github------------Added lucky card object------------*
        Card luckyCard = new Card();
        luckyCard.setSuit("Diamonds");
        luckyCard.setValue(5);
        boolean matchFound = false;
      
        // and search magicHand here
        for (int i=0; i<magicHand.length; i++){
            if(magicHand[i].equals(luckyCard)){
              matchFound = true;  
            }
        }
        //Then report the result here
        if(matchFound == true) System.out.println("You win! Your Card is in Magic Hand!");
        else System.out.println("You Lose, Your card is not in magic hand");
    }
    
    
}
