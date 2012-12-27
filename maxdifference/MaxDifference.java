package maxdifference;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: sameer
 * Date: 15/02/2012
 * Time: 09:29
 * To change this template use File | Settings | File Templates.
 */
public class MaxDifference {

    /**
     * Find the difference between maximum and minimum entry of supplied array of int
     * @param numbers
     * @return
     * @throws IllegalArgumentException if input array is null or blank
     * @throws ArithmeticException if the difference is outside the range of {@link Integer#MAX_VALUE} or {@link Integer#MIN_VALUE}
     */
    public int difference(int[] numbers) {

        if(numbers==null || numbers.length==0){
            throw new IllegalArgumentException("Input array cannot be null or blank");
        }

        Arrays.sort(numbers);
        return numbers[numbers.length-1]-numbers[0];
    }
}
