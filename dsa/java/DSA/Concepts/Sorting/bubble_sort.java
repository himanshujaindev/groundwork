package Algorithms.Sorting;

import Common.io;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = io.readArr();
        System.out.print("Before Sort = ");
        io.displayArr(arr);

        // Algo
        // Swap locally
        // Bubble / Move the largest element to the end

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("After Sort = ");
        io.displayArr(arr);
    }
}
