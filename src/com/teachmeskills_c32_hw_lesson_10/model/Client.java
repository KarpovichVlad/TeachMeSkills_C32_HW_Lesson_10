package com.teachmeskills_c32_hw_lesson_10.model;

public class Client {

    private Card[] cards;
    private int cardCount;

    public Client(int maxCards) {
        cards = new Card[maxCards];
        cardCount = 0;
    }

    public void addCard(Card card) {
        if (cardCount < cards.length) {
            cards[cardCount] = card;
            cardCount++;
        } else {
            System.out.println("Cannot add card: maximum card limit reached.");
        }
    }

    public void checkDuplicateCards() {
        if (cardCount == 0) {
            System.out.println("The client has no cards.");
            return;
        }

        boolean hasDuplicates = false;
        for (int i = 0; i < cardCount; i++) {
            for (int j = i + 1; j < cardCount; j++) {
                if (cards[i].equals(cards[j])) {
                    System.out.println("Duplicate cards found with number " + cards[i].getCardNumber() + " and CVV " + cards[i].getCvv());
                    hasDuplicates = true;
                    break;
                }
            }
            if (hasDuplicates) break;
        }

        if (!hasDuplicates) {
            System.out.println("The client has no duplicate cards.");
        }
    }
}








