package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<>(52);

	public Deck() {
		deck = makeDeck();
	}

	List<Card> makeDeck() {
		//	fills a deck with 52 cards
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				Card newCard = new Card(suit, rank);
				deck.add(newCard);
			}
		}
		return deck;
	}

	public int checkDeckSize() {
		//	sees how many cards are left in the deck;
		return deck.size();
	}

	public Card dealCards() {
		//	removes cards from deck
		return deck.remove(0);
	}

	public void shuffleDeck() {
		//	mixes up the cards
		Collections.shuffle(deck);
	}
}
