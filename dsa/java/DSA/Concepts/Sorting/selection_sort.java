package Algorithms.Sorting;

import Common.io;

class selection_sort {
    public static void main(String[] args) {
        int[] arr = io.readArr();
        System.out.print("Before Sort = ");
        io.displayArr(arr);

        // Algo
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("After Sort = ");
        io.displayArr(arr);
    }
}
