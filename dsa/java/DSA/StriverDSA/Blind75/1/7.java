
class Solution {

    public int findMin(int[] nums) {

        int low = 0, high = nums.length - 1;

        // sorted array
        if (nums[low] <= nums[high]) {
            return nums[low];
        }

        // binary search
        int res = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            // System.out.println(low + " " + mid + " " + high);
            if (nums[low] <= nums[mid]) {
                res = Math.min(res, nums[low]);
                low = mid + 1;
            } else {
                res = Math.min(res, nums[mid]);
                high = mid;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.findMin(new int[]{2, 1}));
    }
}
