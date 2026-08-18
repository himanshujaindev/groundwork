package Algorithms.Sorting;

import Common.io;

// Divide and Conquer algorithm

public class merge_sort {

    public static void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = 0;
        int[] merge = new int[arr.length];

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                merge[k++] = arr[i++];
            } else {
                merge[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            merge[k++] = arr[i++];
        }

        while (j <= high) {
            merge[k++] = arr[j++];
        }

        // Copy merge to original arr from low to high
        j = low;
        for (i = 0; i < k; i++) {
            arr[j++] = merge[i];
        }
    }

    public static int[] ms(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            ms(arr, low, mid);
            ms(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = io.readArr();
        System.out.print("Before Sort = ");
        io.displayArr(arr);

        // Algo
        arr = ms(arr, 0, arr.length - 1);

        System.out.print("After Sort = ");
        io.displayArr(arr);
    }
}
