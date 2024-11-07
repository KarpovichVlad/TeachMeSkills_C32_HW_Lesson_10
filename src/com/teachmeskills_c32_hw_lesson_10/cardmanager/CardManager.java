package com.teachmeskills_c32_hw_lesson_10.cardmanager;

import com.teachmeskills_c32_hw_lesson_10.model.card.Card;

public class CardManager {

    private Card[] cards;
    private int cardCount;

    public CardManager(int maxCards) {
        this.cards = new Card[maxCards];
        this.cardCount = 0;
    }

    public void addCard(Card card) {
        if (cardCount < cards.length) {
            cards[cardCount] = card;
            cardCount++;
            System.out.println("Card added: " + card.getCardNumber());
        } else {
            System.out.println("Cannot add card: maximum card limit reached.");
        }
    }

    public void checkDuplicateCards() {
        if (cardCount == 0) {
            System.out.println("No cards to check.");
            return;
        } else if (cardCount == 1) {
            System.out.println("Only one card available, no duplicates possible.");
            return;
        }

        int countDuplicate = 0;

        for (int i = 0; i < cardCount; i++) {
            for (int j = i + 1; j < cardCount; j++) {
                System.out.println("Comparing card = " + cards[i] + " with card = " + cards[j]);

                if (cards[i].equals(cards[j])) {
                    System.out.println("Cards are equal.");
                    countDuplicate++;
                    System.out.println("Number of duplicates found so far = " + countDuplicate);
                } else {
                    System.out.println("Cards are not equal.");
                }
                System.out.println("---------------------");
            }
            System.out.println("==========================");
        }

        if (countDuplicate > 0) {
            System.out.println("Duplicate cards were found. Total duplicates = " + countDuplicate);
        } else {
            System.out.println("No duplicate cards found.");
        }
    }
}