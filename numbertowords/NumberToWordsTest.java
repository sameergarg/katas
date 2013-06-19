package numbertowords;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * User: sameer
 * Date: 07/05/2013
 * Time: 09:42
 */
public class NumberToWordsTest {


    private NumberToWords numberToWords = new NumberToWords();

    @Test
    public void shouldConvert1ToWord(){

        assertThat(numberToWords.toWords(1), is("one"));
    }

    @Test
    public void shouldConvert2ToWord(){

        assertThat(numberToWords.toWords(2), is("two"));
    }

}
