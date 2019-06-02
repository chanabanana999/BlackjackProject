package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Deck;

public class BlackjackDriver {
	Deck bigdeck = new Deck();

	public static void main(String[] args) {
		BlackjackApp blackjack = new BlackjackApp();
		blackjack.run();
	}

	public BlackjackDriver() {
	}

}
