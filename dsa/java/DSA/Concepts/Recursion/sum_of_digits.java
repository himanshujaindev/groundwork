package Algorithms.Recursion;

import java.util.Scanner;

/* 
354
/ 10 -> 35 ; % 10 -> 4
/ 10 -> 3 ; % 10 -> 5
/10 -> 0
*/

public class sum_of_digits {

    static int res = 0;

    public static int sod(int digits, int res) {

        int q = digits / 10;
        int rem = digits % 10;

        if (q < 10) {
            return res + rem + q;
        }

        else {
            return sod(q, res + rem);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        int res = sod(digit, 0);
        System.out.println("Result = " + res);
    }
}
