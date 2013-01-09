package sort;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 08/01/2013
 * Time: 13:39
 * To change this template use File | Settings | File Templates.
 */
public class MergeSort {

    public static int[] sort(int[] unsorted) {

        return mergeSort(unsorted);
    }

    private static int[] mergeSort(int[] unsorted) {
        if(unsorted.length==1){
            return unsorted;
        }

        int middle = unsorted.length/2;
        int[] left = new int[middle];
        int[] right = new int[unsorted.length-middle];

        //split original into halves
        System.arraycopy(unsorted,0,left,0,middle);
        System.arraycopy(unsorted,middle,right,0,unsorted.length-middle);

        //recursive split and merge on each part
        left = mergeSort(left);
        right = mergeSort(right);

        //finally merge the array
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int leftIndex=0;
        int rightIndex=0;
        int[] sorted = new int[left.length+right.length];
        int sortedIndex = 0;

        while(leftIndex<left.length && rightIndex<right.length){
            if(left[leftIndex]>right[rightIndex]){
                sorted[sortedIndex]=right[rightIndex];
                rightIndex++;
            }else {
                sorted[sortedIndex]=left[leftIndex];
                leftIndex++;
            }
            sortedIndex++;
        }
        //copy remaining left first since they are less than the right
        while (leftIndex<left.length){
            sorted[sortedIndex]=left[leftIndex];
            leftIndex++;
            sortedIndex++;
        }
        //and then right
        while (rightIndex<right.length){
            sorted[sortedIndex]=right[rightIndex];
            rightIndex++;
            sortedIndex++;
        }

        return sorted;
    }
}
