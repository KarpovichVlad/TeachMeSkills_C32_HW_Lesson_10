package com.teachmeskills_c32_hw_lesson_10.model;

import java.util.Objects;

public class Card {

    private String cardNumber;
    private double balance;
    private String cvv;

    public Card(String cardNumber, double balance, String cvv) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(cardNumber, card.cardNumber) && Objects.equals(cvv, card.cvv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, cvv);
    }
}

