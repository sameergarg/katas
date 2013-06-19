package wordcount;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 23/01/2013
 * Time: 14:31
 * To change this template use File | Settings | File Templates.
 */
public class WordsCountTest {

    private WordsCount wordsCount;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void blankLineShouldHaveNoWords(){
        assertThat(new WordsCount("").countWord(), is(0));
    }

    @Test
    public void shouldCountWordSeparatedBySpace() throws Exception {
        assertThat(new WordsCount("i have four words").countWord(), is(4));
    }

    @Test
    public void shouldCountWordSeparatedByPunctuation() throws Exception {
        assertThat(new WordsCount("me, myself and irene").countWord(), is(4));
    }
}
