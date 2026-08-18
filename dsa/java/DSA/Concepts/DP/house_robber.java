package Algorithms.Dp;

class Solution {

    int bottomUp(int[] nums) {

        int n = nums.length;
        int[] dp = new int[n];

        dp[0] = nums[0];
        if (n > 1)
            dp[1] = nums[1];

        for (int i = 1; i < n; i++) {

            int path1 = nums[i];
            if (i - 2 >= 0)
                path1 = nums[i] + dp[i - 2];

            int path2 = nums[i - 1];
            if (i - 3 >= 0)
                path2 = nums[i - 1] + dp[i - 3];

            dp[i] = Math.max(path1, path2);
        }

        return dp[n - 1];
    }

    int topDown(int[] nums, int[] dp, int i) {
        if (i >= nums.length)
            return 0;

        if (dp[i] != -1)
            return dp[i];

        int path1 = topDown(nums, dp, i + 2) + nums[i];

        int path2 = 0;
        if (i + 1 < nums.length)
            path2 = topDown(nums, dp, i + 3) + nums[i + 1];

        dp[i] = Math.max(path1, path2);
        return dp[i];
    }

    int backtrack(int[] nums, int i) {
        if (i >= nums.length)
            return 0;

        int path1 = backtrack(nums, i + 2) + nums[i];

        int path2 = 0;
        if (i + 1 < nums.length)
            path2 = backtrack(nums, i + 3) + nums[i + 1];

        return Math.max(path1, path2);
    }

    public int rob(int[] nums) {
        // return backtrack(nums, 0);

        /*
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            dp[i] = -1;
        
        return topDown(nums, dp, 0);
        */

        return bottomUp(nums);
    }
}

public class house_robber {
    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.rob(new int[] { 1, 2, 3, 1 }));
    }
}
