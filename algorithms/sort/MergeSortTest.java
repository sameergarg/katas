package algorithms.sort;

import org.junit.Test;

import static algorithms.sort.MergeSort.sort;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 08/01/2013
 * Time: 13:20
 * To change this template use File | Settings | File Templates.
 */
public class MergeSortTest {

    @Test
    public void should_not_sort_single_element_list(){
        assertThat(sort(new int[]{1}),is(new int[]{1}));
    }

    @Test
    public void should_sort_double_element_list(){
        assertThat(sort(new int[]{2,1}),is(new int[]{1,2}));
    }

    @Test
    public void should_sort_triple_element_list(){
        assertThat(sort(new int[]{2,1,3}),is(new int[]{1,2,3}));
    }

    @Test
    public void should_sort_list_containing_duplicates() throws Exception {
        assertThat(sort(new int[]{2,1,3,1}),is(new int[]{1,1,2,3}));
        assertThat(sort(new int[]{2,1,3,1,2}),is(new int[]{1,1,2,2,3}));
    }
}
