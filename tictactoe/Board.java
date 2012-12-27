package tictactoe;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 27/12/2012
 * Time: 11:24
 * To change this template use File | Settings | File Templates.
 */
public class Board {

    private Integer rows;

    private Integer columns;

    private Player[][] positions = {{null,null,null},{null,null,null},{null,null,null}};

    private Player winner;

    private boolean over;

    public Board(int rows, int columns) {
        this.rows=rows;
        this.columns=columns;
    }

    public Integer getRows() {
        return rows;
    }

    public Integer getColumns() {
        return columns;
    }

    public boolean isOver() {
        return over;
    }

    public Player getWinner() {
        return winner;
    }

    public void play(int row, int column, Player player) {
        if(this.over){
            throw new IllegalAccessError("Game Over");
        }

        if(positions[row][column]!=null){
            throw new IllegalStateException("Position at row "+row+" and column "+column+" is already occupied");
        }

        positions[row][column]=player;


        if(winInColumn1()
            || winInColumn2()
            || winInColumn3()
            || winInRow1()
            || winInRow2()
            || winInRow3()
            || winInDiagonal1()
            ||winInDiagonal2()){
            over=true;
            winner = player;
            return;
        }

        checkForBoardFilled();

    }

    private void checkForBoardFilled() {
        for(int row=0;row<rows;row++){
            for (int column=0;column<columns;column++){
                if(positions[row][column]==null){
                    over=false;
                    return;
                }
            }
        }
        over = true;
    }

    private boolean winInColumn3() {
        return positions[0][2]!=null && positions[0][2]== positions[1][2] && positions[1][2]==positions[2][2];
    }

    private boolean winInColumn2() {
        return positions[0][1]!=null && positions[0][1]== positions[1][1] && positions[1][1]==positions[2][1];
    }

    private boolean winInColumn1() {
        return positions[0][0]!=null && positions[0][0]== positions[1][0] && positions[1][0]==positions[2][0];
    }

    private boolean winInRow1() {
        return positions[0][0]!=null && positions[0][0]== positions[0][1] && positions[0][1]==positions[0][2];
    }

    private boolean winInRow2() {
        return positions[1][0]!=null && positions[1][0]== positions[1][1] && positions[1][1]==positions[1][2];
    }

    private boolean winInRow3() {
        return positions[2][0]!=null && positions[2][0]== positions[2][1] && positions[2][1]==positions[2][2];
    }

    private boolean winInDiagonal1() {
        return positions[0][0]!=null && positions[0][0]== positions[1][1] && positions[1][1]==positions[2][2];
    }

    private boolean winInDiagonal2() {
        return positions[0][2]!=null && positions[0][2]== positions[1][1] && positions[1][1]==positions[2][0];
    }

}
