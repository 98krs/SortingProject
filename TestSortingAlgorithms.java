//Kailan Stewart 

import java.util.Arrays;

public class TestSortingAlgorithms {
   
   public static void main (String[] args) {
   
      //Create an unordered array
      Integer[] unsortedArray = {12, 34, 54, 2, 3};
      //Print out the array before being sorted 
      System.out.println("Array before sort: " + Arrays.toString(unsortedArray)); //UNSURE WHERE ARRAYS COMES FROM
      
      //MERGE SORT 
      //Create merge array
      Integer[] mergeArray = mergeSort(Arrays.copyOf(unsortedArray, unsortedArray.length)); //ERROR: mergeSort - CANNOT FIND SYMBOL 
      //Print unsorted merge array 
      System.out.println("Array after merge sort: " + Arrays.toString(mergeArray));
      //Call verifySort method 
      verifySort(mergeArray);
      printArray(mergeArray); //trying to call print array, idk if this is correct though 
      
   public static Integer[] mergeSort(Integer[] array) {
      public void mergeSort(Object[] array) { //convert array argument into generic
         if (array.length > 1) {
            // split array into two halves
            Object[] left = leftHalf(array); //changed int[] to Object[]
            Object[] right = rightHalf(array); //yes, need here
   
            // recursively sort the two halves
            mergeSort(left);
            mergeSort(right);
   
            // merge the sorted halves into a sorted whole
            merge(array, left, right);
         }
      }
   
       // Returns the first half of the given array.
       public static Object[] leftHalf(Object[] array) { //yes, here (it's the variable left))
           int size1 = array.length / 2; //don't need to convert to Integer or Object
           Object[] left = new Object[size1]; //made changes here int --> Object 
           for (int i = 0; i < size1; i++) { //don't need to convert int
               left[i] = array[i];
           }
           return left; 
       }
   
       // Returns the second half of the given array.
       public static Object[] rightHalf(Object[] array) { //yes, here //EDITED
           int size1 = array.length / 2;
           int size2 = array.length - size1;
           Object[] right = new Object[size2]; //edited
           for (int i = 0; i < size2; i++) {
               right[i] = array[i + size1];
           }
           return right;
       }
   
       // Merges the given left and right arrays into the given
       // result array.  Second, working version.
       // pre : result is empty; left/right are sorted
       // post: result contains result of merging sorted lists
       public static void merge(Object[] result, Object[] left, Object[] right) { //yes, here (there are 2 variable declarations, i1, and i2) //edited
           int i1 = 0;   // index into left array 
           int i2 = 0;   // index into right array
   
           for (int i = 0; i < result.length; i++) {
               if (i2 >= right.length || (i1 < left.length && (Integer)left[i1] <= (Integer)right[i2])) { //edited 
                   result[i] = left[i1];    // take from left
                   i1++;
               } else {
                   result[i] = right[i2];   // take from right
                   i2++;
               }
           }
       }
      return array; 
   }
      
   //______________________________________________________________________________________________________________________________________________________________
      
   //METHOD - SORTING VERIFICATION 
   public static void verifySort(Integer[] array) {
      for (int i = 0; i < array.length - 1; i += 1) {
         if (array[i] > array[i + 1]) {
            System.out.println("Error: Array is not properly sorted");
            return;
         }
      }
      System.out.println("Array is properly sorted"); 
   }
   //______________________________________________________________________________________________________________________________________________________________
      
   //METHOD - PRINT
   //THIS MAY NEED TO BE PERSONALIZED 
   static void printArray(Object arr[]) { //DOES THIS NEED TO BE AN OBJECT INSTEAD OF INT? 
      int n = arr.length;
      for (int i = 0; i < n; ++i)
         System.out.print(arr[i] + " ");
         System.out.println();
   }
   
   //______________________________________________________________________________________________________________________________________________________________
   
   }
   
}