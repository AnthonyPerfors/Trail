package finalProject;

public class App {              //main app

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deck deck = new Deck();                                              //making a new deck from Deck class
		System.out.println("Here is the deck of cards" + "\n");            
		deck.descrbe();                                                      //showing the deck to the console 
		
		System.out.println("\n" + "We will now shuffle the cards!" + "\n");   
		deck.shuffle();                                                      //pulling the deck shuffle method and printing shuffled deck
		deck.descrbe();
		
		Player player1 = new Player(); // pulling in my Player class
		Player player2 = new Player();
		
		player1.setPlayerName("Player 1");   //Setting my players names 
		player2.setPlayerName("Player 2");
		
		for (int i = 0; i < 52; i++) {         //Giving each player 52(total cards) / 2(players) = 26 cards from the deck 
			if(i % 2 == 0) {
				player1.draw(deck);
			}else {
				player2.draw(deck);
			}
		}
		
		System.out.println("\n" + player1.getPlayerName() + " Has these cards! " + "\n");  //Showing each players hand
		player1.describe();  //help
		System.out.println("\n" + player2.getPlayerName() + " Has these cards! " + "\n");
		player2.describe();
		
		int round = 1;        //starting with round 1
		int draw = 0;         //to keep track of the draw count(s)
		for (int i = 0; i < 26; i++) {
			System.out.println("\n" + "Round " + round + " of 26");      //this will play 26 rounds 
			round++;
			Card cardPlayerOne = player1.flipCard();        //this is removing the first card in the players hand
			Card cardPlayerTwo = player2.flipCard();
			
			System.out.print(player1.getPlayerName() + " played ");   //showing to console what card the players just flipped
			cardPlayerOne.describe();
			System.out.print(player2.getPlayerName() + " played ");
			cardPlayerTwo.describe();
			
			if(cardPlayerOne.getValue() > cardPlayerTwo.getValue()) {   //adding score to which ever player wins the round and keeping track of the score
				player1.incrementScore();
				System.out.println("\n" + "Player 1 wins this round");
				System.out.println(player1.getPlayerName() + " has " + player1.getScore() + " points "+ player2.getPlayerName() + " has " + player2.getScore() + " point(s) ");
			}else if(cardPlayerOne.getValue() < cardPlayerTwo.getValue()) {
				player2.incrementScore();
				System.out.println("\n" + "Player 2 wins this round");
				System.out.println(player1.getPlayerName() + " has " + player1.getScore() + " points "+ player2.getPlayerName() + " has " + player2.getScore() + " point(s) ");
			}else {
				System.out.println("\n" + "It's a draw");
				draw++;
				System.out.println(player1.getPlayerName() + " has " + player1.getScore() + " points "+ player2.getPlayerName() + " has " + player2.getScore() + " point(s) ");
			}
			
		}
		
		System.out.println("\n" +"Final Score: " + player1.getPlayerName() + " had " + player1.getScore() + " points " +
						 player2.getPlayerName() + " had " + player2.getScore() + " points " + "with " + draw + " draw(s)");
		if(player1.getScore() > player2.getScore()) {
			System.out.println("\n" + player1.getPlayerName() + " wins!");       //this prints the final score of the game and declaring who won
		}else if(player1.getScore() < player2.getScore()){
			System.out.println( "\n" + player2.getPlayerName() + " wins!");
		}else {
			System.out.println("\n" + "The game was a draw!!");
		}
	}

}
