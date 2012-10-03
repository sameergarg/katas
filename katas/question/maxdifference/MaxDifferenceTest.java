package question.maxdifference;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: sameer
 * Date: 15/02/2012
 * Time: 09:30
 * To change this template use File | Settings | File Templates.
 */
public class MaxDifferenceTest {

    MaxDifference maxDifference;

    @Before
    public void setUp() throws Exception {
        maxDifference = new MaxDifference();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test(expected = IllegalArgumentException.class)
    public void throw_exception_if_array_is_null(){
        maxDifference.difference(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throw_exception_if_array_is_empty(){
        maxDifference.difference(new int[]{});
    }

    @Test
    public void difference_when_it_overflows_due_to_extreme_values(){
        System.out.println("Max:"+Integer.MAX_VALUE+",Min:"+Integer.MIN_VALUE+",Difference:"+((long)(Integer.MAX_VALUE-Integer.MIN_VALUE)));
        MatcherAssert.assertThat(maxDifference.difference(new int[]{1, Integer.MIN_VALUE, 5, Integer.MAX_VALUE, 6}), Matchers.equalTo((Integer.MAX_VALUE-Integer.MIN_VALUE)));
    }
    @Test
     public void difference_when_the_array_entries_are_positive(){
        MatcherAssert.assertThat(maxDifference.difference(new int[]{1, 2, 5, 10, 6}), Matchers.equalTo(9));
    }

    @Test
     public void difference_when_the_array_has_single_entry(){
        MatcherAssert.assertThat(maxDifference.difference(new int[]{1}), Matchers.equalTo(0));
        MatcherAssert.assertThat(maxDifference.difference(new int[]{-1}), Matchers.equalTo(0));
        MatcherAssert.assertThat(maxDifference.difference(new int[]{0}), Matchers.equalTo(0));
    }

    public void difference_when_the_array_entries_are_positive_and_duplicate(){
        MatcherAssert.assertThat(maxDifference.difference(new int[]{1, 2, 5, 10, 10}), Matchers.equalTo(9));
    }
}
