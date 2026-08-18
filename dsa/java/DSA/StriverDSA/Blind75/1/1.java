
import java.util.Arrays;
import java.util.HashMap;

class Solution {

    /*
    Brute force: o(n2); o(1)
    Hashing (target - nums[i]): o(n); o(n)
    Sort -> Two Pointer:  O(N) + O(N*logN) ; o(1)
     */
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2]; // [num1, num2]
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int anotherNum = target - nums[i];
            if (hm.containsKey(anotherNum)) {
                res[0] = hm.get(anotherNum);
                res[1] = i;
            }
            hm.put(nums[i], i);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(Arrays.toString(sc.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
