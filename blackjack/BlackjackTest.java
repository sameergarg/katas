package blackjack;

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static blackjack.BlackjackRank.*;
import static blackjack.Suite.*;
import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BlackjackTest {

    private Blackjack blackjack;

    @Before
    public void setUp() throws Exception {
        blackjack = new Blackjack();
    }

    @Test
    public void shouldDealCardsToPlayers() throws Exception {
        //given


        //when
        blackjack.deal();

        //then
        assertThat(blackjack.players().size(), is(3));
        for(Player player: blackjack.players()) {
            assertThat(player.hand().size(), is(2));
        }
    }

    @Test
    public void shouldWinWhenTotalIs21() throws Exception {
        //given
        Card aceOfClub = new Card(CLUB, ACE);
        Card tenOfHeart = new Card(HEART, TEN);

        //when
        Player player1 = new Player("1");
        player1.pickCard(aceOfClub);
        player1.pickCard(tenOfHeart);

        Player player2 = new Player("2");

        Player player3 = new Player("3");

        Player winner = blackjack.playTillWin(asList(player1, player2, player3), new Deck());

        //then
        assertThat(winner, is(player1));

    }

    @Test
    public void shouldWinClosestTo21WhenAllStick() throws Exception {
        //given

        Player player1 = new Player("1").pickCard(new Card(CLUB, ACE)).pickCard(new Card(HEART, SEVEN));
        Player player2 = new Player("2").pickCard(new Card(DIAMOND, ACE)).pickCard(new Card(HEART, EIGHT));
        Player player3 = new Player("3").pickCard(new Card(SPADE, ACE)).pickCard(new Card(HEART, NINE));


        //when
        Player winner = blackjack.playTillWin(asList(player1, player2, player3), new Deck());

        //then
        assertThat(winner, is(player3));
    }

    @Test
    public void shouldWinClosestTo21WhenGameOverAndNoOneHits21() throws Exception {
        //given

        Player player1 = new Player("1").pickCard(new Card(CLUB, ACE)).pickCard(new Card(HEART, SEVEN));
        Player player2 = new Player("2").pickCard(new Card(DIAMOND, ACE)).pickCard(new Card(HEART, EIGHT));
        Player player3 = new Player("3").pickCard(new Card(SPADE, ACE)).pickCard(new Card(HEART, TWO));


        //when
        Player winner = blackjack.playTillWin(asList(player1, player2, player3), new Deck(new Stack<Card>()));

        //then
        assertThat(winner, is(player2));
    }

    @Test
    public void shouldDeclareWinnerWhenSolePlayerIsLeft() throws Exception {
        //given
        Player player1 = new Player("1").pickCard(new Card(CLUB, ACE)).pickCard(new Card(HEART, SEVEN));

        //when
        Player winner = blackjack.playTillWin(asList(player1), new Deck());

        //then
        assertThat(winner, is(player1));

    }

}