package cards;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 09/01/2013
 * Time: 14:08
 * To change this template use File | Settings | File Templates.
 */
public class Card {

    private Suite suite;

    private Rank rank;

    public Card(Suite suite, Rank rank) {
        this.suite = suite;
        this.rank = rank;
    }

    public Suite getSuite() {
        return suite;
    }

    public Rank getRank() {
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
