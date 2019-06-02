package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Deck;

public class BlackjackDealer implements PlayBlackjack {

	Deck deck;

	BlackjackHand dealerHand = new BlackjackHand();

	public BlackjackDealer() {
		deck = new Deck();
		deck.shuffleDeck();
	}

	public void startDealerHand(BlackjackHand dealerHand) {
		dealerHand.clearHand();
		for (int index = 0; index <= 1; index++) {
			dealerHand.addCard(deck.dealCards());
		}
		System.out.print("Dealer's hand:");
		checkTheHand(dealerHand);
		System.out.println("\t[face down card]");
	}

	public boolean startPlayerHand(BlackjackHand playerHand) {

		playerHand.clearHand();
		boolean play = true;
		for (int index = 0; index <= 1; index++) {
			playerHand.addCard(deck.dealCards());
		}
		System.out.print("Player's hand:");
		playerHand.showAllCards();
		int handValue = playerHand.getHandValue();
		System.out.println("\n\tHand value = " + handValue);
		if (handValue == 21) {
			play = false;
			System.out.println("Blackjack! Let's see what the dealer has....");
			return play;
		}
		return play;

	}

	// show one card
	@Override
	public void checkTheHand(BlackjackHand dealerHand) {
		dealerHand.showOneCard();
	}

	public boolean dealerTurn() {
		// nothing happens until player is complete
		int handValue = 0;
		boolean play = true;
		System.out.println("\nDealer's cards:");
		dealerHand.showAllCards();
		int dealerHandValue = dealerHand.getHandValue();
		System.out.println("\n\tHand value = " + dealerHandValue);
		if (dealerHand.getHandValue() == 21) {
			System.out.println("\tDealer has blackjack! Dealer wins!");
			play = false;
		}
		while (dealerHandValue < 17) {
			dealerHand.addCard(deck.dealCards());
			dealerHandValue = dealerHand.getHandValue();
			System.out.println("------------------------");
			System.out.println("Dealer takes a card.....");
			dealerHand.showAllCards();
			System.out.println("\n\tHand value = " + dealerHandValue);
		}
		if (dealerHandValue > 21) {
			System.out.println("\tDealer busts");
		} else if (dealerHandValue == 21) {
			System.out.println("\tDealer wins!");
		} else {
			System.out.println("\n\tDealer holds....");
		}
		return play;

	}

	public boolean playerHitMe(BlackjackHand playerHand) {
		boolean play = true;
		playerHand.getHandValue();
		playerHand.addCard(deck.dealCards());
		System.out.println("\nGiving you a card...");
		playerHand.showAllCards();
		playerHand.getHandValue();
		System.out.println("\n\tHand value = " + playerHand.getHandValue());
		if (playerHand.getHandValue() > 21) {
			play = false;
			System.out.println("\n\tDoh! You busted!");
			System.out.println("\tLet's see what the dealer has....");
			return play;
		} else if (playerHand.getHandValue() == 21) {
			play = false;
			System.out.println("\tBlackjack!");
			System.out.println("\tLet's see what the dealer has....");
			return play;
		} else {
			play = true;
		}
		return play;
	}

	public BlackjackHand getDealerHand() {
		return dealerHand;
	}

	@Override
	public void startAHand(BlackjackHand playerhand) {

	}

}
