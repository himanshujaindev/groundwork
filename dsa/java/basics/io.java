package Common;

import java.util.Arrays;
import java.util.Scanner;

public class io {

    // Int
    public static int readInt() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num = ");
        int num = sc.nextInt();

        return num;
    }

    public static void displayInt(int num) {
        System.out.println(num);
    }

    // Array
    public static int[] readArr() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num of elements = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void displayArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // Matrix
    public static int[][] readMatrix() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num of rows = ");
        int rows = sc.nextInt();

        System.out.print("Enter num of cols = ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements - row vise:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
