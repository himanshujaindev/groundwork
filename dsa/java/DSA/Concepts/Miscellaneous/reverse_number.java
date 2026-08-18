package Algorithms.Miscellaneous;

import Common.io;

public class reverse_number {

    public static int reverseNum(int num) {
        int res = 0;
        while (num != 0) {
            res = res * 10 + (num % 10);
            num = num / 10;
        }

        return res;
    }

    public static void main(String[] args) {
        int num = io.readInt();

        io.displayInt(reverseNum(num));
    }
}
