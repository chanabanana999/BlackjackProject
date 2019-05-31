package com.skilldistillery.cards.blackjack;

import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackjackHand extends Hand {
	int handValue;

	public BlackjackHand() {
	}

	@Override
	public int getHandValue() {
		// add up the cards in the hand
		for (Card card : getHand()) {
			handValue += card.getValue();
		}
		return super.getHandValue();
	}

	@Override
	public void addCard(Card card) {
		// TODO Auto-generated method stub
		super.addCard(card);
	}

	@Override
	public void clearHand() {
		// TODO Auto-generated method stub
		super.clearHand();
	}

	@Override
	public List<Card> getCards() {
		// TODO Auto-generated method stub
		return super.getCards();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public void setHandValue(int handValue) {
		this.handValue = handValue;
	}

}
