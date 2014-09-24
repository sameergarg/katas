package blackjack;

public class Card {
    private Suite suite;

    private BlackjackRank rank;

    public Card(Suite suite, BlackjackRank blackjackRank) {
        this.suite = suite;
        this.rank = blackjackRank;
    }

    public Suite getSuite() {
        return suite;
    }

    public BlackjackRank getRank() {
        return rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;

        Card card = (Card) o;

        if (rank != card.rank) return false;
        if (suite != null ? !suite.equals(card.suite) : card.suite != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = suite != null ? suite.hashCode() : 0;
        result = 31 * result + (rank != null ? rank.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Card");
        sb.append("{suite=").append(suite);
        sb.append(", rank=").append(rank);
        sb.append('}');
        return sb.toString();
    }
}
