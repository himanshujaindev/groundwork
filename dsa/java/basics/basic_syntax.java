
import java.util.Arrays;

/*
Ref:    https://www.javatpoint.com/java-tutorial
        https://www.javatpoint.com/java-programs 
    
- 1 file -> Multiple classes
- 1 class -> Multiple methods
- 8 Primitive data types in JAVA
    boolean (1 bit)
    char (2 bytes, coz Java uses Unicode system and not ASCII system)
    byte (1 bytes)
    short (2 bytes)
    int (4 bytes)
    long (8 bytes)
    float (4 bytes)
    double (8 bytes)
- Operators
    a++
    !a
    a/b
    a >> 2
    a & b (bitwise)    & -> AND; | -> OR; ^ -> XOR
    a && b (logical)    && -> AND; || -> OR
    c += a + b
- Keywords

 */
public class basic_syntax {

    static int data = 12; // Static Variable

    void method() {
        int data = 11; // Local Variable
    }

    public static void main(String[] args) {
        int data = 10; // Instance variable

        float f = 10.5f;
        int d = (int) f; // Typecasting - Narrowing

        boolean b = true;
        char letter = 'A';

        // Ternary Operator
        boolean res = (data == d) ? true : false;

        // if-else-if ladder
        if (d == data) {
            System.out.println("If");
        } else if (d == 1) {
            System.out.println("Else If");
        } else {
            System.out.println("Else");
        }

        // switch
        switch (d) {
            case 1:
                System.out.println("Case 1");
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default");
        }

        // Loop
        // For loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For Loop = " + i);
        }

        // For each loop
        char[] arr = {'a', 'b', 'c'};
        for (char c : arr) {
            System.out.println("For each loop = " + c);
        }

        // while loop
        int j = 0;
        while (j < 5) {
            System.out.println("While loop = " + j++);
        }

        // do - while loop
        /*
         * 
         * do {
         * // task
         * } while (condition)
         * 
         */
        // Break and Continue
        // Array
        // Declaration and Instantiation
        int[] a = new int[5];
        int[] num_arr = {1, 2, 3, 4, 5};

        System.out.println("Arr = " + Arrays.toString(num_arr));
        int min_val = min(num_arr);

        // 2-D array
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}}; // 2*3 matrix
        System.out.println("Matrix");
        for (int[] oned_arr : matrix) {
            System.out.println(Arrays.toString(oned_arr));
        }

        // Copy an array
        // System.arraycopy(src, srcPos, dest, destPos, length);
        int[] arr1 = {1, 2, 3};
        int[] arr2 = new int[3];
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        System.out.println("Copy array = " + Arrays.toString(arr2));

    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
