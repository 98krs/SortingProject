//Chegg 
//This code defines a SortTester class with a main method that creates an unordered Integer array and applies each sorting algorithm to it in turn. For each sorted array

import java.util.Arrays;

public class SortTester {

    public static void main(String[] args) {
        Integer[] unorderedArray = {5, 2, 8, 3, 1, 9, 4, 7, 6};
        System.out.println("Unordered array: " + Arrays.toString(unorderedArray));
        
        // Merge sort
        Integer[] mergeSortedArray = mergeSort(Arrays.copyOf(unorderedArray, unorderedArray.length));
        System.out.println("Merge sorted array: " + Arrays.toString(mergeSortedArray));
        verifyOrder(mergeSortedArray);
        
        // Quick sort
        Integer[] quickSortedArray = quickSort(Arrays.copyOf(unorderedArray, unorderedArray.length));
        System.out.println("Quick sorted array: " + Arrays.toString(quickSortedArray));
        verifyOrder(quickSortedArray);
        
        // Heap sort
        Integer[] heapSortedArray = heapSort(Arrays.copyOf(unorderedArray, unorderedArray.length));
        System.out.println("Heap sorted array: " + Arrays.toString(heapSortedArray));
        verifyOrder(heapSortedArray);
        
        // Shell sort
        Integer[] shellSortedArray = shellSort(Arrays.copyOf(unorderedArray, unorderedArray.length));
        System.out.println("Shell sorted array: " + Arrays.toString(shellSortedArray));
        verifyOrder(shellSortedArray);
    }
    
    public static Integer[] mergeSort(Integer[] array) {
        // TODO: Implement merge sort algorithm here
        return array;
    }
    
    public static Integer[] quickSort(Integer[] array) {
        // TODO: Implement quick sort algorithm here
        return array;
    }
    
    public static Integer[] heapSort(Integer[] array) {
        // TODO: Implement heap sort algorithm here
        return array;
    }
    
    public static Integer[] shellSort(Integer[] array) {
        // TODO: Implement shell sort algorithm here
        return array;
    }
    
    public static void verifyOrder(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println("Error: Array is not properly sorted.");
                return;
            }
        }
        System.out.println("Array is properly sorted.");
    }

}


