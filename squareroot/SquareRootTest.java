package squareroot;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 24/12/2012
 * Time: 15:52
 * To change this template use File | Settings | File Templates.
 */
public class SquareRootTest {

    @Test
    public void calculateSquareRoot(){
        assertThat(SquareRoot.of(1), is(closeTo(1, 0)));
        assertThat(SquareRoot.of(4), is(closeTo(2, 0)));
    }

}
