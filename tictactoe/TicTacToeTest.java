package tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import static tictactoe.Player.O;
import static tictactoe.Player.X;

/**
 *
 */
public class TicTacToeTest {

    private TicTacToe ticTacToe;
    private int rows;
    private int column;

    @Before
    public void setUp() throws Exception {
        rows = 3;
        column = 3;
        ticTacToe = new TicTacToe(rows, column);
    }

    @Test
    public void gameShouldBeOverWhenAllFieldsAreTaken(){
        //given

        //when
        ticTacToe.mark(0, 0, X).mark(0, 1, O).mark(0, 2, O)
                .mark(1, 0, O).mark(1, 1, X).mark(1, 2, X)
                .mark(2, 0, X).mark(2, 1, O).mark(2, 2, O);
        //then
        assertThat(ticTacToe.isOver(), is(true));
    }

    @Test
    public void a_game_is_over_when_all_fields_in_first_column_are_taken_by_a_player() {
        ticTacToe.mark(0, 0, X).mark(1, 0, X).mark(2, 0, X);
        //then
        assertThat(ticTacToe.isOver(), is(true));
        assertThat(ticTacToe.getWinner(), is(X));
    }

    @Test
    public void a_game_is_over_when_all_fields_in_second_column_are_taken_by_a_player() {
        ticTacToe.mark(0, 1, X).mark(1, 1, X).mark(2, 1, X);
        //then
        assertThat(ticTacToe.isOver(), is(true));
        assertThat(ticTacToe.getWinner(), is(X));
    }


    @Test
    public void a_game_is_over_when_all_fields_in_third_column_are_taken_by_a_player() {
        ticTacToe.mark(0, 2, O).mark(1, 2, O).mark(2, 2, O);
        //then
        assertThat(ticTacToe.isOver(), is(true));
        assertThat(ticTacToe.getWinner(), is(O));
    }

    @Test
    public void a_game_is_over_when_all_fields_in_a_row_one_are_taken_by_a_player() {
        ticTacToe.mark(0, 0, O).mark(0, 1, O).mark(0, 2, O);
        //then
        assertThat(ticTacToe.isOver(), is(true));
        assertThat(ticTacToe.getWinner(), is(O));
    }
    @Test
    public void a_game_is_over_when_all_fields_in_a_row_two_are_taken_by_a_player() {
        ticTacToe.mark(1, 0, O).mark(1, 1, O).mark(1, 2, O);
        //then
        assertThat(ticTacToe.isOver(), is(true));
        assertThat(ticTacToe.getWinner(), is(O));
    }

    @Test
    public void a_game_is_over_when_all_fields_in_a_row_three_are_taken_by_a_player() {
        ticTacToe.mark(2, 0, O).mark(2, 1, O).mark(2, 2, O);
        //then
        assertThat(ticTacToe.isOver(), is(true));
        assertThat(ticTacToe.getWinner(), is(O));
    }

    @Test
    public void a_game_is_over_when_all_fields_in_a_diagonal_one_are_taken_by_a_player() {
        ticTacToe.mark(0, 0, O).mark(1, 1, O).mark(2, 2, O);
        //then
        assertThat(ticTacToe.isOver(), is(true));
        assertThat(ticTacToe.getWinner(), is(O));

    }

    @Test
    public void a_game_is_over_when_all_fields_in_a_diagonal_two_are_taken_by_a_player() {
        ticTacToe.mark(0, 2, O).mark(1, 1, O).mark(2, 0, O);
        //then
        assertThat(ticTacToe.isOver(), is(true));
        assertThat(ticTacToe.getWinner(), is(O));

    }

    @Test(expected = IllegalStateException.class)
    public void a_player_can_take_a_field_if_not_already_taken() {
        //given
        ticTacToe.mark(1, 1, O);
        //when
        ticTacToe.mark(1, 1, X);
    }

    @Test(expected = IllegalAccessError.class)
    public void cannotPlayAnyFurtherOnceGameIsOver() throws Exception {
        //given

        //when
        ticTacToe.mark(0, 0, X).mark(0, 1, X).mark(0, 2, X).mark(1, 0, X).mark(1, 1, X).mark(1, 2, X).mark(2, 0, X).mark(2, 1, X).mark(2, 2, X);
        assertThat(ticTacToe.isOver(), is(true));

        //then
        ticTacToe.mark(0,0,X);
    }
}
