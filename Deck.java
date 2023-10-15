package finalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {          //Making my deck of cards
	
	
	List<Card> cards = new ArrayList<Card>();   //This will make a list with the parameter of the card class 
	
	 Deck(){
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};                      //My suits and numbers for the card
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", 
							"Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for(String suit : suits) {           //This will add every number of a suit into the array cards which is the deck
			int count = 2;
			for(String number : numbers) {
				Card card = new Card(number, suit, count);
				this.cards.add(card);
				count++;
			}
		}
	}

	public List<Card> getCards() {       //list of getters and setters
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	public void descrbe() {              //will describe every card inside the cards array
		for (Card card : this.cards) {
			card.describe();
		}
	}
	
	public void shuffle() {              //this will randomize the list
		Collections.shuffle(this.cards);
	}
	
	public Card draw() {               //drawing will remove the top card which is in position 0
		Card card = cards.remove(0);
		return card;
	}

}
