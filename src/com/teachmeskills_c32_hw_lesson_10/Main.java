package com.teachmeskills_c32_hw_lesson_10;

import com.teachmeskills_c32_hw_lesson_10.model.Client;
import com.teachmeskills_c32_hw_lesson_10.model.Card;

public class Main {
    public static void main(String[] args) {

        Client client = new Client(4);

        client.addCard(new Card("1111-3333-5555", 2000, "123qwe"));
        client.addCard(new Card("2222-4444-8888", 1500, "456rty"));
        client.addCard(new Card("1111-3333-5555", 1000, "123qwe"));
        client.addCard(new Card("3333-7777-9999", 3000, "456rty"));

        client.checkDuplicateCards();

    }
}