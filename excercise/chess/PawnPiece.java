package chess;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: sameer
 * Date: 17/12/2011
 * Time: 18:11
 * To change this template use File | Settings | File Templates.
 */
public class PawnPiece implements Piece {

    Position position;

    boolean alive=true;

    public void move(PieceMove legalMove, int positions) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public Set<PieceMove> getLegalMoves() {
        return new HashSet<PieceMove> (Arrays.asList(new PieceMove[]{PieceMove.DIAGONAL_LEFT_DOWN, PieceMove.DIAGONAL_RIGHT_DOWN}));
    }

    public boolean isLegalMove(PieceMove move) {
        return Arrays.asList(PieceMove.values()).contains(move);
    }

    public boolean isAlive() {
        return alive;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean die(){
        alive=false;
        return alive;
    }
}

