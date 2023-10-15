package finalProject;

import java.util.ArrayList;
import java.util.List;

public class Player  {             //Player class for getting their name and their own hand 
	
	
	List<Card> hand = new ArrayList<Card>();      //making a new list for each persons hand 
	int score = 0;                                //setting the score
	String playerName;                            //setting players name
	
	
	public Player() {}    //making an empty constructor to add to the main app
	public Player(String name, List<Card> hand, int score) {   
		
		this.playerName = name;
		this.hand = hand;
		this.score =score;
	}
	

	public List<Card> getHand() {   //my getters and setters
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public void draw(Deck deck) {         //this method will remove the first card from the deck and add it to the players hand
		this.hand.add(deck.draw());
	}
	
	public Card flipCard() {             //this will remove the top card from the players hand
		return this.hand.remove(0);
	}
	
	public void incrementScore() {      //method to keep track of the score
		score++;
	}
	public void describe() {          //to describe every card inside the hand array
		
		for (Card card : this.hand) {
			card.describe();
		}
	}
	
}
