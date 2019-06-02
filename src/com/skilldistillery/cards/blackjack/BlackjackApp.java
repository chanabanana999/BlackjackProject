package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class BlackjackApp {
	Scanner input = new Scanner(System.in);
	boolean play = true;
	BlackjackDealer dealer = new BlackjackDealer();
	BlackjackPlayer player = new BlackjackPlayer();

	public BlackjackApp() {
	}

	public void run() {
		intro();

		do {
			// The Game Begins....
			System.out.println("\n");
			System.out.println("******************************************");
			System.out.println("***************  NEW GAME  ***************");
			System.out.println("******************************************");
			System.out.println("\n");

			dealer.startDealerHand(dealer.getDealerHand());

			System.out.println("-------------------------");

			dealer.startPlayerHand(player.getPlayerHand());

		} while (menu(play));

	}

	public boolean intro() {
		// display the intro and rules on the screen
		System.out.println("Welcome to Blackjack!");
		System.out.println("(Please note that the casino and the dealer are not responsible for any losses");
		System.out.println("incurred by the player. The casino humbly suggests setting a limit on how much");
		System.out.println("you're willing to lose and also not to be greedy with winnings lest you become bitter");
		System.out.println("and sad.)");
		System.out.println("You must try to get the sum of the values of cards in your hand as close as possible");
		System.out.println("to 21 without going over, which would be called a \"BUST\". Aces are high in this game.");
		System.out.println("Whoever gets the highestvalue in their hand without going over 21 WINS!");
		System.out.print("\nAre you ready??? (Y or N) ");
		String yesOrNo = input.next();
		if (yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("Yes")) {
			play = true;
		} else {
			System.out.println("You can't lose (or win!) if you don't play. Thank you for considering it.");
			play = false;
			input.close();
			System.exit(0);
		}
		return play;
	}

	public boolean menu(boolean play) {
		int menuChoice = 1;
		while (play) {
			while (player.playerHand.getHandValue() < 21) {
				System.out.println("\nWhat would you like to do now?");
				System.out.println("\n1. Hit me! (that means take another card)");
				System.out.println("2. Hold (that means don't take another card)");
				System.out.print("Enter your choice: ");
				menuChoice = input.nextInt();
				System.out.println("\nYour hand value: " + player.playerHand.getHandValue());
				if (menuChoice == 1) {
					play = dealer.playerHitMe(player.getPlayerHand());
				} else {
					play = false;
					break;
				}
			}
			dealer.dealerTurn();
			compareHands();
			System.out.println("\nDo you want to play again? (Y or N) ");
			String choice = input.next();
			if (choice.equalsIgnoreCase("Y")) {
				return true;
			} else {
				System.out.println("Thank you for playing Blackjack. We hope you did not lose too much money!");
				input.close();
				System.exit(0);
				return false;
			}
		}
		return play;
	}

	public void compareHands() {
		if ((dealer.dealerHand.getHandValue() > player.playerHand.getHandValue())
				&& (dealer.dealerHand.getHandValue() < 21)) {
			System.out.println("\tDealer wins!");
		} else if ((dealer.dealerHand.getHandValue() == 21) && (player.playerHand.getHandValue() == 21)) {
			System.out.println("\tIt's a tie!!");
		} else if ((dealer.dealerHand.getHandValue() == 21) && (player.playerHand.getHandValue() < 21)) {
			System.out.println();
		} else if (dealer.dealerHand.getHandValue() == player.playerHand.getHandValue()) {
			System.out.println("\tIt's a tie!");
		} else if ((dealer.dealerHand.getHandValue() > 21) && (player.playerHand.getHandValue() > 21)) {
			System.out.println("\tIt's a tie!");
		} else if (player.playerHand.getHandValue() > 21) {
			System.out.println("\tDealer wins!");
		} else {
			System.out.println("\n\tYou win! (Quit while you're ahead.)");
		}

	}

}
