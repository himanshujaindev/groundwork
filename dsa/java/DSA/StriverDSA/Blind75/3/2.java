
import java.util.Arrays;

class Solution {

    // recursive 
    private int fn1(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return Integer.MAX_VALUE;
        }

        int minCoins = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int ans = fn1(coins, amount - coins[i]);
            if (ans != Integer.MAX_VALUE) {
                minCoins = Integer.min(minCoins, 1 + ans);
            }
        }
        return minCoins;
    }

    // memorization
    private int fn(int[] coins, int amount, int[] dp) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return Integer.MAX_VALUE;
        }

        if (dp[amount] != -1) {
            return dp[amount];
        }

        int minCoins = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int ans = fn(coins, amount - coins[i], dp);
            if (ans != Integer.MAX_VALUE) {
                minCoins = Integer.min(minCoins, 1 + ans);
            }
        }
        return dp[amount] = minCoins;
    }

    public int coinChange(int[] coins, int amount) {
        // int[] dp = new int[amount + 1];
        // Arrays.fill(dp, -1);
        // int ans = fn(coins, amount, dp);
        // return ans == Integer.MAX_VALUE ? -1 : ans;

        // dp
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0 && dp[i - coins[j]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                }
            }
        }
        return (dp[amount] == Integer.MAX_VALUE) ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.coinChange(new int[]{1, 2, 5}, 11));
    }
}
