
import java.util.HashSet;

class Solution {

    /*
    Check if left neighbour exists;
    If it does not, num is the start of suquence. Then, increment one, and check if exists

    o(n); o(n)
     */
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int maxLen = 0;
        for (int num : set) {
            // start of sequence
            if (set.contains(num - 1) == false) {
                int curLen = 0;
                while (set.contains(num + curLen)) {
                    // System.out.println(num + curLen);
                    curLen++;
                }
                maxLen = Math.max(maxLen, curLen);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
}
