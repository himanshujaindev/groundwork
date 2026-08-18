package Algorithms.Sorting;

import Common.io;

// Divide and Conquer algorithm

public class quick_sort {
    public static void main(String[] args) {
        int[] arr = io.readArr();
        System.out.print("Before Sort = ");
        io.displayArr(arr);

        // Algo

        System.out.print("After Sort = ");
        io.displayArr(arr);
    }
}
