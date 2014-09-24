package blackjack;

import org.junit.Test;

import static blackjack.BlackjackPlayerState.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BlackjackPlayerStateTest {

    @Test
    public void shouldBust() throws Exception {
        //given

        //when

        //then
        assertThat(BlackjackPlayerState.getState(22), is(BUST));
    }

    @Test
    public void shouldHit() throws Exception {
        //given

        //when

        //then
        assertThat(BlackjackPlayerState.getState(16), is(HIT));
        assertThat(BlackjackPlayerState.getState(10), is(HIT));
        assertThat(BlackjackPlayerState.getState(0), is(HIT));

    }

    @Test
    public void shouldStick() throws Exception {
        //given

        //when

        //then
        assertThat(BlackjackPlayerState.getState(17), is(STICK));
        assertThat(BlackjackPlayerState.getState(20), is(STICK));

    }

    @Test
    public void shouldWin() throws Exception {
        //given

        //when

        //then
        assertThat(BlackjackPlayerState.getState(21), is(WIN));

    }
}