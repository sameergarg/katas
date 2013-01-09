package cards;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 09/01/2013
 * Time: 14:08
 * To change this template use File | Settings | File Templates.
 */
public enum Suite {

    SPADE("black"), HEART("red"), DIAMOND("red"), CLUB("black");

    private String colour;

    private Suite(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
