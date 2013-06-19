package algorithms.search.binarysearch.recursive;

import static java.util.Arrays.copyOfRange;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 27/12/2012
 * Time: 15:51
 * To change this template use File | Settings | File Templates.
 */
public class RecursiveBinarySearch {

    public static int search(int toSearch, int[] inWhichToSearch) {

        if (inWhichToSearch.length == 0) {
            throw new IllegalArgumentException("input list in which to search is empty");
        }

        return search(toSearch, inWhichToSearch, 0, inWhichToSearch.length);

    }

    public static int search(int toSearch, int[] inWhichToSearch, int fromIndex, int toIndex) {

        int midIndex = fromIndex + toIndex / 2;

        int midValue = inWhichToSearch[midIndex];

        if (toSearch == midValue) {
            return midIndex;
        }else if(fromIndex==toIndex){
            return -1;
        }

        if (toSearch < midValue) {
            return search(toSearch, inWhichToSearch, fromIndex, midIndex);
        } else {
            return search(toSearch, inWhichToSearch, midIndex, toIndex);
        }
    }
}
