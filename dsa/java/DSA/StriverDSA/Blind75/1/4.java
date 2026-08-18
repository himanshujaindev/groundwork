
import java.util.Arrays;

class Solution {

    /*
    calculate left product and right product, without including nums[i]. then multiply these left and right product
    prefix = [1, 1, 2, 6]
    sufix = [24, 12, 4, 1]
     */
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] res = new int[nums.length];
        int suffix = 1;
        Arrays.fill(prefix, 1);

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i - 1] * prefix[i - 1];
        }

        res[nums.length - 1] = suffix * prefix[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix = nums[i + 1] * suffix;
            res[i] = prefix[i] * suffix;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(Arrays.toString(sc.productExceptSelf(new int[]{1, 2, 3, 4})));
    }
}
