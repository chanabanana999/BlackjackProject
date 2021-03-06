package com.skilldistillery.cards.common;

public class Card {

	private Suit suit;
	private Rank rank;

	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public String toString() {
		StringBuilder card = new StringBuilder();
		card.append("\n\t");
		if ((rank == Rank.JACK) || (rank == Rank.QUEEN) || (rank == Rank.KING) || (rank == Rank.ACE)) {
			card.append(rank);
		} else {
			card.append(rank.getValue());
		}
		card.append(" of ");
		card.append(suit);
		return card.toString();
	}

	public int getValue() {
		return rank.getValue();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Card other = (Card) obj;
		if (rank != other.rank) {
			return false;
		}
		if (suit != other.suit) {
			return false;
		}
		return true;
	}
}
