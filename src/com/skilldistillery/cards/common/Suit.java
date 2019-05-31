package com.skilldistillery.cards.common;

public enum Suit {
	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");
	
	final private String suit;
	
	Suit(String suit) {
		this.suit = suit;
	}
	@Override
	public String toString() {
		return suit;
	}
	
	public String getName() {
		return suit;
	}
}
