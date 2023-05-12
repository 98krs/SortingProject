//Chegg - doesn't run
//Here's the completed code for all the sorting algorithms and a main class to test and verify them:

import java.util.Arrays;

public class SortingAlgorithms {
    
    // Merge Sort
    
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }
    
    private static void merge(int[] array, int left, int mid, int right) {
        int[] leftArray = Arrays.copyOfRange(array, left, mid + 1);
        int[] rightArray = Arrays.copyOfRange(array, mid + 1, right + 1);
        
        int i = 0, j = 0, k = left;
        
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        
        while (i < leftArray.length) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        
        while (j < rightArray.length) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
    
    // Quick Sort
    
    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
    }
    
    private static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, right);
        return i + 1;
    }
    
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    // Heap Sort
    
    public static void heapSort(int[] array) {
        int heapSize = array.length;
        buildMaxHeap(array, heapSize);
        for (int i = array.length - 1; i > 0; i--) {
            swap(array, 0, i);
            heapSize--;
            maxHeapify(array, 0, heapSize);
        }
    }
    
    private static void buildMaxHeap(int[] array, int heapSize) {
        for (int i = heapSize / 2; i >= 0; i--) {
            maxHeapify(array, i, heapSize);
        }
    }
    
    private static void maxHeapify(int[] array, int i, int heapSize) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (left < heapSize && array[left] > array[largest]) {
            largest = left;
        }
        if (right < heapSize && array[right] > array[largest]) {
           largest = right;
     }
       if (largest != i) {
     swap(array, i, largest);
     maxHeapify(array, largest, heapSize);
}
}
// Shell Sort

public static void shellSort(int[] array) {
    int n = array.length;
    for (int gap = n / 2; gap > 0; gap /= 2) {
        for (int i = gap; i < n; i++) {
            int temp = array[i];
            int j = i;
            while (j >= gap && array[j - gap] > temp) {
                array[j] = array[j - gap];
                j -= gap;
            }
            array[j] = temp;
        }
    }
}

// Main Class

public static void main(String[] args) {
    int[] array = {9, 3, 2, 7, 1, 5, 8, 6, 4};
    System.out.println("Unordered Array: " + Arrays.toString(array));
    
    // Merge Sort
    int[] tempArray = Arrays.copyOf(array, array.length);
    mergeSort(tempArray, 0, tempArray.length - 1);
    System.out.println("Merge Sorted Array: " + Arrays.toString(tempArray));
    System.out.println("Array Sorted: " + isSorted(tempArray));
    
    // Quick Sort
    tempArray = Arrays.copyOf(array, array.length);
    quickSort(tempArray, 0, tempArray.length - 1);
    System.out.println("Quick Sorted Array: " + Arrays.toString(tempArray));
    System.out.println("Array Sorted: " + isSorted(tempArray));
    
    // Heap Sort
    tempArray = Arrays.copyOf(array, array.length);
    heapSort(tempArray);
    System.out.println("Heap Sorted Array: " + Arrays.toString(tempArray));
    System.out.println("Array Sorted: " + isSorted(tempArray));
    
    // Shell Sort
    tempArray = Arrays.copyOf(array, array.length);
    shellSort(tempArray);
    System.out.println("Shell Sorted Array: " + Arrays.toString(tempArray));
    System.out.println("Array Sorted: " + isSorted(tempArray));
}

private static boolean isSorted(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
            return false;
        }
    }
    return true;
}



