
class Solution {

    /*
    dp[i] = max(1, dp[i+1 ... n]) if(nums[i] < nums[i+1 ... n])
    o(n^2); o(n)
     */
    public int lengthOfLIS(int[] nums) {
        int n = nums.length, res = 0;
        int[] dp = new int[n];

        if (n > 0) {
            dp[n - 1] = 1;
            res = 1;
        }

        for (int i = n - 2; i >= 0; i--) {
            int curMax = 1;
            for (int j = i + 1; j < n; j++) {
                if (nums[i] < nums[j]) {
                    curMax = Math.max(curMax, 1 + dp[j]);
                }
            }
            dp[i] = curMax;
            if (res < dp[i]) {
                res = dp[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }
}
