
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    /*
    o(nlogn + n^2)
    o(1)
     */
    public List<List<Integer>> threeSum(int[] nums) {
        // sort -> fix i -> move j and k to find the target; compare with previous to eleminate duplicates
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            // to skip duplicates
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // System.out.println(i);
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                // System.out.println(j + " " + k + " " + sum);
                if (sum == 0) {
                    res.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
                    j++;
                    k--;

                    // to skip duplicates
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    // to skip duplicates
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }

                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        List<List<Integer>> res = sc.threeSum(new int[]{-2, 0, 1, 1, 2});
        for (List<Integer> resList : res) {
            System.out.println(resList.toString());
        }
    }
}
