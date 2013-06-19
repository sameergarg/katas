package tictactoe;

/**
 * The requirements on the flip-chart were the following:

 a game is over when all fields are taken
 a game is over when all fields in a column are taken by a player
 a game is over when all fields in a row are taken by a player
 a game is over when all fields in a diagonal are taken by a player
 a player can take a field if not already taken
 players take turns taking fields until the game is over
 */
public class TicTacToe {

    private Board board;

    public TicTacToe(int rows, int columns) {
        this.board = new Board(rows,columns);
    }


    public TicTacToe mark(int row, int column, Player player) {
        board.play(row, column, player);
        return this;
    }

    public boolean isOver() {
        return board.isOver();
    }

    public Player getWinner() {
        return board.getWinner();
    }
}
