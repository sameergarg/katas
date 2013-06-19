package tictactoe;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 27/12/2012
 * Time: 13:31
 * To change this template use File | Settings | File Templates.
 */
public class BoardTest {

    @Test
    public void initialiseBoard() throws Exception {
        Board board = new Board(3,3);
        assertThat(board, is(notNullValue()));
        assertThat(board.getRows(), is(3));
        assertThat(board.getColumns(), is(3));
    }
}
