package binarysearch.nonrecursive;


public class NonRecursiveBinarySearch {

    public static int search(int toSearch, int[] searchIn) {

        if(searchIn==null || searchIn.length==0){
            throw new IllegalArgumentException("List in which to search must have elements.");
        }

        int fromIndex = 0;
        int toIndex = searchIn.length;

        while(fromIndex!=toIndex){
            int midIndex = (fromIndex+toIndex)/2;
            int midValue = searchIn[midIndex];
            if(toSearch==midValue){
                return midIndex;
            }else if(toSearch<midValue){
                toIndex=midIndex;
            }else if(toSearch>midValue){
                fromIndex=midIndex;
            }

        }
        return -1;
    }
}
