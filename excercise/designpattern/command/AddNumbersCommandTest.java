package designpattern.command;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 10/07/2012
 * Time: 17:24
 * To change this template use File | Settings | File Templates.
 */
public class AddNumbersCommandTest {

    private AddNumbersCommand addNumbersCommand;

    @Test
    public void shouldAddTwoNumbers(){
        addNumbersCommand = new AddNumbersCommand(2,3);
        assertThat(addNumbersCommand.execute(), is(5));

    }


}
