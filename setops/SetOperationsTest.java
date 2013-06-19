package setops;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 09/01/2013
 * Time: 11:33
 * To change this template use File | Settings | File Templates.
 */
public class SetOperationsTest {

    private SetOperations setOperations;

    @Before
    public void setUp() throws Exception {
        setOperations = new SetOperations();
    }

    @Test
    public void shouldFindDuplicates(){
        assertThat(new ArrayList<Integer>(setOperations.findDuplicate(asList(new Integer[]{1, 1, 2, 3, 4, 4, 5}))), hasItems(1, 4)) ;
    }

    @Test
    public void shouldFindUnique() {
        assertThat(new ArrayList<Integer>(setOperations.findUnique(asList(new Integer[]{1, 1, 2, 3, 4, 4, 5}))), hasItems(2, 3, 5)) ;
    }

    @Test
    public void shouldFindSymmetricDifference() throws Exception {
        assertThat(new ArrayList<Integer>(setOperations.findSymmetricDifference(asList(new Integer[]{1, 2, 3, 4, 5}),asList(4,5,6,7))), hasItems(1,2, 3, 7)) ;

    }
}
