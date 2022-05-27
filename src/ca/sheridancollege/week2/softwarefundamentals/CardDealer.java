/*
 * Author: Eric Muir ID 991684132
 * Date: 5/27/2022 3:21pm
 * Desc: ICE1
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        
        // First comments 3:07PM
        Card aceSpades = new Card("Eric Muir", 1);
        System.out.printf("%s, %d %n", aceSpades.getSuit(), aceSpades.getValue());
    }
}
