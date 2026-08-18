
class Solution {

    /*
    Find the lowest num; Maximize the difference
    o(n); o(1)
     */
    public int maxProfit(int[] prices) {
        int lowNum = Integer.MAX_VALUE;
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lowNum) {
                lowNum = prices[i];
            }
            int diff = prices[i] - lowNum;
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
