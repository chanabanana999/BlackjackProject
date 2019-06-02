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
		handValue = 0;
		// add up the cards in the hand
		for (Card card : getHand()) {
			handValue += card.getValue();
		}
		return handValue;
	}

	@Override
	public void addCard(Card card) {
		super.addCard(card);
	}

	@Override
	public void clearHand() {
		super.clearHand();
	}

	@Override
	public List<Card> getCards() {
		return super.getCards();
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public void showOneCard() {
		String showCard = getCards().get(1).toString();
		System.out.println(showCard);
	}

	public void showAllCards() {
		int length = getHand().size();
		for (int index = 0; index < length; index++) {
			String showCard = getCards().get(index).toString();
			System.out.print(showCard);
		}
	}

	public void setHandValue(int handValue) {
		this.handValue = handValue;
	}

}
