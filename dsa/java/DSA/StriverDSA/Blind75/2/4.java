
class Solution {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expected = 0;
        for (int i = 1; i <= n; i++) {
            expected += i;
        }

        int actual = 0;
        for (int i = 0; i < nums.length; i++) {
            actual += nums[i];
        }

        return expected - actual;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.missingNumber(new int[]{3, 0, 1}));
    }
}
