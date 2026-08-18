
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
// https://www.geeksforgeeks.org/subset-sum-problem-dp-25/
// https://www.geeksforgeeks.org/perfect-sum-problem-print-subsets-given-sum/
// https://medium.com/@kokitkarjayant/solving-subset-sum-with-negative-numbers-using-dynamic-programming-f823ba3c2560

// Given an array arr[] of non-negative integers and a value sum, the task is to check if there is a subset of the given array whose sum is equal to the given sum. 
public class Subset_Sum_Problem {

    // Recursion - T = o(2^n); s = o(n)
    // isSubsetSum(arr, n, sum) = isSubsetSum(arr, n-1, sum) OR isSubsetSum(arr, n-1, sum – arr[n-1])
    static boolean isSubsetSumRec(int[] arr, int n, int sum) {
        // base case
        if (sum == 0) {
            return true;
        }
        if (n == 0) { // && sum != 0
            return false;
        }

        // elem is greater than sum; ignore it
        if (sum - arr[n - 1] < 0) {
            return isSubsetSumRec(arr, n - 1, sum);
        }

        // including OR excluding the last element
        return isSubsetSumRec(arr, n - 1, sum - arr[n - 1]) || isSubsetSumRec(arr, n - 1, sum);
    }

    // Memorization: T = o(n*sum); S = o(n*sum)
    static boolean isSubsetSumMem(int[] arr, int n, int sum, int[][] memory) {
        // check if already computed
        if (memory[n][sum] != -1) {
            return memory[n][sum] == 1;
        }

        // base case
        if (sum == 0) {
            return true;
        }
        if (n == 0) { // && sum != 0
            return false;
        }

        // elem is greater than sum; ignore it
        if (sum - arr[n - 1] < 0) {
            memory[n][sum] = isSubsetSumMem(arr, n - 1, sum, memory) ? 1 : 0;
        }

        // including OR excluding the last element
        memory[n][sum] = (isSubsetSumRec(arr, n - 1, sum - arr[n - 1]) || isSubsetSumRec(arr, n - 1, sum)) ? 1 : 0;
        return memory[n][sum] == 1;
    }

    // Bottom-Up: T = o(n*sum); S = o(n*sum)
    static boolean[][] isSubsetSumDP(int[] arr, int n, int sum) {
        boolean[][] dp = new boolean[n + 1][sum + 1];
        // i -> n; j -> sum

        // sum = 0
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j - arr[i - 1] < 0) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                }
            }
        }

        // for (boolean[] row : dp) {
        //     System.out.println(Arrays.toString(row));
        // }
        return dp;
    }

    // Space Optimization: T=o(n*sum); S=o(sum)
    // previous row is sufficient (prev and cur arrays)
    static boolean isSubsetSumDPSpaceOpt(int[] arr, int n, int sum) {
        boolean[] prev = new boolean[sum + 1];
        boolean[] cur = new boolean[sum + 1];

        prev[0] = true; // sum = 0; n = 0

        // dp[i - 1] -> prev
        // dp[i] -> cur
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j - arr[i - 1] < 0) {
                    cur[j] = prev[j];
                } else {
                    cur[j] = prev[j - arr[i - 1]] || prev[j];
                }
            }
            // update prev
            System.arraycopy(cur, 0, prev, 0, sum + 1);
        }

        return prev[sum];
    }

    // Backtracking
    // Print: recursively traverse from dp[n][sum] -> Two possibilities
    static void printAllSubsetsRec(int[] arr, int n, int sum, boolean[][] dp, List<Integer> curSubset) {
        // Base case: if sum becomes 0, we've found a subset
        if (sum == 0) {
            Collections.sort(curSubset);
            System.out.println(curSubset);
            return;
        }

        // If no items left or sum is negative, return
        if (n == 0) {
            return;
        }

        // ignore current elem
        if (dp[n - 1][sum]) {
            printAllSubsetsRec(arr, n - 1, sum, dp, new ArrayList<>(curSubset));
        }

        // considering current elem
        if (sum - arr[n - 1] >= 0 && dp[n - 1][sum - arr[n - 1]]) {
            curSubset.add(arr[n - 1]);
            printAllSubsetsRec(arr, n - 1, sum - arr[n - 1], dp, curSubset);
            curSubset.remove(curSubset.size() - 1); // Backtrack
        }
    }

    static void printAllSubsets(int[] arr, int n, int sum, boolean[][] dp) {
        if (dp[n][sum] == false) {
            System.out.println("There are no subsets with" + " sum " + sum);
            return;
        }
        System.out.println("\nPossible Subsets");
        List<Integer> path = new ArrayList<>();
        printAllSubsetsRec(arr, n, sum, dp, path);
    }

    static boolean isSubsetSum(int[] arr, int sum) {

        // Recursion
        boolean res1 = isSubsetSumRec(arr, arr.length, sum);

        // Memorization (Top-Down)
        int[][] memory = new int[arr.length + 1][sum + 1];
        for (int[] row : memory) {
            Arrays.fill(row, -1);
        }
        boolean res2 = isSubsetSumMem(arr, arr.length, sum, memory);

        // Bottom-Up
        boolean[][] dp = isSubsetSumDP(arr, arr.length, sum);

        // Space Optimization
        boolean res = isSubsetSumDPSpaceOpt(arr, arr.length, sum);

        // Print all possible subsets
        printAllSubsets(arr, arr.length, sum, dp);
        return dp[arr.length][sum];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1};
        int sum = 10;
        System.out.println(isSubsetSum(arr, sum));
    }
}
