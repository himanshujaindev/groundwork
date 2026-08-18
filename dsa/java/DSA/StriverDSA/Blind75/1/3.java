
import java.util.HashSet;

class Solution {

    /*
    Hashset - o(n); o(n)
     */
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> uniqueNums = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniqueNums.contains(nums[i])) {
                return true;
            }
            uniqueNums.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.containsDuplicate(new int[]{1, 2, 3, 1}));
    }
}
