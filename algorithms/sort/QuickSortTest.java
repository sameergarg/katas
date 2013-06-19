package algorithms.sort;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static algorithms.sort.QuickSort.sort;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 08/01/2013
 * Time: 16:06
 * To change this template use File | Settings | File Templates.
 */
public class QuickSortTest {

    @Test
    public void quick_sort_one_element(){
        assertThat(sort(new Integer[]{1}),is(new Integer[]{1}));
    }

    @Test
    public void quick_sort_two_element(){
        assertThat(sort(new Integer[]{2, 1}),is(new Integer[]{1, 2}));

    }

    @Test
    public void quick_sort_three_element(){
        assertThat(sort(new Integer[]{2, 1, 3}),is(new Integer[]{1, 2, 3}));

    }
}
