
class Solution {

    private static int fac(int n) {
        if (n == 0) {
            return 1;
        }
        return fac(n - 1) * n;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " = " + fac(n));
    }
}
