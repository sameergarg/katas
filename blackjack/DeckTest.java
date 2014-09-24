package blackjack;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DeckTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void shouldShuffleTheDeck() {
        //given
        Deck deck = new Deck();

        //when
        Deck shuffledDeck = deck.shuffle();

        //then
        assertThat(shuffledDeck.getCards(), is(not(deck.getCards())));

    }

    @Test
    public void shouldTakeCards() throws Exception {
        //given
        Deck deck = new Deck();
        Card top = deck.getCards().peek();
        int sizeBeforeTake = deck.getCards().size();

        //when
        Card taken = deck.take();

        //then
        assertThat(top, is(taken));
        assertThat(deck.getCards().size(), equalTo(sizeBeforeTake-1));
    }
}