//Kailan Stewart 
//Main Testing Code

import java.util.*;

public class TestSortingAlgorithms {

    // func. to print any type of array
    public static<T> void printArray(T[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // func. to check if the array of objects is properly sorted
    public static<T extends Comparable<T>> boolean isSorted(T[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i].compareTo(arr[i+1])>0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        // testing Merge sort
        Integer[] arr={7,12,18,9,4,26,55,17,2};
        Mergesort<Integer> ms=new Mergesort<Integer>();
        System.out.print("Unsorted Integer array:\n");
        printArray(arr);
        ms.mergeSort(arr);
        System.out.print("Sorted Integer array (using MergeSort):\n");
        printArray(arr);
        System.out.println("Is array properly sorted? " + isSorted(arr));
        System.out.println();

        // testing Quick sort
        Integer[] arr2={17,25,3,14,24,5,11,12,2};
        System.out.print("Unsorted Integer array:\n");
        printArray(arr2);
        IntQuicksort<Integer> qs=new IntQuicksort<Integer>();
        qs.quickSort(arr2);
        System.out.print("Sorted Integer array (using QuickSort):\n");
        printArray(arr2);
        System.out.println("Is array properly sorted? " + isSorted(arr2));
        System.out.println();

        // testing Heap sort
        Integer[] arr3={17,15,3,11,24,36,10,7,2};
        System.out.print("Unsorted Integer array:\n");
        printArray(arr3);
        Heapsort<Integer> hs=new Heapsort<Integer>();
        hs.sort(arr3);
        System.out.print("Sorted Integer array (using HeapSort):\n");
        printArray(arr3);
        System.out.println("Is array properly sorted? " + isSorted(arr3));
        System.out.println();

        // testing Shell sort
        Integer[] arr4={27,55,23,9,45,61,14,8,22};
        System.out.print("Unsorted Integer array:\n");
        printArray(arr4);
        Shellsort<Integer> ss=new Shellsort<Integer>();
        ss.shellSort(arr4);
        System.out.print("Sorted Integer array (using ShellSort):\n");
        printArray(arr4);
        System.out.println("Is array properly sorted? " + isSorted(arr4));
    }
}
