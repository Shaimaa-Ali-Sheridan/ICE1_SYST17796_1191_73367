/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author dancye
 * @modifier Samandeep Singh Student Number - 991500155
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    /**
     * @return the suit
     */
    public String getSuit() {
        return this.suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String str) {   
        this.suit = str;
       
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int val) {  
        this.value = val;
    }
   
   public boolean equals(Object o){
       Card cd = (Card) o;
       if(this.getSuit() == cd.getSuit() && this.getValue() == cd.getValue()){
           return true;
       }
       else{
           return false;
       }
   }
    
}
