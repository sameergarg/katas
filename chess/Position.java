package chess;

/**
 * Created by IntelliJ IDEA.
 * User: sameer
 * Date: 17/12/2011
 * Time: 18:43
 * To change this template use File | Settings | File Templates.
 */
public class Position {
    private int x;

    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
