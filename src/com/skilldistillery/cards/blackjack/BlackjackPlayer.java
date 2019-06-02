package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class BlackjackPlayer implements PlayBlackjack {

	BlackjackHand playerHand = new BlackjackHand();
	Card card;

	public BlackjackPlayer() {
	}

	public BlackjackHand getPlayerHand() {
		return playerHand;
	}

	public void setPlayerHand(BlackjackHand playerHand) {
		this.playerHand = playerHand;
	}

	public void checkTheHand(BlackjackHand playerhand) {

	}

	public void hitMe(BlackjackHand playerhand) {

	}

	public void startAHand(BlackjackHand playerhand) {

	}

}
