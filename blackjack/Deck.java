package blackjack;

import java.util.Collections;
import java.util.Stack;

public final class Deck {

    private final Stack<Card> cards;

    public Deck(Stack<Card> cards) {
        this.cards = cards;
    }

    public Deck() {
        cards = init();
    }

    public Deck shuffle() {
        System.out.println("Shuffling deck for new deal");

        for(Card card : cards){
            int random = Double.valueOf(Math.random() * 51).intValue();
            Collections.swap(cards, random, 51-random);
        }

        //Collections.shuffle((List)cards.clone());
        return this;
    }

    public Stack<Card> getCards() {
        return cards;
    }

    private Stack<Card> init() {
        Stack<Card> cards = new Stack<Card>();

        for(Suite suite: Suite.values()){
            for(BlackjackRank blackjackRank : BlackjackRank.values()) {
                cards.push(new Card(suite, blackjackRank));
            }
        }
        return cards;
    }

    public Card take() {
        return cards.pop();
    }
}
