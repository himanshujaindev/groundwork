package DataStructures.Collection.Stack;

import java.util.Stack;

public class monotonically_increasing_stack {

    public static int sumSubarrayMins(int[] arr) {
        /*
        // O(n^2)
        int res = 0, n = arr.length, MOD = (int) Math.pow(10, 9) + 7;
        for (int i = 0; i < n; i++) {
            int curMin = Integer.MAX_VALUE;
            for (int j = i; j < n; j++) {
                if (arr[j] < curMin)
                    curMin = arr[j];
                res += curMin;
                res %= MOD;
            }
        }
        return res;
        */

        // O(n)
        int n = arr.length;
        long res = 0, MOD = (long) Math.pow(10, 9) + 7;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || arr[stack.peek()] >= arr[i])) {
                int index = stack.pop();
                int left = stack.empty() ? -1 : stack.peek();
                int right = i;

                long count = (index - left) * (right - index) % MOD;
                res += (count * arr[index]) % MOD;
                res %= MOD;
            }

            stack.push(i);
        }
        return (int) res;
    }

    public static void main(String[] args) {
        System.out.println(sumSubarrayMins(new int[] { 3, 1, 2, 4 }));
    }
}
