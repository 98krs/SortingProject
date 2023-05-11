//SHELL SORT:   Reference GeeksforGeeks.com

public class Shellsort<T> { //EDITED: <T>

 /* A utility function to print array of size n*/
 static void printArray(Object arr[])
 {
     int n = arr.length; // again, making arr.length into a variable is kind of useless as the length of the array will always be accessable with the use of arr.length. In short, `n` offers nothing useful to the program
     for (int i=0; i<n; ++i)
         System.out.print(arr[i] + " ");
     System.out.println();
 }

 /* function to sort arr using shellSort */
 int sort(Object arr[]) //EDITED: INT --> Object
 {
     int n = arr.length;

     // Start with a big gap, then reduce the gap
     for (int gap = n/2; gap > 0; gap /= 2)
     {
         // Do a gapped insertion sort for this gap size.
         // The first gap elements a[0..gap-1] are already
         // in gapped order keep adding one more element
         // until the entire array is gap sorted
         for (int i = gap; i < n; i += 1)
         {
             // add a[i] to the elements that have been gap
             // sorted save a[i] in temp and make a hole at
             // position i
             Object temp = arr[i]; //EDITED: int --> Object

             // shift earlier gap-sorted elements up until
             // the correct location for a[i] is found
             int j;
             for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) // this is the same problem that was encountered in the previous file. Need to cast the object data type into something else
                 arr[j] = arr[j - gap];

             // put temp (the original a[i]) in its correct
             // location
             arr[j] = temp;
         }
     }
     return 0;
 }


// Driver method
public static void main(String args[])
{
    Integer arr[] = {12, 34, 54, 2, 3}; //EDITED: int --> Integer
    System.out.println("Array before sorting");
    printArray(arr);

    Shellsort<Integer> ob = new Shellsort<Integer>(); //EDITED: <Integer>
    ob.sort(arr);

    System.out.println("Array after sorting");
    printArray(arr);
}
}




