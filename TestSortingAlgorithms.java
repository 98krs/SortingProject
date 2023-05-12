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
      //implement merge sort algorithm here. Want to call merge sort algorithm though. 
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