package finalProject;

public class Card {    //To create my card class 

		String name;   //Setting the values for the cards
		String suit;
		int value;
		
		Card(String name, String suit, int value){     //The parameters of the card class
			this.name = name; 
			this.suit = suit;
			this.value = value;
		}

		public String getName() {       //my getters and setters 
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSuit() {
			return suit;
		}

		public void setSuit(String suit) {
			this.suit = suit;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
		
		public void describe() {           //describe method to output the card
			System.out.println(this.name + " of " + this.suit + " -- " + this.value);
		}
	
	
}
