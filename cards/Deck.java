package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import static cards.Rank.*;
import static cards.Suite.*;

public class Deck {

    private List<Card> cards;

    public Deck() {
        cards=new ArrayList<Card>();
        for(Suite suite:Suite.values()){
            for(Rank rank:Rank.values()){
                cards.add(new Card(suite,rank));
            }
        }
    }

    private Deck shuffle(){
        Collections.shuffle(cards);
        return this;
    }

    public void deal(int numberOfPlayers, int numberOfCards){
        if(numberOfPlayers*numberOfCards >cards.size()){
            throw new IllegalArgumentException("Number of cards required to be delivered can't be more than "+cards.size());
        }
        this.shuffle();

        List<CardPlayer> cardPlayers = new ArrayList<CardPlayer>(numberOfPlayers);
        for(int i=0;i<numberOfPlayers;i++){

            List<Card> hand = new ArrayList<Card>(this.cards.subList(cards.size()-numberOfCards,cards.size()));

            cards.removeAll(hand);
            CardPlayer player = new CardPlayer(hand);
            System.out.println(player.show());
            cardPlayers.add(player);
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    public static void main(String[] args){
        Deck deck = new Deck();
        deck.deal(4,5);
    }

}
