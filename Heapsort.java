//HEAP SORT:  Reference GeeksforGeeks.com


//Java program for implementation of Heap Sort

public class Heapsort<T> { //EDITED: <T>
 public void sort(Object arr[]) //EDITED: int --> Object
 {
     int n = arr.length; // again, making arr.length into a variable is kind of useless as the length of the array will always be accessable with the use of arr.length. In short, `n` offers nothing useful to the program

     // Build heap (rearrange array)
     for (int i = n / 2 - 1; i >= 0; i--)
         heapify(arr, n, i);

     // One by one extract an element from heap
     for (int i = n - 1; i >= 0; i--) {
         // Move current root to end
         Object temp = arr[0]; //EDITED: int --> Object
         arr[0] = arr[i];
         arr[i] = temp;

         // call max heapify on the reduced heap
         heapify(arr, i, 0);
     }
 }

 // To heapify a subtree rooted with node i which is
 // an index in arr[]. n is size of heap
 void heapify(Object arr[], int n, int i) //EDITED: int --> Object
 {
     int largest = i; // Initialize largest as root
     int l = 2 * i + 1; // left = 2*i + 1
     int r = 2 * i + 2; // right = 2*i + 2

     // If left child is larger than root
     if (l < n && arr[l] > arr[largest]) // this is the same problem that was encountered in the previous file. Need to cast the object data type into something else
         largest = l;

     // If right child is larger than largest so far
     if (r < n && arr[r] > arr[largest]) // this is the same problem that was encountered in the previous file. Need to cast the object data type into something else
         largest = r;

     // If largest is not root
     if (largest != i) {
         int swap = arr[i]; // you are trying to equal an object to an int, hense the error
         arr[i] = arr[largest];
         arr[largest] = swap;

         // Recursively heapify the affected sub-tree
         heapify(arr, n, largest);
     }
 }

 /* A utility function to print array of size n */
 static void printArray(Object arr[]) //EDITED: int --> Object
 {
     int n = arr.length; // making arr.length into a variable is kind of useless as it is only being used once and the length of the array will always be accessable with the use of arr.length. In short, `n` offers nothing useful to the program
     for (int i = 0; i < n; ++i)
         System.out.print(arr[i] + " ");
     System.out.println();
 }

 // Driver program
 public static void main(String args[])
 {
     Integer arr[] = { 12, 11, 13, 5, 6, 7 }; //EDITED: int --> Object
     int n = arr.length; // <- variable unused. Should likely be removed

     Heapsort<Integer> ob = new Heapsort<Integer>(); //EDITED: <Integer>
     ob.sort(arr);

     System.out.println("Sorted array is");
     printArray(arr);
 }
}
