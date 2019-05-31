package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class BlackjackApp {
	Scanner input = new Scanner(System.in);
	boolean play = true;
	
	public BlackjackApp() {
		
	}
	public void launch() {
		intro();
//		have a menu
		menu(play);
		
//		Make a deck
		
//		Shuffle the deck
//		deal a hand
		BlackjackDealer dealer = new BlackjackDealer();
		BlackjackPlayer player = new BlackjackPlayer();
		
//		??? call the Blackjack app

		
	}

	public boolean intro() {
		//	display the intro and rules on the screen
		System.out.println("Welcome to Blackjack!");
		System.out.println("(Please note that the casino and the dealer are not responsible for any losses");
		System.out.println("incurred by the player. The casino humbly suggests setting a limit on how much");
		System.out.println("you're willing to lose and also not to be greedy with winnings lest you become bitter");
		System.out.println("and sad.)");
		System.out.println("You must try to get the sum of the values of cards in your hand as close as possible");
		System.out.println("to 21 without going over, which would be called a \"BUST\". Whoever gets the highest");
		System.out.println("value in their hand without going over 21 WINS!");
		System.out.println("\nAre you ready??? (Y or N) \n");
		String yesOrNo = input.next();
		if (yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("Yes")){ 
			play = true;
		}
		else {
			System.out.println("You can't lose (or win!) if you don't play. Thank you for considering it.");
			play = false;
			input.close();
			System.exit(0);
		}
		return play;
	}

	public int menu(boolean play) {
		int menuChoice = 1;
		while (play) {
			System.out.println("1. Hit me! (that means take another card)");
			System.out.println("2. Hold (that means don't take another card)");
			System.out.print("Enter your choice: ");
		}
		menuChoice = input.nextInt();
		if (menuChoice == 1) {
//		take some cards
			
		}
		else {
			
		}
		return menuChoice;
	}
	
	public void compareHands() {
		
	}
	
	public void evaluateHands() {
		
	}
}
