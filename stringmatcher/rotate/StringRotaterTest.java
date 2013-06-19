package stringmatcher.rotate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 10/07/2012
 * Time: 17:59
 * To change this template use File | Settings | File Templates.
 */
public class StringRotaterTest {

    private StringRotater stringRotator;

    public void rotateEmptyString(){

        stringRotator = new StringRotater("");

        assertThat(stringRotator.isSubstringOf("\"\""), is(true));
    }
}
