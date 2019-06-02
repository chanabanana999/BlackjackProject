package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	private List<Card> hand = new ArrayList<>();

	public Hand() {
	}

	public int getHandValue() {
		return 0;
	}

	public void addCard(Card card) {
		// take another card
		getHand().add(card);
	}

	public void clearHand() {
//		get rid of all the cards
		getHand().clear();
	}

	public List<Card> getCards() {
		return getHand();
	}

	public String toString() {
//		make a StringBuilder
		StringBuilder handString = new StringBuilder();
		for (Card card : getHand()) {
			handString.append(card.toString());
//			System.out.println(handString.toString());
		}
		return handString.toString();
	}

	public List<Card> getHand() {
		return hand;
	}

}
