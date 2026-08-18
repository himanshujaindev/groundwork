package Algorithms.Searching.BinarySearch;

import Algorithms.Sorting.merge_sort;
import Common.io;

public class binary_search {

    // Recursive
    public static int recursive_bs(int[] arr, int key, int low, int high) { // 1,2,3,4
        int mid = (high + low) / 2;
        if (low <= high) {
            if (key == arr[mid]) {
                return mid;
            } else if (key > arr[mid]) { // 4 > 2
                return recursive_bs(arr, key, mid + 1, high);
            } else {
                return recursive_bs(arr, key, low, mid - 1);
            }
        }
        return -1;
    }

    // Iterative
    public static int iterative_bs(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid = -1;
        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return mid;
    }

    public static void main(String[] args) {

        int[] arr = io.readArr();
        arr = merge_sort.ms(arr, 0, arr.length - 1);
        // Arrays.sort(arr); // Input array must be sorted

        io.displayArr(arr);

        int element = io.readInt();

        // int index = recursive_bs(arr, element, 0, arr.length-1);
        int index = iterative_bs(arr, element);
        System.out.print("Index = ");
        io.displayInt(index);
    }
}
