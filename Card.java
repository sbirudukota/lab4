/*Sravani Birudukota
 Programming fundamentals
 Summer
 Programming Assignment lab 2
Exercise #3
*/
import java.util.Random;

public class Card {

	String suit, facevalue;  

	public Card(String suits, String faceValues) {
		suit = suits;
		facevalue = faceValues;
	}

	public String toString() {  
		return "Card{" + "suit='" + suit + "' " + ", faceValue=" + facevalue + '}';
	}

	public static void main(String[] args) {

		String[] suits = { "spades", "hearts", "diamonds", "clubs" };
		String[] faceValues = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		Random rand = new Random();
		for (int i = 1; i <= 5; i++) {
			Card c = new Card(suits[rand.nextInt(suits.length)], faceValues[rand.nextInt(faceValues.length)]);
			System.out.println(c);
		}
	}
}