//Kailan Stewart
//Merge Sort Code 
//Goal: Modify the code so it handles generic objects 

import java.util.*;

public class Mergesort {

   //Driver method
   public static void main(String args[]) {
      
      //CREATE AN ARRAY WITH A LIST OF UNORDERED INTEGERS
      int arr[] = {12, 34, 54, 2, 3};
      System.out.println("Array before sorting");
      //CALL THE PRINT ARRAY METHOD
      printArray(arr);
      
      //CALL MERGESORT METHOD TO SORT THE ARRAY
      Mergesort ob = new Mergesort();
      ob.mergeSort(arr);

      //PRINT THE ARRAY AFTER IT'S SORTED
      System.out.println("Array after sorting");
      //CALL THE PRINT ARRAY METHOD
      printArray(arr);
      
   }

   //METHOD - PRINT OUT THE ARRAY 
   static void printArray(int arr[]) {
      int n = arr.length;
      for (int i=0; i<n; ++i)
         System.out.print(arr[i] + " ");
         System.out.println();
   }

   // Places the elements of the given array into sorted order
   // using the merge sort algorithm.
   // post: array is in sorted (nondecreasing) order
   public static void mergeSort(int[] array) {
      if (array.length > 1) {
         // split array into two halves
         int[] left = leftHalf(array);
         int[] right = rightHalf(array);
            
         // recursively sort the two halves
         mergeSort(left);
         mergeSort(right);
            
         // merge the sorted halves into a sorted whole
         merge(array, left, right);
      }
   }
    
    // Returns the first half of the given array.
    public static int[] leftHalf(int[] array) {
        int size1 = array.length / 2;
        int[] left = new int[size1];
        for (int i = 0; i < size1; i++) {
            left[i] = array[i];
        }
        return left;
    }
    
    // Returns the second half of the given array.
    public static int[] rightHalf(int[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = array[i + size1];
        }
        return right;
    }
    
    // Merges the given left and right arrays into the given 
    // result array.  Second, working version.
    // pre : result is empty; left/right are sorted
    // post: result contains result of merging sorted lists
    public static void merge(int[] result, int[] left, int[] right) {
        int i1 = 0;   // index into left array
        int i2 = 0;   // index into right array
        
        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && 
                    left[i1] <= right[i2])) {
                result[i] = left[i1];    // take from left
                i1++;
            } else {
                result[i] = right[i2];   // take from right
                i2++;
            }
        }
    }
 }

