package com.skilldistillery.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck;
	
	public Deck() {
		deck = makeDeck();
	}
	private List<Card> makeDeck() {
		List<Card> deck = new ArrayList<>(52);
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				Card  newCard = new Card(suit, rank);
				deck.add(newCard);
			}
		}
		return deck;
	}
	
	public int checkDeckSize(){
		return deck.size;
	}
	
	public void dealCards() {
//		 removes cards from deck
	}
	
	public void shuffleDeck() {
		Collections.shuffle(deck);
	}

