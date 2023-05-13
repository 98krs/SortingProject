//Kailan Stewart 
//Merge Sort 

import java.util.*;

public class Mergesort<T extends Comparable<T>> { //EDITED: <T extends Comparable<T>>
    
    // Driver method
    public static void main(String args[]) 
    {
        Integer arr[] = {12, 34, 54, 2, 3}; //EDITED: int --> Integer
        System.out.println("Array before sorting");
        printArray(arr);

        Mergesort<Integer> ob = new Mergesort<>(); //EDITED: <Integer>, <>
        ob.mergeSort(arr);

        System.out.println("Array after sorting");
        printArray(arr);
    }

    static <T> void printArray(T[] arr) //EDITED: <T>, T[] arr
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Places the elements of the given array into sorted order
    // using the merge sort algorithm.
    // post: array is in sorted (nondecreasing) order
    public void mergeSort(T[] array) { //EDITED: Static, int --> T
        if (array.length > 1) {
            // split array into two halves
            T[] left = leftHalf(array); //EDITED: int --> T
            T[] right = rightHalf(array); //EDITED: int --> T

            // recursively sort the two halves
            mergeSort(left);
            mergeSort(right);

            // merge the sorted halves into a sorted whole
            merge(array, left, right);
        }
    }

    // Returns the first half of the given array.   
    public T[] leftHalf(T[] array) { //EDITED: static, int --> T
        int size1 = array.length / 2;
        T[] left = Arrays.copyOfRange(array, 0, size1); //EDITED: int --> T, Arrays.copyOfRange(array, 0, size1)
        return left;
    }

    // Returns the second half of the given array.
    public T[] rightHalf(T[] array) { //EDITED: static, int --> T
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        T[] right = Arrays.copyOfRange(array, size1, size1 + size2); //EDITED: int --> T, Arrays.copyOfRange(array, size1, size1 + size2)
        return right;
    }

    // Merges the given left and right arrays into the given
    // result array. Second, working version.
    // pre : result is empty; left/right are sorted
    // post: result contains result of merging sorted lists;
    public void merge(T[] result, T[] left, T[] right) { //EDITED: static, int --> T
        int i1 = 0; // index into left array
        int i2 = 0; // index into right array

        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length &&
                    left[i1].compareTo(right[i2]) <= 0)) { //EDITED: .compareTo, <= 0
                result[i] = left[i1]; // take from left
                i1++;
            } else {
                result[i] = right[i2]; // take from right
                i2++;
            }
        }
    }
}
