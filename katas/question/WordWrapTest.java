package question;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: sameer
 * Date: 27/01/2012
 * Time: 15:12
 * To change this template use File | Settings | File Templates.
 */
public class WordWrapTest {
    
    @Test
    public void shouldWrapStringWhenLengthOfStringIsGreaterThanWrapIndex(){
        String wrappedString = WoOldrdWrap.wrap("i am a long string", 5);
        assertThat(wrappedString, is("i am \na long string"));

    }

    @Test
    public void shouldNotWrapStringWhenLengthOfStringIsLessThanWrapIndex(){
        String wrappedString = WoOldrdWrap.wrap("i am a long string", 25);
        assertThat(wrappedString, is("i am a long string"));

    }

    @Test
    public void shouldWrapStringWhenLengthOfStringIsEqualToWrapIndex(){
        String wrappedString = WoOldrdWrap.wrap("123456789", 9);
        assertThat(wrappedString, is("123456789\n"));

    }
    @Test
    public void wrapLineInMultipleLines(){
        assertThat(WoOldrdWrap.wrap("wrap wrap wrap wrap wrap", 6),equalTo("wrap\nwrap\nwrap\nwrap\nwrap"));
    }
}
