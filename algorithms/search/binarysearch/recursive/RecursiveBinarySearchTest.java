package algorithms.search.binarysearch.recursive;

import org.junit.Test;

import static algorithms.search.binarysearch.recursive.RecursiveBinarySearch.search;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 27/12/2012
 * Time: 15:49
 * To change this template use File | Settings | File Templates.
 */
public class RecursiveBinarySearchTest {

    @Test(expected = IllegalArgumentException.class)
    public void searchWhenNoElementsInList(){
        search(1, new int[]{});
    }

    @Test
    public void shouldFindElementInSingleElementList() throws Exception {
        assertThat(search(1,new int[]{1}),is(0));
    }

    @Test
    public void shouldFindElementInDoubleElementListWithElementInBeginning() throws Exception {
        assertThat(search(1,new int[]{1,2}),is(0));
    }

    @Test
    public void shouldFindElementInDoubleElementListWithElementInEnd() throws Exception {
        assertThat(search(2,new int[]{1,2}),is(1));
    }

    @Test
    public void shouldFindElementInTripleElementList() throws Exception {
        assertThat(search(3,new int[]{1,2,3}),is(2));
        assertThat(search(1,new int[]{1,2,3}),is(0));
        assertThat(search(2,new int[]{1,2,3}),is(1));
    }

    @Test
    public void shouldFindElementInVaryingElementList() throws Exception {
        assertThat(search(6,new int[]{1,2,3,4,5,6,7,8,9,10}),is(5));
        assertThat(search(6,new int[]{1,2,3,4,5,6,7,8,9,10,11}),is(5));
        assertThat(search(6,new int[]{1,2,3,4,5,6,7,8,9,10,11}),is(5));
        assertThat(search(1,new int[]{1,2,3,4,5,6,7,8,9,10,11}),is(0));
        assertThat(search(11,new int[]{1,2,3,4,5,6,7,8,9,10,11}),is(10));
    }

    @Test
    public void searchWhenElementIsAbsentInList(){
        assertThat(search(1, new int[]{2, 3, 4, 5}), is(-1));
    }
}
