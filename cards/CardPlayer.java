package cards;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 09/01/2013
 * Time: 14:32
 * To change this template use File | Settings | File Templates.
 */
public class CardPlayer {

    private List<Card> hand;

    public CardPlayer(List<Card> hand) {
        this.hand=hand;
    }

    public List<Card> getHand() {
        return hand;
    }

    public String show(){
        return hand.toString();
    }
}
