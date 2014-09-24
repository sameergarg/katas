package blackjack;

import java.util.ArrayList;
import java.util.List;

public final class Player {

    private String name;

    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    public String name() {
        return name;
    }

    public List<Card> hand() {
        return hand;
    }

    public Player pickCard(Card card) {
        hand.add(card);
        return this;
    }

    public int total() {
        int total = 0;

        for(Card card: hand) {
            total += card.getRank().getValue();
        }

        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;

        Player player = (Player) o;

        if (name != null ? !name.equals(player.name) : player.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", total='" + total() + '\'' +

                '}';
    }
}
