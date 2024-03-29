import java.util.Arrays;
import java.util.Random;

public class Lab1 {
    static Random random = new Random();
    /** Sorting algorithms **/

    // Insertion sort.
    //------------------------------------------------------------------------------
    public static void insertionSortSwap(int[] array) { //BAD
        int n = array.length;
        int currentValue;
        int j;

        for(int i = 1 ; i < n; i++) {
            currentValue = array[i];
            j = i-1;

            while(j>=0 && array[j] > currentValue) {
                swap(array,j+1,j);
                j--;
            }
            //currentValue
        }
    }

    public static void insertionSort(int[] array) { //search for correct index, then insert.
        int n = array.length;
        int currentValue;
        int j;

        for(int i = 1 ; i < n; i++) {
            currentValue = array[i];
            j = i-1;

            while(j>=0 && array[j] > currentValue) {
                swap(array,j+1,j);
                j--;
            }
        }
    }


    // Quicksort.
    //------------------------------------------------------------------------------
    public static void quickSort(int[] array) {

        int n = array.length;
        quickSort(array,0,n-1);


    }

    // Quicksort part of an array
    private static void quickSort(int[] array, int begin, int end) {
        if(begin >= end) {
            return;
        }

        int pivot = partition(array, begin, end);


        quickSort(array, begin, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    // Partition part of an array, and return the index where the pivot
    // ended up.
    private static int partition(int[] array, int begin, int end) {
        int pivotValue = array[begin];
        int low = begin+1;
        int high = end;

        while(true) {
            while (low <= end && array[low] < pivotValue) {
                low++;
            }
            while (high > begin && array[high] > pivotValue) {
                high--;
            }

            if(low >= high) {
                break;
            }
            swap(array, low, high);
            low++;
            high--;
        }

        swap(array, high, begin);

        return high;
    }

    // Swap two elements in an array
    private static void swap(int[] array, int i, int j) {
        int x = array[i];
        array[i] = array[j];
        array[j] = x;
    }

    // Mergesort.
    //------------------------------------------------------------------------------
    public static int[] mergeSort(int[] array) {
        int n = array.length;

        return mergeSort(array, 0, n-1);
    }

    // Mergesort part of an array
    private static int[] mergeSort(int[] array, int begin, int end) {
        throw new UnsupportedOperationException();

    }

    // Merge two sorted arrays into one
    private static int[] merge(int[] left, int[] right) {
        throw new UnsupportedOperationException();
    }
}
