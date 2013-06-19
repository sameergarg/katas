package lucastower;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 30/08/2012
 * Time: 09:07
 * To change this template use File | Settings | File Templates.
 */
public class LucasTowerTest {

    @Test
    public void shouldArrangeSingleDiskOnLucasTower(){
        LucasTower lucasTower = new LucasTower(1);
        Tower destination = lucasTower.arrange();
        assertThat(destination.diskCount(), is(1));
        assertThat(destination.areDisksInOrder(), is(true));
    }

    @Test
    public void shouldArrangeTwoDiskOnLucasTower(){
        LucasTower lucasTower = new LucasTower(2);
        Tower destination = lucasTower.arrange();
        assertThat(destination.diskCount(), is(2));
        assertThat(destination.areDisksInOrder(), is(true));
    }
}
