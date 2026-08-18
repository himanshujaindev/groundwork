
class Solution {

    /*
    dp[i] = d[i-1] + dp[i-2]
    o(n); o(1)
     */
    public int climbStairs(int n) {
        int prev = 1;
        int cur = 2;

        if (n == 1) {
            return prev;
        }

        for (int i = 3; i <= n; i++) {
            int temp = cur;
            cur += prev;
            prev = temp;
        }
        return cur;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.climbStairs(3));
    }
}
