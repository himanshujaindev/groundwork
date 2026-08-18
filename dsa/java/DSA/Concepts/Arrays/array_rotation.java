package DSA.Arrays;
import java.util.Scanner;

import Common.io;

// Right rotation = Move elements towards right

/*
https://www.geeksforgeeks.org/array-rotation/
Juggling ALgo
*/

public class array_rotation {

    public static void main(String[] args) {
        int[] arr = io.readArr();
        int n = arr.length;

        System.out.print("Enter num of pos to rotate = ");
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();

        if (pos > arr.length) {
            pos = pos % arr.length;
        }

        System.out.print("Before Rotation = ");
        io.displayArr(arr);

        // Rotation - Rotate by one
        for (int p = 0; p < pos; p++) {
            int last = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }

        System.out.print("After Rotation = ");
        io.displayArr(arr);
    }

}
