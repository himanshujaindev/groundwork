package DataStructures.Implementation.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import Common.io;

/*
Reference:
https://www.javatpoint.com/array-in-java
https://www.geeksforgeeks.org/arrays-in-java/ 

*/

public class array {
    public static void main(String[] args) {
        // int intArray[]; // declaring array (No array created)
        // intArray = new int[20]; // allocating memory to array (Array of 20 elements
        // created)

        int[] arr1 = { 1, 2, 3 };
        int arr2[] = { 1, 2, 3 };

        int[] arr3 = new int[3];
        arr3[0] = 1;
        arr3[1] = 2;
        arr3[2] = 3;

        System.out.println(Arrays.toString(arr1) + Arrays.toString(arr2) + Arrays.toString(arr3));

        // Copy an array
        // System.arraycopy(src, srcPos, dest, destPos, length);
        int[] c1 = { 1, 2, 3 };
        int[] c2 = new int[3];
        System.arraycopy(c1, 0, c2, 0, c1.length);
        System.out.println("Copy array = " + Arrays.toString(c2));
        System.out.println(c1 == c2);

        // Array of objects
        // Student[5] st;

        // clone of array (deep copy of array)
        int[] arr4 = arr1.clone();
        int[] arr5 = arr1;
        System.out.println(arr1 == arr4);
        System.out.println(arr1 == arr5);

        // Jagged array = 2-D array; Fixed number of rows and variable number of columns

        System.out.println(Arrays.toString(new int[] { 3, 4, 5 })); // Anonymous array


        // Arrays.sort(arr1);

        ArrayList<Integer> arrayList = new ArrayList<>();

        // Append new values
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(15);

        System.out.println(arrayList);
    }
}
