package blackjack;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PlayerTest {

    private Player player;

    @Before
    public void setUp() throws Exception {
        player = new Player("John");
    }

    @Test
    public void shouldPickCard() throws Exception {
        //given

        //when
        Card card = new Card(Suite.CLUB, BlackjackRank.ACE);

        player.pickCard(card);

        //then
        assertThat(player.hand().size(), is(1));
        assertThat(player.hand().get(0), is(card));
    }

    @Test
    public void shouldTotalPlayerHand() throws Exception {
        //given
        Card clubAce = new Card(Suite.CLUB, BlackjackRank.ACE);
        Card diamondEight = new Card(Suite.DIAMOND, BlackjackRank.EIGHT);

        //when
        player.pickCard(clubAce);
        player.pickCard(diamondEight);

        //then
        assertThat(player.total(), is(19));
    }
}