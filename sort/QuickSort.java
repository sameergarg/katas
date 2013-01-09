package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    public static Integer[] sort(Integer[] unsorted) {
        return quickSort(unsorted);

    }

    private static Integer[] quickSort(Integer[] unsorted) {
        //checks for size
        if(unsorted.length<=1){
            return unsorted;
        }

        //select pivot
        int pivotIndex = unsorted.length / 2;
        int pivot = unsorted[pivotIndex];

        //partition high to the right and low to the left of pivot
        int[] notIncludingPivot = new int[unsorted.length-1];
        int j=0;
        for(int i=0;i<unsorted.length;i++){
           if(i!=pivotIndex){
               notIncludingPivot[j]=unsorted[i];
               j++;
           }
        }
        List<Integer> lessThanPivot = new ArrayList<Integer>();
        List<Integer> moreThanPivot = new ArrayList<Integer>();

        for(int i=0;i<notIncludingPivot.length;i++){
            if(notIncludingPivot[i]<pivot){
                lessThanPivot.add(notIncludingPivot[i]);
            }else{
                moreThanPivot.add(notIncludingPivot[i]);
            }
        }

        return merge(quickSort(lessThanPivot.toArray(new Integer[lessThanPivot.size()])),pivot,quickSort(moreThanPivot.toArray(new Integer[moreThanPivot.size()])));


    }

    private static Integer[] merge(Integer[] lessThanPivot, int pivot, Integer[] moreThanPivot) {
        List<Integer> sortedByPivot = new ArrayList<Integer>();

        sortedByPivot.addAll(Arrays.asList(lessThanPivot));
        sortedByPivot.add(pivot);
        sortedByPivot.addAll(Arrays.asList(moreThanPivot));

        return sortedByPivot.toArray(new Integer[sortedByPivot.size()]);
    }


}
