package chess;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: sameer
 * Date: 17/12/2011
 * Time: 18:06
 * To change this template use File | Settings | File Templates.
 */
public interface Piece {

    public static final int ROWS=8;

    public static final int COLUMNS=8;

    public void move(PieceMove legalMove,int positions);

    public boolean isLegalMove(PieceMove move);
    
    public Set<PieceMove> getLegalMoves();

    public boolean isAlive();

    public boolean die();
}
