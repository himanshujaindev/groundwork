
class Solution {

    /*
    only pos nums - entire arr
    even num of neg num - entire arr
    odd num of neg num - remove one neg num -> divide the array into prefix and suffix subarr
    contains 0 - same as above

    {-2, 3, 4, -1, 0, -2, 3, 1, 4, 0, 4, 6, -1, 4} -> {-2, 3, 4, -1}, {-2, 3, 1, 4}, and {4, 6, -1, 4}

    o(n); o(1)
     */
    public int maxProduct(int[] nums) {
        int pre = 1, suf = 1, res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {

            // start with new subarr if 0 is see; all other cases are handled by default;
            if (pre == 0) {
                pre = 1;
            }
            if (suf == 0) {
                suf = 1;
            }
            pre *= nums[i];
            suf *= nums[nums.length - i - 1];

            res = Integer.max(res, Integer.max(pre, suf));
            // System.out.println(pre + " " + suf + " " + res);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.maxProduct(new int[]{-2, 3, 4, -1, 0, -2, 3, 1, 4, 0, 4, 6, -1, 4}));
    }
}
