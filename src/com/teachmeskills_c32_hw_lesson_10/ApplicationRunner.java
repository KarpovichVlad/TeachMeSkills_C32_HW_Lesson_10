package com.teachmeskills_c32_hw_lesson_10;

import com.teachmeskills_c32_hw_lesson_10.model.client.Client;
import com.teachmeskills_c32_hw_lesson_10.model.card.Card;
import com.teachmeskills_c32_hw_lesson_10.cardmanager.CardManager;

public class ApplicationRunner {
    public static void main(String[] args) {

        Client client = new Client("Make", 30);
        System.out.println(client);

        CardManager cardManager = new CardManager(4);

        cardManager.addCard(new Card("2222-4444-8888", 1500, "456rty"));
        cardManager.addCard(new Card("1111-3333-5555", 1000, "123qwe"));
        cardManager.addCard(new Card("3333-7777-9999", 3000, "456rty"));
        cardManager.addCard(new Card("1111-3333-5555", 2000, "123qwe"));

        cardManager.checkDuplicateCards();

    }
}