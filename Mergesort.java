//Kailan Stewart
//Merge Sort Code
//Goal: Modify the code so it handles generic objects

/*
Before generics:
package java.lang;
	public interface Comparable {
		public int compareTo(Object o)
	}

After generics:
package java.lang;
	public interface Comparable<T> {
		public int compareTo(T o)
	}

Here, the compiler cannot detect the error in c.compareTo(“red”)
   Comparable c = new Date();
   System.out.println(c.compareTo(“red”));
Here, the compiler can detect the error in c.compareTo(“red”)
   Comparable<Date> c = new Date();
   System.out.println(c.compareTo(“red”));

*/

import java.util.*;

public class Mergesort<T> { //ADDED <T>

   //Driver method
    public static void main(String args[]) { //no, don't need to add generics inside main method

        //CREATE AN ARRAY WITH A LIST OF UNORDERED INTEGERS
        Integer arr[] = {12, 34, 54, 2, 3}; //edited
        System.out.println("Array before sorting");
        //CALL THE PRINT ARRAY METHOD
        printArray(arr);

        //CALL MERGESORT METHOD TO SORT THE ARRAY
        // Error - Mergesort is a raw type. References to generic type Mergesort<T> should be parameterized
        Mergesort<Integer> ob =  new Mergesort<Integer>(); //edited
        ob.mergeSort(arr);

        //PRINT THE ARRAY AFTER IT'S SORTED
        System.out.println("Array after sorting");
        //CALL THE PRINT ARRAY METHOD
        printArray(arr);

    }

    //METHOD - PRINT OUT THE ARRAY
    static void printArray(Object arr[]) { //yes, bc I'm not sure if the argument I'm being given is whatever type //edited
        int n = arr.length;
        for (int i=0; i<n; ++i) { 
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

   // Places the elements of the given array into sorted order
   // using the merge sort algorithm.
   // post: array is in sorted (nondecreasing) order
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
 }

