package Algorithms.Recursion;

import java.util.Scanner;

public class fibonacci {
    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();

        // 0 1 1 2 3 5
        fibonacci f = new fibonacci();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int res = f.fibonacci(i);
            System.out.print(res + " ");
            sum += res;
        }

        System.out.println("Sum = " + sum);

    }
}
