package cards;

import java.security.AccessControlException;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 09/01/2013
 * Time: 14:09
 * To change this template use File | Settings | File Templates.
 */
public enum Rank {
    ACE(1),TWO(2),THREE(3),FOUR(4),FIVE(5),SIX(6),SEVEN(7),EIGHT(8),NINE(9),TEN(10),JACK(11),QUEEN(12),KING(13);

    private int points;

    Rank(int points) {
        this.points=points;
    }

    public int getPoints() {
        return points;
    }
}
