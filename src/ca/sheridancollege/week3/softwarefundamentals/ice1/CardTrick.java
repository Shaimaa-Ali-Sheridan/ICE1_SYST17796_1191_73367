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
 * @modifier chris korolyk feb 5
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        int counter = 0;
        Card[] magicHand = new Card[1];
        
        for (int i=0; i<magicHand.length; i++)
        {
            int rngNum = ((int)(Math.floor(Math.random() *13)+1));
            String rngSuit = Card.SUITS[(((int)(Math.floor(Math.random() *4))))];
            
            //System.out.print(rngNum);
            //System.out.println(rngSuit);
    //magicHand[i] =  new Card(rngNum, rngSuit);
    magicHand[i] = new Card(1,"Hearts");
            //c.setValue(insert call to random number generator here)
        //      c.setValue((int) (Math.random() * (12)) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        //      c.setSuit(Card.SUITS[ (int) (Math.random() * 3)]);
        //      magicHand[i] = c;
        }
        
        
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner sc = new Scanner(System.in);
        System.out.println("Create your own card!");
        System.out.print("Enter your card value: 1 (ace) - 13 (king): ");
        int cardV = sc.nextInt();
        
        System.out.print("Enter your card suit: (Hearts, Diamonds, Spades, Clubs): ");
        String cardS = sc.next();
        
        Card user = new Card (cardV, cardS);
        //user.setValue(cardC);
        //user.setSuit(cardS);
                
        // and search magicHand here
        
        //Then report the result here
        for (int i=0; i<magicHand.length; i++){
            if (user.equals(magicHand[i]) == true) counter++;
            else counter = counter;
        }
        if (counter > 0) System.out.println("Your card matched!");
        if (counter == 0) System.out.println("Your card did not match, better luck next time!");
        
        System.out.println("The Magic Hand");
        for (int i=0; i<magicHand.length; i++){
            System.out.println(magicHand[i]);
        }
        
        System.out.println(user);
        System.out.println(magicHand[0]);
        
    }
    
    
}
