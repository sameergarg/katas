package question.wordwrap;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: sameer
 * Date: 30/01/2012
 * Time: 19:16
 * To change this template use File | Settings | File Templates.
 */
public class WordWrapTest {
    WordWrap wordWrap;

    @Test
    public void wrap_single_line_in_two_line(){
        MatcherAssert.assertThat(WordWrap.wrap("wrap wrap", 4), Matchers.equalTo("wrap/nwrap"));
    }

    @Test
    public void do_not_wrap_if_position_is_more_than_line_length(){
        MatcherAssert.assertThat(WordWrap.wrap("wrap wrap", 14), Matchers.equalTo("wrap wrap"));

    }

    @Test
    public void do_not_wrap_if_position_is_same_as_line_length(){
        MatcherAssert.assertThat(WordWrap.wrap("wrap wrap", 9), Matchers.equalTo("wrap wrap"));
    }

    @Test
    public void wrap_single_line_without_space_in_two_lines(){
        MatcherAssert.assertThat(WordWrap.wrap("wrapwrapwrap", 4), Matchers.equalTo("wrap/nwrap/nwrap"));
    }

    @Test
    public void wrap_single_line_at_space_before_wrap_position_when_wrap_position_is_in_middle_of_word(){
        MatcherAssert.assertThat(WordWrap.wrap("wrap wrap", 6), Matchers.equalTo("wrap/nwrap"));
    }

    @Test
    public void wrap_single_line_at_space(){
        MatcherAssert.assertThat(WordWrap.wrap("wrap wrap", 4), Matchers.equalTo("wrap/nwrap"));
    }

    @Test
    public void wrap_single_line_in_multiple_line_at_spaces(){
        MatcherAssert.assertThat(WordWrap.wrap("wrap wrap wrap wrap wrap wrap", 6), Matchers.equalTo("wrap/nwrap/nwrap/nwrap/nwrap/nwrap"));
        MatcherAssert.assertThat(WordWrap.wrap("wrap wrap wrap wrap wrap wrap", 10), Matchers.equalTo("wrap wrap/nwrap wrap/nwrap wrap"));
    }
}
