package stringreverse;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 25/01/2013
 * Time: 11:09
 * To change this template use File | Settings | File Templates.
 */
public class RecursiveStringReverseTest {

    private RecursiveStringReverse stringReverser;

    @Before
    public void setUp() throws Exception {
        stringReverser = new RecursiveStringReverse();
    }

    @Test
    public void shouldGenerateReverseEmptyString() {
        assertThat(stringReverser.reverse(""), is(""));
    }

    @Test
    public void shouldReverseString() throws Exception {
        assertThat(stringReverser.reverse("hello"), is("olleh"));
    }
}
