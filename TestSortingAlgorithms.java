//Kailan Stewart 
//Test altered sorting algorithm code 

import java.util.*;

public class TestSortingAlgorithms {

    //PRINT METHOD - print any type of array
    public static<T> void printArray(T[] arr){
        int n = arr.length;
        for(int i = 0; i < n ; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    //SORTING VERIFICATION METHOD - verify that array is sorted properly 
    public static<T extends Comparable<T>> boolean isSorted(T[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n - 1; i++){
            if(arr[i].compareTo(arr[i + 1]) > 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        //Test merge sort 
        Integer[] arr = {12, 34, 54, 2, 3};
        Mergesort<Integer> ms=new Mergesort<Integer>();
        System.out.print("Unsorted Integer Array:\n");
        printArray(arr);
        ms.mergeSort(arr);
        System.out.print("Sorted Integer Array (using Merge Sort):\n");
        printArray(arr);
        System.out.println("Is array properly sorted? " + isSorted(arr));
        System.out.println();

        //Test quick sort
        Integer[] arr2 = {12, 34, 54, 2, 3}; 
        System.out.print("Unsorted Integer array:\n");
        printArray(arr2); 
        IntQuicksort<Integer> qs=new IntQuicksort<Integer>();
        qs.quickSort(arr2); 
        System.out.print("Sorted Integer array (using QuickSort):\n");
        printArray(arr2); 
        System.out.println("Is array properly sorted? " + isSorted(arr2)); 
        System.out.println();

        //Test heap sort
        Integer[] arr3 = {12, 11, 13, 5, 6, 7};
        System.out.print("Unsorted Integer array:\n");
        printArray(arr3);
        Heapsort<Integer> hs=new Heapsort<Integer>();
        hs.sort(arr3);
        System.out.print("Sorted Integer array (using HeapSort):\n");
        printArray(arr3);
        System.out.println("Is array properly sorted? " + isSorted(arr3));
        System.out.println();

        //Test shell sort 
        Integer[] arr4 = {12, 34, 54, 2, 3};
        System.out.print("Unsorted Integer array:\n");
        printArray(arr4);
        Shellsort<Integer> ss=new Shellsort<Integer>();
        ss.shellSort(arr4);
        System.out.print("Sorted Integer array (using ShellSort):\n");
        printArray(arr4);
        System.out.println("Is array properly sorted? " + isSorted(arr4));
    }
}
