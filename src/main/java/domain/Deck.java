package domain;

import java.util.Stack;

public class Deck {
    Stack<Card> cards;

    public Deck() {
        cards = new Stack<>();
        initCards();
    }

    private void initCards() {
        for (Suit suit : Suit.values()) {
            pushCards(suit);
        }
    }

    private void pushCards(final Suit suit) {
        for (Rank rank : Rank.values()) {
            cards.push(new Card(suit, rank));
        }
    }

    public Card popCard() {
        return cards.pop();
    }
}
