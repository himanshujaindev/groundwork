package Algorithms.Recursion;

import Common.io;

public class power {

    public static int pow(int base, int power) {
        if (power == 0) {
            return 1;
        }

        else if (power == 1) {
            return base;
        }

        else {
            return base * pow(base, power - 1);
        }
    }

    public static void main(String[] args) {
        int base = io.readInt();
        int power = io.readInt();

        int res = pow(base, power);
        io.displayInt(res);
    }
}
